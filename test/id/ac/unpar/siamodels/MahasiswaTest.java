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
    
    public MahasiswaTest() {

    }

  

    /**
     * Test of calculateIPTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPTempuh() {
        System.out.println("calculateIPTempuh");
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//6
        double expResult = 4.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calculateIPKumulatif method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPKumulatif() {
        System.out.println("calculateIPKumulatif");
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
     * Test of calculateIPS method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPS() {
        System.out.println("calculateIPS");
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//6
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131102(),"B"));//4
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131105(), "C"));//3
        double expResult = 42.0 / 13.0;
        double result = instance.calculateIPS();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of calculateSKSLulus method, of class Mahasiswa.
     */
    @Test
    public void testCalculateSKSLulus() {
        System.out.println("calculateSKSLulus");
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
     * Test of calculateSKSTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateSKSTempuh() {
        System.out.println("calculateSKSTempuh");
        boolean lulusSaja = false;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//6
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131102(),"B"));//4
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131105(), "C"));//3
        int expResult = 13;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
        /**
     * Test of calculateSKSTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateSKSTempuhE() {
        System.out.println("calculateSKSTempuh");
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"E"));//6
        int expResult = 0;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
            /**
     * Test of calculateSKSTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateSKSTempuhKosong() {
        System.out.println("calculateSKSTempuh");
        boolean lulusSaja = false;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),""));//6
        int expResult = 0;
        int result = instance.calculateSKSTempuh(lulusSaja);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    
    

    /**
     * Test of calculateTahunSemesterAktif method, of class Mahasiswa.
     */
    @Test
    public void testCalculateTahunSemesterAktif() {
        System.out.println("calculateTahunSemesterAktif");
        Mahasiswa instance = new Mahasiswa("2016730041");
        TahunSemester tahunSemester=new TahunSemester("161");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(tahunSemester, new AIF131101(),"A"));//6 
        Set<TahunSemester> expResult = new TreeSet<TahunSemester>();
        expResult.add(tahunSemester);
        Set<TahunSemester> result = instance.calculateTahunSemesterAktif();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hasLulusKuliah method, of class Mahasiswa.
     */
    @Test
    public void testHasLulusKuliah() {
        System.out.println("hasLulusKuliah");
        String kodeMataKuliah = "AIF101";
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF101(),"E"));//6 
        boolean expResult = false;
        boolean result = instance.hasLulusKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
    }

    /**
     * Test of getNama method, of class Mahasiswa.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.setNama("abcd");
        String expResult = "abcd";
        String result = instance.getNama();
        assertEquals(expResult, result);
        
    }


    /**
     * Test of getNpm method, of class Mahasiswa.
     */
    @Test
    public void testGetNpm() {
        System.out.println("getNpm");
        Mahasiswa instance = new Mahasiswa("2016730041");
        String expResult = "2016730041";
        String result = instance.getNpm();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPhotoPath method, of class Mahasiswa.
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
     * Test of getEmailAddress method, of class Mahasiswa.
     */
    @Test
    public void testGetEmailAddress() {
        Mahasiswa instance = new Mahasiswa("2016730041");
        String expResult = "7316041@student.unpar.ac.id";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }
    
    @Test(expected=NumberFormatException.class)
    public void testGetEmailAddressFalse() {
        Mahasiswa instance = new Mahasiswa("56879890");
        String expResult = "@student.unpar.ac.id";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetEmailAddressAngkatan2018() {
        Mahasiswa instance = new Mahasiswa("6181801021");
        String expResult = "6181801021@student.unpar.ac.id";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of getRiwayatNilai method, of class Mahasiswa.
//     */
//    @Test
//    public void testGetRiwayatNilai() {
//        List<Mahasiswa.Nilai> listNilai=new LinkedList<>();
//        listNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"),new AIF131101(),"A"));
//        
//        Mahasiswa instance = new Mahasiswa("2016730041");
//        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"),new AIF131101(),"A"));
//        List<Mahasiswa.Nilai> expResult = listNilai;
//        List<Mahasiswa.Nilai> result = instance.getRiwayatNilai();
//        assertEquals(expResult, result);
//    }



}
