/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asus a455l
 */
public class TahunSemesterTest {
    /**
     * Test constructor dari kelas TahunSemester, dengan input semester yang tidak valid
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTahunSemesterInvalid() {
        TahunSemester instance = new TahunSemester("163");
    }
    
    /**
     * Test constructor dari kelas TahunSemester yang dua parameter, dengan input semester ganjil
     */
    @Test
    public void testConstructorSemesterGanjil() {
        Semester sm = Semester.GANJIL;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test constructor dari kelas TahunSemester yang dua parameter, dengan input semester genap
     */
    @Test
    public void testConstructorSemesterGenap() {
        Semester sm = Semester.GENAP;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test constructor dari kelas TahunSemester yang dua parameter, dengan input semester pendek
     */
    @Test
    public void testConstructorSemesterPendek() {
        Semester sm = Semester.PENDEK;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test constructor dari kelas TahunSemester yang dua parameter, dengan input semester unknown5
     */
    @Test
    public void testConstructorSemesterUnknown5() {
        Semester sm = Semester.UNKNOWN5;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test constructor dari kelas TahunSemester yang dua parameter, dengan input semester transfer
     */
    @Test
    public void testConstructorSemesterTransfer() {
        Semester sm = Semester.TRANSFER;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test method getSemester dari kelas TahunSemester, dengan mengembalikan semester ganjil
     */
    @Test
    public void testGetSemesterGanjil() {
        TahunSemester instance = new TahunSemester("161");
        Semester expResult = Semester.GANJIL;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    
    /**
     * Test method getSemester dari kelas TahunSemester, dengan mengembalikan semester genap
     */
    @Test
    public void testGetSemesterGenap() {
        TahunSemester instance = new TahunSemester("162");
        Semester expResult = Semester.GENAP;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    
     /**
     * Test method getSemester dari kelas TahunSemester, dengan mengembalikan semester pendek
     */
    @Test
    public void testGetSemesterPendek() {
        TahunSemester instance = new TahunSemester("164");
        Semester expResult = Semester.PENDEK;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    
    /**
     * Test method getSemester dari kelas TahunSemester, dengan mengembalikan semester unknown5
     */
    @Test
    public void testGetSemesterUnknown5() {
        TahunSemester instance = new TahunSemester("165");
        Semester expResult = Semester.UNKNOWN5;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    
    /**
     * Test method getSemester dari kelas TahunSemester, dengan mengembalikan semester transfer
     */
    @Test
    public void testGetSemesterTransfer() {
        TahunSemester instance = new TahunSemester("166");
        Semester expResult = Semester.TRANSFER;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    
    /**
     * Test method getSemester dari kelas TahunSemester, dengan input semester yang tidak valid
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSemesterInvalid() {
        TahunSemester instance = new TahunSemester("169");
        Semester sm = instance.getSemester();
        Semester expResult = null;
        assertEquals(expResult, sm);
    }

    /**
     * Test method getTahun dari kelas TahunSemester
     */
    @Test
    public void testGetTahun() {
        TahunSemester instance = new TahunSemester("172");
        int expResult = 2017;
        int result = instance.getTahun();
        assertEquals(expResult, result);
    }

    /**
     * Test method getKodeDPS dari kelas TahunSemester
     */
    @Test
    public void testGetKodeDPS() {
        TahunSemester instance = new TahunSemester("181");
        String expResult = "181";
        String result = instance.getKodeDPS();
        assertEquals(expResult, result);
    }

    /**
     * Test method compareTo dari kelas TahunSemester, dengan TahunSemester yang dibandingkan tahunnya lebih kecil
     */
    @Test
    public void testCompareToTahunLebihKecil() {
        TahunSemester o = new TahunSemester("161");
        TahunSemester instance = new TahunSemester("171");
        int expResult = 1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    
    /**
     * Test method compareTo dari kelas TahunSemester, dengan TahunSemester yang dibandingkan tahunnya lebih besar
     */
    @Test
    public void testCompareToTahunLebihBesar() {
        TahunSemester o = new TahunSemester("171");
        TahunSemester instance = new TahunSemester("161");
        int expResult = -1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    
    /**
     * Test method compareTo dari kelas TahunSemester, dengan TahunSemester yang dibandingkan ordernya lebih besar
     */
    @Test
    public void testCompareToOrderLebihBesar() {
        TahunSemester o = new TahunSemester("162");
        TahunSemester instance = new TahunSemester("161");
        int expResult = -1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    
    /**
     * Test method compareTo dari kelas TahunSemester, dengan TahunSemester yang dibandingkan ordernya lebih kecil
     */
    @Test
    public void testCompareToOrderLebihKecil() {
        TahunSemester o = new TahunSemester("161");
        TahunSemester instance = new TahunSemester("162");
        int expResult = 1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }

    /**
     * Test method equals dari kelas TahunSemester, dengan objek yang dibandingkan beda instance
     */
    @Test
    public void testEqualsBedaInstance() {
        Object obj = new Mahasiswa("2016730002");
        TahunSemester instance = new TahunSemester("161");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test method equals dari kelas TahunSemester, dengan objek yang dibandingkan beda tahun
     */
    @Test
    public void testEqualsBedaTahun() {
        Object obj = new TahunSemester("171");
        TahunSemester instance = new TahunSemester("161");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test method toString dari kelas TahunSemester
     */
    @Test
    public void testToString() {
        TahunSemester instance = new TahunSemester("161");
        String expResult = "TahunSemester [2016/GANJIL]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
