/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import java.time.DayOfWeek;
import java.time.LocalTime;
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
public class JadwalKuliahTest {
        
    public JadwalKuliahTest() {
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
     * Test of setMataKuliah method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetMataKuliahNull() {
        System.out.println("setMataKuliah");
        MataKuliah mataKuliah = null;
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah exp = null;
        assertEquals(exp,instance.getMataKuliah());
    }
    
    @Test
    public void testSetGetMataKuliahWajib2013() {
        System.out.println("setMataKuliahWajib2013");
        MataKuliah mataKuliah = new AIF131101();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new AIF131101();
        assertEquals(expected,instance.getMataKuliah());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetGetMataKuliahWajib2018() {
        System.out.println("setMataKuliahWajib2018");
        MataKuliah mataKuliah = new AIF181100();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new AIF181100();
        assertEquals(expected,instance.getMataKuliah());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetGetMataKuliahPilihan() {
        System.out.println("setMataKuliahPilihan");
        MataKuliah mataKuliah = new AIF184121();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new AIF184121();
        assertEquals(expected,instance.getMataKuliah());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetGetMataKuliahUmum() {
        System.out.println("setMataKuliahUmum");
        MataKuliah mataKuliah = new MKU180370();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new MKU180370();
        assertEquals(expected,instance.getMataKuliah());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getKelas method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetKelasNull() {
        System.out.println("getKelasNull");
        JadwalKuliah instance = new JadwalKuliah();
        Character expResult = null;
        Character result = instance.getKelas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setKelas method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetKelasValid() {
        System.out.println("setKelasValid");
        Character kelas = 'A';
        JadwalKuliah instance = new JadwalKuliah();
        instance.setKelas(kelas);
        Character exp = 'A';
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(exp,instance.getKelas());
    }

    /**
     * Test of setHari method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetHari() {
        System.out.println("setHari");
        DayOfWeek hari = DayOfWeek.TUESDAY;
        JadwalKuliah instance = new JadwalKuliah();
        instance.setHari(hari);
        DayOfWeek exp = DayOfWeek.TUESDAY;
        assertEquals(exp,instance.getHari());
    }

    /**
     * Test of setWaktuMulai method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetWaktuMulai() {
        System.out.println("setWaktuMulai");
        LocalTime waktuMulai = LocalTime.of(9,0);
        JadwalKuliah instance = new JadwalKuliah();
        instance.setWaktuMulai(waktuMulai);
        LocalTime exp = LocalTime.of(9,0);
        assertEquals(exp,instance.getWaktuMulai());
    }

    /**
     * Test of getWaktuMulai method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetWaktuSelesai() {
        System.out.println("getWaktuMulai");
        JadwalKuliah instance = new JadwalKuliah();
        instance.setWaktuSelesai(LocalTime.of(11,0));
        LocalTime expResult = LocalTime.of(11,0);
        LocalTime result = instance.getWaktuSelesai();
        assertEquals(expResult, result);
    }


    /**
     * Test of getLokasi method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetLokasiValid() {
        System.out.println("getLokasiValid");
        JadwalKuliah instance = new JadwalKuliah();
        instance.setLokasi("09122");
        String expResult = "09122";
        String result = instance.getLokasi();
        assertEquals(expResult, result);
    }


    /**
     * Test of setPengajar method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetPengajarValid() {
        System.out.println("setPengajar");
        Dosen pengajar = new Dosen("20000001","Anton Sudardjo");
        JadwalKuliah instance = new JadwalKuliah();
        Dosen exp = new Dosen("20000001","Anton Sudardjo");
        instance.setPengajar(pengajar);
        assertEquals(exp,instance.getPengajar());
    }

    /**
     * Test of getWaktuString method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetWaktuString() {
        System.out.println("getWaktuString");
        JadwalKuliah instance = new JadwalKuliah();
        instance.setWaktuMulai(LocalTime.of(8,0));
        instance.setWaktuSelesai(LocalTime.of(11,0));
        String expResult = "08:00-11:00";
        String result = instance.getWaktuString();
        assertEquals(expResult, result);
    }

    /**
     * Test of indonesianToDayOfWeek method, of class JadwalKuliah.
     */
    @Test
    public void testIndonesianToDayOfWeekDefaul() {
        System.out.println("indonesianToDayOfWeekDefault");
        String indonesian = "";
        DayOfWeek expResult = null;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekSenin() {
        System.out.println("indonesianToDayOfWeekSenin");
        String indonesian = "senin";
        DayOfWeek expResult = DayOfWeek.MONDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekSelasa() {
        System.out.println("indonesianToDayOfWeekSelasa");
        String indonesian = "selasa";
        DayOfWeek expResult = DayOfWeek.TUESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekRabu() {
        System.out.println("indonesianToDayOfWeekRabu");
        String indonesian = "rabu";
        DayOfWeek expResult = DayOfWeek.WEDNESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekKamis() {
        System.out.println("indonesianToDayOfWeekKamis");
        String indonesian = "kamis";
        DayOfWeek expResult = DayOfWeek.THURSDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekJumat() {
        System.out.println("indonesianToDayOfWeekJumat");
        String indonesian = "jumat";
        DayOfWeek expResult = DayOfWeek.FRIDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekSabtu() {
        System.out.println("indonesianToDayOfWeekSabtu");
        String indonesian = "sabtu";
        DayOfWeek expResult = DayOfWeek.SATURDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekMinggu() {
        System.out.println("indonesianToDayOfWeekMinggu");
        String indonesian = "minggu";
        DayOfWeek expResult = DayOfWeek.SUNDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
}
