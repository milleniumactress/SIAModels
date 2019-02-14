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

    /**
     * Test of constructor, of class JadwalKuliah.
     */
    @Test
    public void testConstructorJadwalKuliah() {
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mataKuliah = mkf.createMataKuliah("AIF131101");
        Dosen d = new Dosen("12345678","abc");
        JadwalKuliah jk = new JadwalKuliah(mataKuliah,'A',d,"Senin","08.00-10.00","9017");
    }
    
    /**
     * Test of setMataKuliah method, of class JadwalKuliah.
     */
    @Test
    public void testSetGetMataKuliahNull() {
        MataKuliah mataKuliah = null;
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah exp = null;
        assertEquals(exp,instance.getMataKuliah());
    }
    
    @Test
    public void testSetGetMataKuliahWajib2013() {
        MataKuliah mataKuliah = new AIF131101();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new AIF131101();
        assertEquals(expected,instance.getMataKuliah());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetGetMataKuliahWajib2018() {
        MataKuliah mataKuliah = new AIF181100();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new AIF181100();
        assertEquals(expected,instance.getMataKuliah());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetGetMataKuliahPilihan() {
        MataKuliah mataKuliah = new AIF184121();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new AIF184121();
        assertEquals(expected,instance.getMataKuliah());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetGetMataKuliahUmum() {
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
        String indonesian = "";
        DayOfWeek expResult = null;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekSenin() {
        String indonesian = "senin";
        DayOfWeek expResult = DayOfWeek.MONDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekSelasa() {
        String indonesian = "selasa";
        DayOfWeek expResult = DayOfWeek.TUESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekRabu() {
        String indonesian = "rabu";
        DayOfWeek expResult = DayOfWeek.WEDNESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekKamis() {
        String indonesian = "kamis";
        DayOfWeek expResult = DayOfWeek.THURSDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekJumat() {
        String indonesian = "jumat";
        DayOfWeek expResult = DayOfWeek.FRIDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekSabtu() {
        String indonesian = "sabtu";
        DayOfWeek expResult = DayOfWeek.SATURDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIndonesianToDayOfWeekMinggu() {
        String indonesian = "minggu";
        DayOfWeek expResult = DayOfWeek.SUNDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
}
