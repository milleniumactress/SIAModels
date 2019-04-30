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
public class SemesterTest {

    /**
     * Test method testValues dari kelas Semester, untuk melihat seluruh isi
     * values pada kelas semester
     */
    @Test
    public void testValues() {
        Semester[] expResult = Semester.values();
        Semester[] result = Semester.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test method testValues dari kelas Semester, untuk melihat isi values dari
     * UNKNOWN5
     */
    @Test
    public void testValueOfUnknown() {
        String name = "UNKNOWN5";
        Semester expResult = Semester.UNKNOWN5;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test method testValues dari kelas Semester, untuk melihat isi values dari
     * PENDEK
     */
    @Test
    public void testValueOfPendek() {
        String name = "PENDEK";
        Semester expResult = Semester.PENDEK;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test method testValues dari kelas Semester, untuk melihat isi values dari
     * GANJIL
     */
    @Test
    public void testValueOfGanjil() {
        String name = "GANJIL";
        Semester expResult = Semester.GANJIL;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test method testValues dari kelas Semester, untuk melihat isi values dari
     * GENAP
     */
    @Test
    public void testValueOfGenap() {
        String name = "GENAP";
        Semester expResult = Semester.GENAP;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test method testValues dari kelas Semester, untuk melihat isi values dari
     * TRANSFER
     */
    @Test
    public void testValueOfTransfer() {
        String name = "TRANSFER";
        Semester expResult = Semester.TRANSFER;
        Semester result = Semester.valueOf(name);
        assertEquals(expResult, result);
    }

    /**
     * Test method fromString dari kelas Semester, untuk melihat isi dari string
     * dari UNKOWN5
     */
    @Test
    public void testFromStringUnknown() {
        String text = "UNKNOWN5";
        Semester expResult = Semester.UNKNOWN5;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    /**
     * Test method fromString dari kelas Semester, untuk melihat isi dari string
     * dari PENDEK
     */
    @Test
    public void testFromStringPendek() {
        String text = "PENDEK";
        Semester expResult = Semester.PENDEK;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    /**
     * Test method fromString dari kelas Semester, untuk melihat isi dari string
     * dari GANJIL
     */
    @Test
    public void testFromStringGanjil() {
        String text = "GANJIL";
        Semester expResult = Semester.GANJIL;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    /**
     * Test method fromString dari kelas Semester, untuk melihat isi dari string
     * dari GENAP
     */
    @Test
    public void testFromStringGenap() {
        String text = "GENAP";
        Semester expResult = Semester.GENAP;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    /**
     * Test method fromString dari kelas Semester, untuk melihat isi dari string
     * dari TRANSFER
     */
    @Test
    public void testFromStringTransfer() {
        String text = "TRANSFER";
        Semester expResult = Semester.TRANSFER;
        Semester result = Semester.fromString(text);
        assertEquals(expResult, result);
    }

    /**
     * Test method getOrder dari kelas Semester, dengan mengembalikan nilai dari
     * UNKNOWN5
     */
    @Test
    public void testGetOrderUnknown() {
        Semester instance = Semester.fromString("UNKNOWN5");
        int expResult = 5;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

    /**
     * Test method getOrder dari kelas Semester, dengan mengembalikan nilai dari
     * PENDEK
     */
    @Test
    public void testGetOrderPendek() {
        Semester instance = Semester.fromString("PENDEK");
        int expResult = 10;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

    /**
     * Test method getOrder dari kelas Semester, dengan mengembalikan nilai dari
     * GANJIL
     */
    @Test
    public void testGetOrderGanjil() {
        Semester instance = Semester.fromString("GANJIL");
        int expResult = 20;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

    /**
     * Test method getOrder dari kelas Semester, dengan mengembalikan nilai dari
     * GENAP
     */
    @Test
    public void testGetOrderGenap() {
        Semester instance = Semester.fromString("GENAP");
        int expResult = 30;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

    /**
     * Test method getOrder dari kelas Semester, dengan mengembalikan nilai dari
     * TRANSFER
     */
    @Test
    public void testGetOrderTransfer() {
        Semester instance = Semester.fromString("TRANSFER");
        int expResult = 6;
        int result = instance.getOrder();
        assertEquals(expResult, result);
    }

}
