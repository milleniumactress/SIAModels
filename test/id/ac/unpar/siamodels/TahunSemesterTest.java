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
     * Test of constructor, of class TahunSemester.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorTahunSemesterInvalid() {
        TahunSemester instance = new TahunSemester("163");
    }
    
    /**
     * Test of constructor, of class TahunSemester.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetSemesterInvalid() {
        TahunSemester instance = new TahunSemester("169");
        Semester sm = instance.getSemester();
        Semester expResult = null;
        assertEquals(expResult, sm);
    }
    
    /**
     * Test of constructor with 2 parametres, of class TahunSemester.
     */
    @Test
    public void testConstructorSemesterGanjil() {
        Semester sm = Semester.GANJIL;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test of constructor with 2 parametres, of class TahunSemester.
     */
    @Test
    public void testConstructorSemesterGenap() {
        Semester sm = Semester.GENAP;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test of constructor with 2 parametres, of class TahunSemester.
     */
    @Test
    public void testConstructorSemesterPendek() {
        Semester sm = Semester.PENDEK;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test of constructor with 2 parametres, of class TahunSemester.
     */
    @Test
    public void testConstructorSemesterUnkown5() {
        Semester sm = Semester.UNKNOWN5;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test of constructor with 2 parametres, of class TahunSemester.
     */
    @Test
    public void testConstructorSemesterTransfer() {
        Semester sm = Semester.TRANSFER;
        TahunSemester ts = new TahunSemester(2016,sm);
    }
    
    /**
     * Test of getSemester method, of class TahunSemester.
     */
    @Test
    public void testGetSemesterGanjil() {
        TahunSemester instance = new TahunSemester("161");
        Semester expResult = Semester.GANJIL;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getSemester method, of class TahunSemester.
     */
    @Test
    public void testGetSemesterGenap() {
        TahunSemester instance = new TahunSemester("162");
        Semester expResult = Semester.GENAP;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    
     /**
     * Test of getSemester method, of class TahunSemester.
     */
    @Test
    public void testGetSemesterPendek() {
        TahunSemester instance = new TahunSemester("164");
        Semester expResult = Semester.PENDEK;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getSemester method, of class TahunSemester.
     */
    @Test
    public void testGetSemesterUnkown5() {
        TahunSemester instance = new TahunSemester("165");
        Semester expResult = Semester.UNKNOWN5;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getSemester method, of class TahunSemester.
     */
    @Test
    public void testGetSemesterTransfer() {
        TahunSemester instance = new TahunSemester("166");
        Semester expResult = Semester.TRANSFER;
        Semester result = instance.getSemester();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTahun method, of class TahunSemester.
     */
    @Test
    public void testGetTahun() {
        TahunSemester instance = new TahunSemester("172");
        int expResult = 2017;
        int result = instance.getTahun();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKodeDPS method, of class TahunSemester.
     */
    @Test
    public void testGetKodeDPS() {
        TahunSemester instance = new TahunSemester("181");
        String expResult = "181";
        String result = instance.getKodeDPS();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class TahunSemester.
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
     * Test of compareTo method, of class TahunSemester.
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
     * Test of compareTo method, of class TahunSemester.
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
     * Test of compareTo method, of class TahunSemester.
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
     * Test of equals method, of class TahunSemester.
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
     * Test of equals method, of class TahunSemester.
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
     * Test of toString method, of class TahunSemester.
     */
    @Test
    public void testToString() {
        TahunSemester instance = new TahunSemester("161");
        String expResult = "TahunSemester [2016/GANJIL]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
