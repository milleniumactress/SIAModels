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
 * @author i16050
 */
public class SemesterTes {

    public SemesterTes() {
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
     * Test of values method, of class Semester.
     */
    @Test
    public void testValues() {
        Semester[] expResult = Semester.values();
        Semester[] result = Semester.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Semester.
     */
    @Test
    public void testValueOfUnknown() {
        String name = "UNKNOWN5";
        Semester expResult = Semester.UNKNOWN5;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testValueOfPendek() {
        String name = "PENDEK";
        Semester expResult = Semester.PENDEK;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testValueOfGanjil() {
        String name = "GANJIL";
        Semester expResult = Semester.GANJIL;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testValueOfGenap() {
        String name = "GENAP";
        Semester expResult = Semester.GENAP;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    @Test
    public void testValueOfTransfer() {
        String name = "TRANSFER";
        Semester expResult = Semester.TRANSFER;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test of fromString method, of class Semester.
     */
    @Test
    public void testFromStringUnknown() {
        String text = "UNKNOWN5";
        Semester expResult = Semester.UNKNOWN5;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    @Test
    public void testFromStringPendek() {
        String text = "PENDEK";
        Semester expResult = Semester.PENDEK;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    @Test
    public void testFromStringGanjil() {
        String text = "GANJIL";
        Semester expResult = Semester.GANJIL;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    @Test
    public void testFromStringGenap() {
        String text = "GENAP";
        Semester expResult = Semester.GENAP;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    @Test
    public void testFromStringTransfer() {
        String text = "TRANSFER";
        Semester expResult = Semester.TRANSFER;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrder method, of class Semester.
     */
    @Test
    public void testGetOrderUnknown() {
        Semester instance = Semester.fromString("UNKNOWN5");
        int expResult = 5;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOrderPendek() {
        Semester instance = Semester.fromString("PENDEK");
        int expResult = 10;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOrderGanjil() {
        Semester instance = Semester.fromString("GANJIL");
        int expResult = 20;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOrderGenap() {
        Semester instance = Semester.fromString("GENAP");
        int expResult = 30;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOrderTransfer() {
        Semester instance = Semester.fromString("TRANSFER");
        int expResult = 6;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

}
