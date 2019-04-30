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
public class DosenTest {
    /**
     * Test constructor dari kelas Dosen
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorDosen() {
        Dosen instance = new Dosen(null,null);
        Dosen instance2 = new Dosen(null,"ab");
        Dosen instance3 = new Dosen("123456",null);
        Dosen instance4 = new Dosen("1234567","abc");
        Dosen instance5 = new Dosen(null,"");
        boolean expResult = false;
        boolean result = instance.equals(instance4);
        assertEquals(expResult, result);
    }

    /**
     * Test method getNik dari kelas Dosen
     */
    @Test
    public void testGetNik() {
        Dosen instance = new Dosen("12345678","A");
        String expResult = "12345678";
        String result = instance.getNik();
        assertEquals(expResult, result);
    }

    /**
     * Test method setNik dari kelas Dosen
     */
    @Test
    public void testSetNik() {
        String nik = "12345678";
        Dosen instance = new Dosen("23456789", "B");
        instance.setNik(nik);
        assertEquals(nik, instance.getNik());
    }

    /**
     * Test method getNama dari kelas Dosen
     */
    @Test
    public void testGetNama() {
        Dosen instance = new Dosen("123","ABC");
        String expResult = "ABC";
        String result = instance.getNama();
        assertEquals(expResult, result);
    }

    /**
     * Test method setNama dari kelas Dosen
     */
    @Test
    public void testSetNama() {
        String nama = "ABCD";
        Dosen instance = new Dosen("12345678","BCDE");
        instance.setNama(nama);
        assertEquals(nama, instance.getNama());
    }

    /**
     * Test method equals dari kelas Dosen, dibandingkan dengan objek yang sama
     */
    @Test
    public void testEqualsObjSama() {
        Object obj = new Dosen("12345678", "ABC");
        Dosen instance = (Dosen)obj;
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test method equals dari kelas Dosen, dibandingkan dengan objek null
     */
    @Test
    public void testEqualsObjNull() {
        Object obj = null;
        Dosen instance = new Dosen("12345678", "ABC");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test method equals dari kelas Dosen, dibandingkan dengan objek yang kelasnya beda
     */
    @Test
    public void testEqualsObjBedaKelas() {
        Mahasiswa obj = new Mahasiswa("2016730002");
        Dosen instance = new Dosen("12345678", "ABC");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test method equals dari kelas Dosen, dibandingkan dengan objek yang namanya null
     */
    @Test
    public void testEqualsObjNamaNull() {
        Dosen instance = new Dosen(null, "abc");
        Object obj = new Dosen("12345678", null);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test method equals dari kelas Dosen, dibandingkan dengan objek yang niknya null
     */
    @Test
    public void testEqualsObjNIKNull() {
        Dosen instance = new Dosen("12345678",null);
        Object obj = new Dosen(null, "ABC");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
}
