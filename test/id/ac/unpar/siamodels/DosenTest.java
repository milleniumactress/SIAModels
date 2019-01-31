/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import id.ac.unpar.siamodels.Dosen;
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
public class DosenTest {
    
    public DosenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNik method, of class Dosen.
     */
    @Test
    public void testGetNik() {
        System.out.println("getNik");
        Dosen instance = new Dosen("12345678","A");
        String expResult = "12345678";
        String result = instance.getNik();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNik method, of class Dosen.
     */
    @Test
    public void testSetNik() {
        System.out.println("setNik");
        String nik = "12345678";
        Dosen instance = new Dosen("23456789", "B");
        instance.setNik(nik);
        assertEquals(nik, instance.getNik());
    }

    /**
     * Test of getNama method, of class Dosen.
     */
    @Test
    public void testGetNama() {
        System.out.println("getNama");
        Dosen instance = new Dosen("123","ABC");
        String expResult = "ABC";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNama method, of class Dosen.
     */
    @Test
    public void testSetNama() {
        System.out.println("setNama");
        String nama = "ABCD";
        Dosen instance = new Dosen("12345678","BCDE");
        instance.setNama(nama);
        assertEquals(nama, instance.getNama());
    }

    /**
     * Test of equals method, of class Dosen.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Dosen("12345678", "ABC");
        Dosen instance = new Dosen("12345678", "ABC");
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
}
