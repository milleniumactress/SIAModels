/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIAModels.src.main.java.id.ac.unpar.siamodels;

import id.ac.unpar.siamodels.MataKuliah;
import id.ac.unpar.siamodels.MataKuliahFactory;
import id.ac.unpar.siamodels.matakuliah.AIF101;
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
public class MataKuliahFactoryTest {
    
    public MataKuliahFactoryTest() {
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

//    /**
//     * Test of getInstance method, of class MataKuliahFactory.
//     */
//    @Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        MataKuliahFactory instance = MataKuliahFactory.getInstance();
//        MataKuliahFactory expResult = instance;
//        MataKuliahFactory result = MataKuliahFactory.getInstance();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_3args() {
        System.out.println("createMataKuliah");
        String kode = "AIF152";
        int sks = 3;
        String nama = "abcdef";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah result = instance.createMataKuliah(kode, sks, nama);
        MataKuliah expResult = instance.createMataKuliah("AIF152");
        assertEquals(expResult, result);
    }

    /**
     * Test of createMataKuliah method, of class MataKuliahFactory.
     */
    @Test
    public void testCreateMataKuliah_String() {
        System.out.println("createMataKuliah");
        String expResult = "AIF101";
        String kode = "AIF101";
        MataKuliahFactory instance = MataKuliahFactory.getInstance();
        MataKuliah mk = instance.createMataKuliah(kode);
        String result = mk.getKode();
        assertEquals(expResult, result);
    }
    
}
