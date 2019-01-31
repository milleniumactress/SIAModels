/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels.prodi.teknikinformatika;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.TahunSemester;
import id.ac.unpar.siamodels.matakuliah.AIF101;
import id.ac.unpar.siamodels.matakuliah.AIF102;
import id.ac.unpar.siamodels.matakuliah.AIF103;
import id.ac.unpar.siamodels.matakuliah.MKU003;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Amabel
 */
public class KelulusanTest {
    
    public KelulusanTest() {
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
     * Test of checkPrasyarat method, of class Kelulusan.
     */
    @Test
    public void testCheckPrasyarat() {
        System.out.println("checkPrasyarat");
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF101(), 'A', 70.0, 70.0, 70.0, 'B'));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("172"), new AIF102(), 'A', 90.0, 90.0, 90.0, 'A'));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU003(), 'A', 67.0, 68.0, 66.0, 'C'));
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(300));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckPrasyaratGagal() {
        System.out.println("checkPrasyarat");
        List<String> reasonsContainer = new LinkedList<>();
        Mahasiswa mahasiswa = new Mahasiswa("2016730041");
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF101(), 'A', 70.0, 70.0, 70.0, 'B'));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("172"), new AIF102(), 'A', 90.0, 90.0, 90.0, 'A'));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("171"), new MKU003(), 'A', 67.0, 68.0, 66.0, 'C'));
        TreeMap<LocalDate,Integer> nilaiTOEFL = new TreeMap<LocalDate,Integer>();
        nilaiTOEFL.put(LocalDate.MIN, new Integer(300));
        mahasiswa.setNilaiTOEFL(nilaiTOEFL);
        Kelulusan instance = new Kelulusan();
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}
