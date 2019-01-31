package id.ac.unpar.siamodels;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeSet;

public class Mahasiswa {
	protected final String npm;
	protected String nama;
	protected final List<Nilai> riwayatNilai;
	protected String photoPath;
	protected List<JadwalKuliah> jadwalKuliahList;
	protected SortedMap<LocalDate, Integer> nilaiTOEFL;
	
	public Mahasiswa(String npm) throws NumberFormatException {
		super();
		if (!npm.matches("[0-9]{10}")) {
			throw new NumberFormatException("NPM tidak valid: " + npm);
		}
		this.npm = npm;
		this.riwayatNilai = new ArrayList<Nilai>();
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getNpm() {
		return npm;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	
	public List<JadwalKuliah> getJadwalKuliahList() {
		return jadwalKuliahList;
	}

	public void setJadwalKuliahList(List<JadwalKuliah> jadwalKuliahList) {
		this.jadwalKuliahList = jadwalKuliahList;
	}

	public String getEmailAddress() {
		if (npm.matches("[2]{1}[0]{1}\\d{8}") && Integer.parseInt(npm.substring(0,4)) < 2017){
			return npm.substring(4, 6) + npm.substring(2, 4) + npm.substring(7, 10) + "@student.unpar.ac.id";
		} else {
			return npm + "@student.unpar.ac.id";
		}
	}
	
	public List<Nilai> getRiwayatNilai() {
		return riwayatNilai;
	}
	
	public SortedMap<LocalDate, Integer> getNilaiTOEFL(){
		return nilaiTOEFL;
	}
	
	public void setNilaiTOEFL(SortedMap<LocalDate, Integer> nilaiTOEFL){
		this.nilaiTOEFL = nilaiTOEFL;
	}

	/**
	 * Menghitung IPK mahasiswa sampai saat ini, dengan aturan:
	 * <ul>
	 *   <li>Kuliah yang tidak lulus tidak dihitung
	 *   <li>Jika pengambilan beberapa kali, diambil <em>nilai terbaik</em>.
	 * </ul>
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah mengandung nilai per mata kuliah!
	 * @return IPK Lulus, atau {#link {@link Double#NaN}} jika belum mengambil satu kuliah pun.
	 * @deprecated Gunakan {@link #calculateIPLulus()}, nama lebih konsisten dengan DPS. 
	 */
	public double calculateIPKLulus() throws ArrayIndexOutOfBoundsException {
		return calculateIPTempuh(true);
	}

	/**
	 * Menghitung IP mahasiswa sampai saat ini, dengan aturan:
	 * <ul>
	 *   <li>Kuliah yang tidak lulus tidak dihitung
	 *   <li>Jika pengambilan beberapa kali, diambil <em>nilai terbaik</em>.
	 * </ul>
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah mengandung nilai per mata kuliah!
	 * @return IPK Lulus, atau {#link {@link Double#NaN}} jika belum mengambil satu kuliah pun.
	 */
	public double calculateIPLulus() throws ArrayIndexOutOfBoundsException {
		return calculateIPTempuh(true);
	}
	
	/**
	 * Menghitung IP mahasiswa sampai saat ini, dengan aturan:
	 * <ul>
	 *   <li>Perhitungan kuliah yang tidak lulus ditentukan parameter
	 *   <li>Jika pengambilan beberapa kali, diambil <em>nilai terbaik</em>.
	 * </ul>
	 * @param lulusSaja set true jika ingin membuang mata kuliah tidak lulus, false jika ingin semua (sama dengan "IP N. Terbaik" di DPS)
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah mengandung nilai per mata kuliah!
	 * @return IPK Lulus, atau {#link {@link Double#NaN}} jika belum mengambil satu kuliah pun.
	 */
	public double calculateIPTempuh(boolean lulusSaja) throws ArrayIndexOutOfBoundsException {
		List<Nilai> riwayatNilai = getRiwayatNilai();
		if (riwayatNilai.size() == 0) {
			return Double.NaN;
		}		
		Map<String, Double> nilaiTerbaik = new HashMap<String, Double>();
		int totalSKS = 0;
		// Cari nilai lulus terbaik setiap kuliah
		for (Nilai nilai: riwayatNilai) {
			if (nilai.getNilaiAkhir().equals("")) {
				continue;
			}
			if (lulusSaja && nilai.getNilaiAkhir().equals("E")) {
				continue;
			}
			String kodeMK = nilai.getMataKuliah().getKode();
			Double angkaAkhir = nilai.getAngkaAkhir();
			int sks = nilai.getMataKuliah().getSks();
			if (!nilaiTerbaik.containsKey(kodeMK)) {
				totalSKS += sks;
				nilaiTerbaik.put(kodeMK, sks * angkaAkhir);
			} else if (sks * angkaAkhir > nilaiTerbaik.get(kodeMK)) {
				nilaiTerbaik.put(kodeMK, sks * angkaAkhir);
			}
		}
		// Hitung IPK dari nilai-nilai terbaik
		double totalNilai = 0.0;
		for (Double nilaiAkhir: nilaiTerbaik.values()) {
			totalNilai += nilaiAkhir;
		}
		return totalNilai / totalSKS;
	}

	/**
	 * Menghitung IP Kumulatif mahasiswa sampai saat ini, dengan aturan:
	 * <ul>
	 *   <li>Jika pengambilan beberapa kali, diambil semua.
	 * </ul>
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah mengandung nilai per mata kuliah!
	 * @return IPK Lulus, atau {#link {@link Double#NaN}} jika belum mengambil satu kuliah pun.
	 */
	public double calculateIPKumulatif() throws ArrayIndexOutOfBoundsException {
		List<Nilai> riwayatNilai = getRiwayatNilai();
		if (riwayatNilai.size() == 0) {
			return Double.NaN;
		}
		double totalNilai = 0.0;
		int totalSKS = 0;
		// Cari nilai setiap kuliah
		for (Nilai nilai: riwayatNilai) {
			if (nilai.getNilaiAkhir().equals("")) {
				continue;
			}
			Double angkaAkhir = nilai.getAngkaAkhir();
			int sks = nilai.getMataKuliah().getSks();
			totalSKS += sks;
			totalNilai += sks * angkaAkhir;
		}
		return totalNilai / totalSKS;
	}
	
	/**
	 * Menghitung IPK mahasiswa sampai saat ini, dengan aturan:
	 * <ul>
	 *   <li>Perhitungan kuliah yang tidak lulus ditentukan parameter
	 *   <li>Jika pengambilan beberapa kali, diambil <em>nilai terbaik</em>.
	 * </ul>
	 * @param lulusSaja set true jika ingin membuang mata kuliah tidak lulus 
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah mengandung nilai per mata kuliah!
	 * @return IPK Lulus, atau {#link {@link Double#NaN}} jika belum mengambil satu kuliah pun.
	 * @deprecated Gunakan {@link #calculateIPKTempuh(boolean)}, nama lebih konsisten dengan DPS.
	 */
	public double calculateIPKTempuh(boolean lulusSaja) throws ArrayIndexOutOfBoundsException {
		return calculateIPTempuh(lulusSaja);
	}

	
	/**
	 * Menghitung IPS semester terakhir sampai saat ini, dengan aturan:
	 * <ul>
	 *   <li>Kuliah yang tidak lulus <em>dihitung</em>.
	 * </ul>
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah mengandung nilai per mata kuliah!
	 * @return nilai IPS sampai saat ini
	 * @throws ArrayIndexOutOfBoundsException jika belum ada nilai satupun
	 */
	public double calculateIPS() throws ArrayIndexOutOfBoundsException {
		List<Nilai> riwayatNilai = getRiwayatNilai();
		if (riwayatNilai.size() == 0) {
			throw new ArrayIndexOutOfBoundsException("Minimal harus ada satu nilai untuk menghitung IPS");
		}
		int lastIndex = riwayatNilai.size() - 1;
		TahunSemester tahunSemester = riwayatNilai.get(lastIndex).getTahunSemester();
		double totalNilai = 0;
		double totalSKS = 0;
		for (int i = lastIndex; i >= 0; i--) {
			Nilai nilai = riwayatNilai.get(i);
			if (nilai.tahunSemester.equals(tahunSemester)) {
				if (nilai.getAngkaAkhir() != null) {
					totalNilai += nilai.getMataKuliah().getSks() * nilai.getAngkaAkhir();
					totalSKS += nilai.getMataKuliah().getSks();
				}
			} else {
				break;
			}
		}
		return totalNilai / totalSKS;
	}
	
	/**
	 * Menghitung jumlah SKS lulus mahasiswa saat ini.
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah mengandung nilai per mata kuliah!
	 * @return SKS Lulus
	 */
	public int calculateSKSLulus() throws ArrayIndexOutOfBoundsException {
		return calculateSKSTempuh(true);
	}
	
	/**
	 * Menghitung jumlah SKS tempuh mahasiswa saat ini.
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah mengandung nilai per mata kuliah!
	 * @param lulusSaja set true jika ingin membuang SKS tidak lulus
	 * @return SKS tempuh
	 */
	public int calculateSKSTempuh(boolean lulusSaja) throws ArrayIndexOutOfBoundsException {
		List<Nilai> riwayatNilai = getRiwayatNilai();
		Set<String> sksTerhitung = new HashSet<String>();
		int totalSKS = 0;
		// Tambahkan SKS setiap kuliah
		for (Nilai nilai: riwayatNilai) {
			if (nilai.getNilaiAkhir().equals("")) {
				continue;
			}
			if (lulusSaja && nilai.getNilaiAkhir().equals("E")) {
				continue;
			}
			String kodeMK = nilai.getMataKuliah().getKode();
			if (!sksTerhitung.contains(kodeMK)) {
				totalSKS += nilai.getMataKuliah().getSks();
				sksTerhitung.add(kodeMK);
			}			
		}
		return totalSKS;
	}
	
	/**
	 * Mendapatkan seluruh tahun semester di mana mahasiswa ini tercatat
	 * sebagai mahasiswa aktif, dengan strategi memeriksa riwayat nilainya.
	 * Jika ada satu nilai saja pada sebuah tahun semester, maka dianggap
	 * aktif pada semester tersebut.
	 * @return kumpulan tahun semester di mana mahasiswa ini aktif
	 */
	public Set<TahunSemester> calculateTahunSemesterAktif() {
		Set<TahunSemester> tahunSemesterAktif = new TreeSet<TahunSemester>();
		List<Nilai> riwayatNilai = getRiwayatNilai();
		for (Nilai nilai: riwayatNilai) {
			tahunSemesterAktif.add(nilai.getTahunSemester());
		}
		return tahunSemesterAktif;
	}
	
	/**
	 * Memeriksa apakah mahasiswa ini sudah lulus mata kuliah tertentu. Kompleksitas O(n).
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah mengandung nilai per mata kuliah!
	 * Note: jika yang dimiliki adalah {@link MataKuliah}, gunakanlah {@link MataKuliah#getKode()}.
	 * @param kodeMataKuliah kode mata kuliah yang ingin diperiksa kelulusannya.
	 * @return true jika sudah pernah mengambil dan lulus, false jika belum
	 */
	public boolean hasLulusKuliah(String kodeMataKuliah) {
		for (Nilai nilai: riwayatNilai) {
			if (nilai.getMataKuliah().getKode().equals(kodeMataKuliah)) {
				String na = nilai.getNilaiAkhir();
				if (!na.equals("") && na.compareTo("A") >= 0 && na.compareTo("D") <= 0) {
					return true;
				}
			}
		}
		return false;
	}

	public Double getNilaiAkhirMataKuliah(String kodeMataKuliah){
		Double aa = 0.0;
		for (Nilai nilai: riwayatNilai) {
			if (nilai.getMataKuliah().getKode().equals(kodeMataKuliah)) {
				aa = nilai.getAngkaAkhir();
				return aa;
			}
		}
		return aa;
	}

	/**
	 * Memeriksa apakah mahasiswa ini sudah pernah menempuh mata kuliah tertentu. Kompleksitas O(n).
	 * Sebelum memanggil method ini, {@link #getRiwayatNilai()} harus sudah ada isinya!
	 * Note: jika yang dimiliki adalah {@link MataKuliah}, gunakanlah {@link MataKuliah#getKode()}.
	 * @param kodeMataKuliah kode mata kuliah yang ingin diperiksa.
	 * @return true jika sudah pernah mengambil, false jika belum
	 */
	public boolean hasTempuhKuliah(String kodeMataKuliah) {
		for (Nilai nilai: riwayatNilai) {
			if (nilai.getMataKuliah().getKode().equals(kodeMataKuliah)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Mendapatkan tahun angkatan mahasiswa ini, berdasarkan NPM nya
	 * @return tahun angkatan
	 */
	public int getTahunAngkatan() {
		return Integer.parseInt(getNpm().substring(0, 4));
	}
	
	@Override
	public String toString() {
		return "Mahasiswa [npm=" + npm + ", nama=" + nama + "]";
	}
	
	/**
	 * Merepresentasikan nilai yang ada di riwayat nilai mahasiswa
	 * @author pascal
	 *
	 */
	public static class Nilai {
		/** Tahun dan Semester kuliah ini diambil */
		protected final TahunSemester tahunSemester;
		/** Mata kuliah yang diambil */
		protected final MataKuliah mataKuliah;
		/** Nilai Akhir */
		protected final String nilaiAkhir;

		public Nilai(TahunSemester tahunSemester, MataKuliah mataKuliah, String nilaiAkhir) {
			super();
			this.tahunSemester = tahunSemester;
			this.mataKuliah = mataKuliah;
			this.nilaiAkhir = nilaiAkhir;
		}

		public MataKuliah getMataKuliah() {
			return mataKuliah;
		}

		/**
		 * Mengembalikan nilai akhir dalam bentuk huruf (A, B, C, D, ..., atau K)
		 * @return nilai akhir dalam huruf, atau null jika tidak ada.
		 */
		public String getNilaiAkhir() {
			return nilaiAkhir;
		}
		
		/**
		 * Mendapatkan nilai akhir dalam bentuk angka
		 * @return nilai akhir dalam angka, atau null jika {@link #getNilaiAkhir() mengembalikan 'K' atau null}
		 */
		public Double getAngkaAkhir() {
			if (nilaiAkhir.equals("")) {
				return null;
			}
			switch (nilaiAkhir) {
			case "A":
				return 4.0;
			case "A-":
				return 3.67;
			case "B+":
				return 3.33;
			case "B":
				return 3.0;
			case "B-":
				return 2.67;
			case "C+":
				return 2.33;
			case "C":
				return 2.0;
			case "C-":
				return 1.67;
			case "D":
				return 1.0;
			case "E":
				return 0.0;
			case "K":
				return null;
			}
			return null;
		}

		public TahunSemester getTahunSemester() {
			return tahunSemester;
		}

		public int getTahunAjaran() {
			return tahunSemester.getTahun();
		}
		
		public Semester getSemester() {
			return tahunSemester.getSemester();
		}

		@Override
		public String toString() {
			return "Nilai [tahunSemester=" + tahunSemester + ", mataKuliah=" + mataKuliah + ", nilaiAkhir="
					+ nilaiAkhir + "]";
		}

		/**
		 * Pembanding antara satu nilai dengan nilai lainnya, secara
		 * kronologis waktu pengambilan.
		 * @author pascal
		 *
		 */
		public static class ChronologicalComparator implements Comparator<Nilai> {

			@Override
			public int compare(Nilai o1, Nilai o2) {
				return o1.getTahunSemester().compareTo(o2.getTahunSemester());
			}
		}
	}
}
