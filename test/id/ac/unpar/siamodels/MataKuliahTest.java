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
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.*;

/**
 *
 * @author Richard
 */
public class MataKuliahTest {
    
    private MataKuliah mataKuliah;    
    
    public MataKuliahTest() {
        this.mataKuliah = new MataKuliah("AIF183114","Algoritma Kriptografi",3);
    }

    /**
     * Test of getKode method, of class MataKuliah.
     */
    @Test
    public void testGetKode() {
        String expResult = "AIF183114";
        assertEquals(expResult, this.mataKuliah.getKode());
    }

    /**
     * Test of getNama method, of class MataKuliah.
     */
    @Test
    public void testGetNama() {
        String expResult = "Algoritma Kriptografi";
        assertEquals(expResult, this.mataKuliah.getNama());
    }

    /**
     * Test of getSks method, of class MataKuliah.
     */
    @Test
    public void testGetSks() {
        Integer expResult = 3;
        assertEquals(expResult, this.mataKuliah.getSks());
    }

    /**
     * Test of equals method, of class MataKuliah.
     */
    @Test
    public void testEqualsBedaKode() {
        Object o = (MataKuliah) new MataKuliah("AIF131101","Pemrograman Berorientasi Objek",6);
        boolean expResult = false;
        boolean result = this.mataKuliah.equals(o);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsBedaNama() {
        Object o = (MataKuliah) new MataKuliah("AIF183114","Pemrograman Berorientasi Objek",6);
        boolean expResult = false;
        boolean result = this.mataKuliah.equals(o);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEqualsBedaSKS() {
        Object o = (MataKuliah) new MataKuliah("AIF131101","Algoritma Kriptografi",6);
        boolean expResult = false;
        boolean result = this.mataKuliah.equals(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class MataKuliah.
     */
    @Test
    public void testEquals() {
        Object o = null;
        MataKuliah instance = new MataKuliah();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
