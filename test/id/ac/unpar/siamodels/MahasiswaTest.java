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

//    /**
//     * Test of calculateIPKLulus method, of class Mahasiswa.
//     */
//    @Test
//    public void testCalculateIPKLulus() {
//        System.out.println("calculateIPKLulus");
//        Mahasiswa instance = new Mahasiswa("2016730041");
//        double expResult = 0.0;
//        double result = instance.calculateIPKLulus();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
////        fail("The test case is a prototype.");
//    }
    /**
     * Test of calculateIPTempuh method, of class Mahasiswa.
     */
    @Test
    public void testCalculateIPTempuh() {
        System.out.println("calculateIPTempuh");
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//6
        double expResult = 3.0;
        double result = instance.calculateIPTempuh(lulusSaja);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
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
        double expResult = 40.0 / 13.0;
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
        int expResult = 23;
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
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of hasTempuhKuliah method, of class Mahasiswa.
     */
    @Test
    public void testHasTempuhKuliah() {
        System.out.println("hasTempuhKuliah");
        String kodeMataKuliah = "AIF102";
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF101(),"A"));//6 
        boolean expResult = false;
        boolean result = instance.hasTempuhKuliah(kodeMataKuliah);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTahunAngkatan method, of class Mahasiswa.
     */
    @Test
    public void testGetTahunAngkatan() {
        System.out.println("getTahunAngkatan");
        Mahasiswa instance = new Mahasiswa("2016730041");
        int expResult = 2016;
        int result = instance.getTahunAngkatan();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of toString method, of class Mahasiswa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.setNama("ravi");
        String expResult = "Mahasiswa [npm=" + "2016730041" + ", nama=" + "ravi" + "]";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
