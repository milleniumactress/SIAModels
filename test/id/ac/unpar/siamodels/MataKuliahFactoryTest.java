/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author asus a455l
 */
public class MataKuliahFactoryTest {
    /**
     * Test of getInstance method, of class MataKuliahFactory.
     */
    @Test
    public void testGetInstance() {
        MataKuliahFactory expResult = MataKuliahFactory.getInstance();
        MataKuliahFactory result = MataKuliahFactory.getInstance();
        assertEquals(expResult, result);
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_3args() {
        String kode = "AIF131101";
        int sks = 3;
        String nama = "abcdef";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah result = instance.createMataKuliah(kode, sks, nama);
        MataKuliah expResult = instance.createMataKuliah("AIF131101");
        assertEquals(expResult, result);
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_String() {
        String expResult = "AIF131101";
        String kode = "AIF131101";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah mk = instance.createMataKuliah(kode);
        String result = mk.getKode();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test(expected = IllegalStateException.class)
    public void testCreateMataKuliah_StringNotFound() {
        String expResult = "AIF131101123123";
        String kode = "AIF131101123123";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah mk = instance.createMataKuliah(kode);
        String result = mk.getKode();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test(expected = IllegalStateException.class)
    public void testCreateMataKuliah_3argsNotFound() {
        String expResult = "AIF1311011231234";
        String kode = "AIF1311011231234";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah mk = instance.createMataKuliah(kode);
        String result = mk.getKode();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test(expected = IllegalStateException.class)
    public void testCreateMataKuliah_3argsNotFound2() {
        String expResult = "AIF123456";
        String kode = "AIF123456";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah mk = instance.createMataKuliah(kode);
        String result = mk.getKode();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_3argsUpdateInfo() {
        String expResult = "AIF131101";
        String kode = "AIF131101";
        int sks = 2;
        String nama = "PBO";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah mk = instance.createMataKuliah(kode, sks, nama);
        String result = mk.getKode();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_3args2() {
        String kode = "AIF13110123";
        int sks = 7;
        String nama = "abcdefgh";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah result = instance.createMataKuliah(kode, sks, nama);
        MataKuliah expResult = instance.createMataKuliah("AIF13110123");
        assertEquals(expResult, result);
    }
}
