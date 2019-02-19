/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import id.ac.unpar.siamodels.matakuliah.AIF101;
import id.ac.unpar.siamodels.matakuliah.AIF102;
import id.ac.unpar.siamodels.matakuliah.AIF103;
import id.ac.unpar.siamodels.matakuliah.AIF104;
import id.ac.unpar.siamodels.matakuliah.AIF105;
import id.ac.unpar.siamodels.matakuliah.AIF106;
import id.ac.unpar.siamodels.matakuliah.AIF181;
import id.ac.unpar.siamodels.matakuliah.AIF201;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131101;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131102;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131105;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131106;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131181;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131191;
import java.net.URL;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Muhammad Ravi
 */
public class MahasiswaTest {

    /**
     * Tes menghitung Indeks Prestasi (IP) yang telah ditempuh dan semuanya lulus.
     */
    @Test
    public void testCalculateIPTempuh() {
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//6
        double expResult = 4.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Tes menghitung Indeks Prestasi (IP) jika mahasiswa belum memiliki riwayat nilai.
     * contoh; Mahasiswa Baru
     */
    @Test
    public void testCalculateIPTempuhKosong() {
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        double expResult=Double.NaN;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Tes menghitung Indeks Prestasi (IP) jika nilai belum keluar.
     */
    @Test
    public void testCalculateIPTempuhNilaiBelumKeluar() {
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),""));//6
        double expResult=Double.NaN;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Tes menghitung Indeks Prestasi (IP) yang tidak lulus saja jika mahasiswa Memiliki nilai yang tidak lulus.
   
     */
    @Test
    public void testCalculateIPTempuhLulusSajaFalseDanAdaE() {
        boolean lulusSaja = false;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131102(),"E"));//3
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//6
        double expResult=24.0/10.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Tes menghitung Indeks Prestasi (IP) yang lulus saja jika mahasiswa Memiliki nilai yang tidak lulus.
   
     */
    @Test
    public void testCalculateIPTempuhLulusSajaTrueDanAdaE() {
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131102(),"E"));//3
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//3
        double expResult=4.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);

    }
    
    /**
     * Tes menghitung Indeks Prestasi (IP) jika Mahasiswa mengambil mata kuliah lebih dari 2 kali dan tidak ada nilai terbaik.
   
     */
    @Test
    public void testCalculateIPTempuTidakAdaNilaiTerbaik() {
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"C"));//6
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131101(),"C"));//6
        double expResult=2.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);

    }
    
        /**
     * Tes menghitung Indeks Prestasi (IP) jika Mahasiswa mengambil mata kuliah lebih dari 2 kali dan ada nilai terbaik.
   
     */
    @Test
    public void testCalculateIPTempuAdaNilaiTerbaik() {
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"C"));//6
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131101(),"A"));//6
        double expResult=4.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Tes menghitung Indeks Prestasi Kumulatif(IPK) dengan semua nilai tidak lulus
     */
    @Test
    public void testCalculateIPKumulatif() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//6
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131102(),"B"));//4
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131105(), "C"));//3
        double expResult = 42.0 / 13.0;
        double result = instance.calculateIPKumulatif();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Tes menghitung Indeks Prestasi Kumulatif(IPK) jika nilai kosong (size=0)
     */
    @Test
    public void testCalculateIPKumulatifNilaiKosong() {
        Mahasiswa instance = new Mahasiswa("2016730041");
         instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131105(), ""));//3
        double expResult = Double.NaN;
        double result = instance.calculateIPKumulatif();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        /**
     * Tes menghitung Indeks Prestasi Kumulatif(IPK) jika nilai belum Keluar
     */
    @Test
    public void testCalculateIPKumulatifNilaiBelumKeluar() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        double expResult = Double.NaN;
        double result = instance.calculateIPKumulatif();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Tes untuk menghitugng Indeks prestasi semester (IPS) dengan semua matkul lulus
     */
    @Test
    public void testCalculateIPS() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A")); 
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131102(),"A-"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131105(),"B+"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("162"), new AIF131106(),"B"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("162"), new AIF131181(),"B-"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("162"), new AIF131181(),"C+"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131191(),"C"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131191(),"C-"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131191(),"D"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131191(),"E"));
        double expResult = 1.1675;
        double result = instance.calculateIPS();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        /**
     * Tes untuk menghitugng Indeks prestasi semester (IPS) jika nilai kosong
     */
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testCalculateIPSKosong() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        double expResult = Double.NaN;
        double result = instance.calculateIPS();
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Tes untuk menghitugng Indeks prestasi semester (IPS) jika nilai belum keluar
     */
    @Test
    public void testCalculateIPSNilaiBelumKeluar() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),""));//4
        double expResult = Double.NaN;
        double result = instance.calculateIPS();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Tes untuk menghitung SKS yang telah ditempuh mahasiswa yang lulusnya saja.
     */
    @Test
    public void testCalculateSKSLulus() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//6
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131102(),"B"));//4
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131105(), "C"));//3
        int expResult = 13;
        int result = instance.calculateSKSLulus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Tes untuk menghitung SKS yang telah ditempuh mahasiswa yang lulus dan tidak lulus.
     */
    @Test
    public void testCalculateSKSTempuh() {
        boolean lulusSaja = false;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A")); 
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131102(),"A-"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131105(),"B+"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("162"), new AIF131106(),"B"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("162"), new AIF131181(),"B-"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("162"), new AIF131181(),"C+"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131191(),"C"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131191(),"C-"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131191(),"D"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131191(),"E"));
        int expResult = 22;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes untuk menhitung SKS yang ditempuh mahasiswa jika semua nilainya E.
     */
    @Test
    public void testCalculateSKSTempuhE() {
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"E"));//6
        int expResult = 0;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
            /**
     * Tes untuk menghitung SKS yang telah ditempuh mahasiswa dan belum ada nilainya.
     */
    @Test
    public void testCalculateSKSTempuhKosong() {
        boolean lulusSaja = false;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),""));//6
        int expResult = 0;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
    }
    
    
    

    /**
     * Tes untuk menghitung tahun semester aktif yang telah ditempuh oleh mahasiswa.
     */
    @Test
    public void testCalculateTahunSemesterAktif() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        TahunSemester tahunSemester=new TahunSemester("161");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(tahunSemester, new AIF131101(),"A"));//6 
        Set<TahunSemester> expResult = new TreeSet<TahunSemester>();
        expResult.add(tahunSemester);
        Set<TahunSemester> result = instance.calculateTahunSemesterAktif();
        assertEquals(expResult, result);
    }

    /**
     * Tes untuk mengetahui apakah mahasiswa telah lulus mata kuliah tertentu.
     */
    @Test
    public void testHasLulusKuliah() {
        String kodeMataKuliah = "AIF101";
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"E"));//6 
        boolean expResult = false;
        boolean result = instance.hasLulusKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
    }

    /**
     * Tes untuk mengambil nama mahasiswa.
     */
    @Test
    public void testGetNama() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.setNama("abcd");
        String expResult = "abcd";
        String result = instance.getNama();
        assertEquals(expResult, result);
        
    }


    /**
     * Tes untuk mengambil NPM mahasiswa.
     */
    @Test
    public void testGetNpm() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        String expResult = "2016730041";
        String result = instance.getNpm();
        assertEquals(expResult, result);
    }

    /**
     * Tes untuk mengambil alamat file foto mahasiswa.
     */
    @Test
    public void testGetPhotoPath() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.setPhotoPath("googledrive\2016730041");
        String expResult = "googledrive\2016730041";
        String result = instance.getPhotoPath();
        assertEquals(expResult, result);
    
    }



    /**
     * tes untuk mengambil alamat email mahasiswa angkatan 2017 ke bawah.
     * NPM sesuai dengan ketentuan
     */
    @Test
    public void testGetEmailAddress() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        String expResult = "7316041@student.unpar.ac.id";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }
     /**
     * tes untuk mengambil alamat email mahasiswa dan NPM tidak sesuai ketentuan.
     */
    @Test(expected=NumberFormatException.class)
    public void testGetEmailAddressFalse() {
        Mahasiswa instance = new Mahasiswa("56879890");
        String expResult = "@student.unpar.ac.id";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }
    
     /**
     * tes untuk mengambil alamat email mahasiswa angkatan 2017 ke bawah.
     * NPM sesuai dengan ketentuan
     */
    @Test
    public void testGetEmailAddressAngkatan2018() {
        Mahasiswa instance = new Mahasiswa("6181801021");
        String expResult = "6181801021@student.unpar.ac.id";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }


    /**
     * Test mengambil nilai akhir mata kuliah
     */
    @Test
    public void testGetNilaiAkhirMataKuliah() {
        String kodeMataKuliah = "AIF131101";
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A")); 
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131102(),"B-"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131105(),"A-"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF131106(),"B+")); 
        Double expResult = 4.0;
        Double result = instance.getNilaiAkhirMataKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
    }
    
        /**
     * Test mengambil nilai akhir mata kuliah jika nilai kosong
     */
    @Test
    public void testGetNilaiAkhirMataKuliahKosong() {
        String kodeMataKuliah = "AIF131101";
        Mahasiswa instance = new Mahasiswa("2016730041"); 
        Double expResult = 0.0;
        Double result = instance.getNilaiAkhirMataKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
    }

    /**
     * tes kuliah yang telah ditempuh mahasiswa jika true
     */
    @Test
    public void testHasTempuhKuliahTrue() {
        String kodeMataKuliah = "AIF131101";
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A")); 
        boolean expResult = true;
        boolean result = instance.hasTempuhKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
        
    }
    
    /**
     * tes kuliah yang telah ditempuh mahasiswa jika false
     */
    @Test
    public void testHasTempuhKuliahFalse() {
        String kodeMataKuliah = "AIF131102";
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A")); 
        boolean expResult = false;
        boolean result = instance.hasTempuhKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
        
    }
    

    /**
     * tes untuk mengambil tahun angkatan mahasiswa.
     */
    @Test
    public void testGetTahunAngkatan() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A")); 
        int expResult = 2016;
        int result = instance.getTahunAngkatan();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class Mahasiswa.
     */
    @Test
    public void testToString() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.setNama("abcd");
        String expResult = "Mahasiswa [npm=2016730041, nama=abcd]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
//    
//       /**
//     * Test of getJadwalKuliahList method, of class Mahasiswa.
//     */
//    @Test
//    public void testGetJadwalKuliahList() {
//        System.out.println("getJadwalKuliahList");
//        Mahasiswa instance = null;
//        List<JadwalKuliah> expResult = null;
//        List<JadwalKuliah> result = instance.getJadwalKuliahList();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }


    /**
     * Tes untuk menghitung IP kumulatif  mahsiswa sampai saat ini
     */
    @Test
    public void testCalculateIPKLulus() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"B")); 
        double expResult = 3.0;
        double result = instance.calculateIPKLulus();
        assertEquals(expResult, result, 0.0);
    
    }

    /**
     * Test untuk Menghitung IP mahasiswa sampai saat ini.
     * dengan aturan hanya nilai yang lulus saja yang dihitung
     */
    @Test
    public void testCalculateIPLulus() {
        Mahasiswa instance = new Mahasiswa("2016730042");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"B"));
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"E")); 
        double expResult = 3.0;
        double result = instance.calculateIPLulus();
        assertEquals(expResult, result, 0.0);
    }

//    /**
//     * Tes untuk Menghitung IP mahasiswa sampai saat ini.
//     * dengan aturan semua nilai, termasuk yang tidak lulus, dihitung
//     */
//    @Test
//    public void testCalculateIPKTempuh() {
//        boolean lulusSaja = false;
//        Mahasiswa instance = null;
//        double expResult = 0.0;
//        double result = instance.calculateIPKTempuh(lulusSaja);
//        assertEquals(expResult, result, 0.0);
//    }

}
