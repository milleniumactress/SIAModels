/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels.prodi.teknikinformatika;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.MataKuliahFactory;
import id.ac.unpar.siamodels.TahunSemester;
import id.ac.unpar.siamodels.matakuliah.AIF101;
import id.ac.unpar.siamodels.matakuliah.AIF102;
import id.ac.unpar.siamodels.matakuliah.AIF103;
import id.ac.unpar.siamodels.matakuliah.MKU003;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131101;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131102;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131105;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF132202;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF132205;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF132206;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF133315;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF181100;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF181101;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF181103;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF181104;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF181105;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF181106;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF181107;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF181202;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182007;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182100;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182101;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182103;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182105;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182106;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182109;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182112;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182204;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182210;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182302;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF182308;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183002;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183010;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183106;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183107;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183111;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183117;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183201;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183204;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183209;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183300;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183303;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183305;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183308;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183348;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184000;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184001;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184002;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184004;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184005;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184108;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184114;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184115;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184116;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184123;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184125;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184339;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184341;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184344;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.MKU130004;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.MKU180110;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.MKU180120;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.MKU180130;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.MKU180240;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.MKU180250;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.MKU180360;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.MKU180380;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184110;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183120;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184119;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184106;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184121;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184108;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184109;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF184114;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF183116;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.MKU130003;
import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amabel
 */
public class KelulusanTest {
    
    private int getSemester(int i)
    {
        if((i+1)%2==1)
        {
            return 1;
        }
        else
        {
            return 2;
        }
    }
    
    int tahun = 6;
    int tempTahun = 0;
    
    /**
     * Tes lulus untuk mahasiswa angkatan 2016
     * 1. Lulus 144 sks
     * 2. Mengambil salah satu MK Agama
     * 3. Mengambil mata kuliah Proyek Informatika / Proyek Informasi 1 dan 2
     * 4. Mengambil mata kuliah Skripsi 1 dan Skripsi 2 / Tugas Akhir
     * 5. Nilai Toefl diatas 500
     */
    @Test
    public void testCheckPrasyaratLulus2016() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2016.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2016[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2016[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes lulus untuk mahasiswa angkatan 2017
     * 1. Lulus 144 sks
     * 2. Mengambil salah satu MK Agama
     * 3. Mengambil mata kuliah Proyek Informatika / Proyek Informasi 1 dan 2
     * 4. Mengambil mata kuliah Skripsi 1 dan Skripsi 2 / Tugas Akhir
     * 5. Nilai Toefl diatas 500
     */
    @Test
    public void testCheckPrasyaratLulus2017() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2017730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2017.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2017[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2017[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU130003(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes lulus untuk mahasiswa angkatan 2015
     * 1. Lulus 144 sks
     * 2. Mengambil salah satu MK Agama
     * 3. Mengambil mata kuliah Proyek Informatika / Proyek Informasi 1 dan 2
     * 4. Mengambil mata kuliah Skripsi 1 dan Skripsi 2 / Tugas Akhir
     * 5. Nilai Toefl diatas 500
     */
    @Test
    public void testCheckPrasyaratLulusDibawah2016() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2015730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2015 yang belum lulus salah satu MK Wajib
     */
    @Test
    public void testCheckPrasyaratTidakLulusMKWajibDibawah2016() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2015730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015.length-1;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length-1;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2015 yang belum lulus salah satu MK Wajib Equivalen
     */
    @Test
    public void testCheckPrasyaratTidakLulusMKWajibEquivalenDibawah2016() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2015730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=1;i<Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=1;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes lulus untuk mahasiswa angkatan 2015 yang belum lulus MK Agama kurikulum 2013
     */
    @Test
    public void testCheckPrasyaratTidakLulusMKAgamaDibawah2016() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2015730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015.length-1;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2011_SAMPAI_2015[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length-1;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2017 yang belum mengambil salah satu MK Wajib
     */
    @Test
    public void testCheckPrasyaratTidakLulusMKWajib2017() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2017730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2017.length-1;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2017[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2017[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length-1;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2017 yang belum mengambil matakuliah wajib equivalent
     */
    @Test
    public void testCheckPrasyaratTidakLulusMKWajibEquivalen2017() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2017730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=1;i<Kelulusan.WAJIB_ANGKATAN_2017.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2017[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2017[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=1;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2016 yang tidak lulus 144 sks
     */
    @Test
    public void testCheckPrasyaratTidakLulus144SKS() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2017.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2017[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2017[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        mahasiswa.calculateSKSLulus();
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2016 yang tidak mengambil salah satu MK Agama
     */
    @Test
    public void testCheckPrasyaratTidakMengambilMKAgama() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2016.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2016[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2016[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2016 yang tidak mengambil Proyek Informatika / Proyek Sistem informasi 1 dan 2
     */
    @Test
    public void testCheckPrasyaratTidakLulusMKProyek() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2016.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2016[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2016[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183116(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF184108(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF184109(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF184114(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("191"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("191"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2016 yang mengambil toefl kurang dari 8 kali 
     * dan belum mendapat nilai 500
     */
    @Test
    public void testCheckPrasyaratTidakLulusToeflDibawah500() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2016.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2016[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2016[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(499));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes lulus untuk mahasiswa angkatan 2016 dan sudah mengambil toefllebih dari 8
     * dan nilai terbaiknya lebih dari 450
     */
    @Test
    public void testCheckPrasyaratLulusToeflDispensasi() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2016.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2016[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2016[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        for(int i=1;i<10;i++)
        {
            nilaiTOEFL.put(LocalDate.of(2000, 1, i), 450);
        }
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2016 dan sudah mengambil toefl lebih dari 8
     * dan nilai terbaiknya masih dibawah 450
     */
    @Test
    public void testCheckPrasyaratTidakLulusToeflLebihDari8() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2016.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2016[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2016[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        for(int i=1;i<10;i++)
        {
            nilaiTOEFL.put(LocalDate.of(2000, 1, i), 449);
        }
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2016 yang belum Toefl
     */
    @Test
    public void testCheckPrasyaratTidakLulusBelumToefl() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2016.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2016[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2016[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        mahasiswa.setNilaiTOEFL(null);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa angkatan 2016 yang belum mengambil skripsi 1
     */
    @Test
    public void testCheckPrasyaratTidakLulusSkripsi1() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        for(int i=0;i<Kelulusan.WAJIB_ANGKATAN_2016.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB_ANGKATAN_2016[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB_ANGKATAN_2016[i][j]), "A"));
            }   
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.WAJIB.length;i++)
        {
            for(int j=0;j<Kelulusan.WAJIB[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.WAJIB[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183116(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF184108(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF184109(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF184114(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("191"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("191"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes untuk mahasiswa dibawah angkatan 2017 yang belum mengambil MK wajib , dan MKU
     */
    @Test
    public void testCheckPrasyaratTidakLulusMKU2016() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU180380(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes tidak lulus untuk mahasiswa 2019 yang belum mengambil MK Wajib
     */
    @Test
    public void testCheckPrasyaratTidakLulusMKWajib2019() {
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2019730041");
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
                
        tahun = 6;
        
        for(int i=0;i<Kelulusan.MKU.length;i++)
        {
            for(int j=0;j<Kelulusan.MKU[i].length;j++)
            {
                mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("1" + tahun + getSemester(i)), mkf.createMataKuliah(Kelulusan.MKU[i][j]), "A"));
            }
            tempTahun++;
            if(tempTahun==2)
            {
                tahun++;
            }
        }
        
        //semester 3
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU130003(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184110(), "A"));
        
        //semester 6
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF183120(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184108(), "A"));
        
        //semester 7
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184121(), "A"));
        
        //semester 8
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("192"), new AIF184004(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new AIF184106(), "A"));
        
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(600));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
}
