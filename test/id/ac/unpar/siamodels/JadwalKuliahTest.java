/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import java.time.DayOfWeek;
import java.time.LocalTime;
import org.junit.Test;
import static org.junit.Assert.*;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.*;

/**
 * Kelas yang menguji kelas JadwalKuliah
 * @author Richard
 */
public class JadwalKuliahTest {
        
    @Test
    public void testConstructorJadwalKuliah() {
        MataKuliahFactory mkf = MataKuliahFactory.getInstance();
        MataKuliah mataKuliah = mkf.createMataKuliah("AIF131101");
        Dosen d = new Dosen("12345678","abc");
        JadwalKuliah jk = new JadwalKuliah(mataKuliah,'A',d,"Senin","08.00-10.00","9017");
    }
    
    
    /**
     * Method yang menguji metode setMataKuliah() dan getMataKuliah()
     * @Input null
     */
    @Test
    public void testSetGetMataKuliahNull() {
        MataKuliah mataKuliah = null;
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah exp = null;
        assertEquals(exp,instance.getMataKuliah());
    }
    
    /**
     * Method yang menguji getter dan setter Matakuliah dalam JadwalKuliah
     * @Input AIF131101 (Matakuliah yang valid)
     */
    @Test
    public void testSetGetMataKuliah() {
        MataKuliah mataKuliah = new AIF131101();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new AIF131101();
        assertEquals(expected,instance.getMataKuliah());
    }
    
    @Test
    public void testSetGetMataKuliahWajib2018() {
        System.out.println("setMataKuliahWajib2018");
        MataKuliah mataKuliah = new AIF181100();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new AIF181100();
        assertEquals(expected,instance.getMataKuliah());
    }
    
    @Test
    public void testSetGetMataKuliahPilihan() {
        System.out.println("setMataKuliahPilihan");
        MataKuliah mataKuliah = new AIF184121();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new AIF184121();
        assertEquals(expected,instance.getMataKuliah());
    }
    
    @Test
    public void testSetGetMataKuliahUmum() {
        System.out.println("setMataKuliahUmum");
        MataKuliah mataKuliah = new MKU180370();
        JadwalKuliah instance = new JadwalKuliah();
        instance.setMataKuliah(mataKuliah);
        MataKuliah expected = new MKU180370();
        assertEquals(expected,instance.getMataKuliah());
    }

    /**
     * Method yang menguji getter dan setter dari atribut kelas dari JadwalKuliah
     * @Input null
     */
    @Test
    public void testSetGetKelasNull() {
        JadwalKuliah instance = new JadwalKuliah();
        Character expResult = null;
        Character result = instance.getKelas();
        assertEquals(expResult, result);
    }

    /**
     * Method yang menguji getter dan setter atribut kelas dari JadwalKuliah
     * @Input 'A' (kelas yang valid)
     */
    @Test
    public void testSetGetKelasValid() {
        Character kelas = 'A';
        JadwalKuliah instance = new JadwalKuliah();
        instance.setKelas(kelas);
        Character exp = 'A';
        assertEquals(exp,instance.getKelas());
    }

    /**
     * Method yang menguji getter dan setter atribut hari dalam JadwalKuliah
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
     * Method yang menguji getter dan setter atribut waktuMulai dalam JadwalKuliah
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
     * Method yang menguji getter dan setter atribut waktuSelesai dalam JadwalKuliah
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
     * Method yang menguji getter dan setter atribut lokasi (ruangan) dalam JadwalKuliah
     */
    @Test
    public void testSetGetLokasi() {
        JadwalKuliah instance = new JadwalKuliah();
        instance.setLokasi("09122");
        String expResult = "09122";
        String result = instance.getLokasi();
        assertEquals(expResult, result);
    }


    /**
     * Method yang menguji setter atribut pengajar dari JadwalKuliah
     */
    @Test
    public void testSetPengajar() {
        Dosen pengajar = new Dosen("20000001","Anton Sudardjo");
        JadwalKuliah instance = new JadwalKuliah();
        Dosen exp = new Dosen("20000001","Anton Sudardjo");
        instance.setPengajar(pengajar);
        assertEquals(exp,instance.getPengajar());
    }
    
    /**
     * Method yang menguji getter atribut pengajar dari JadwalKuliah
     */
    @Test
    public void testGetPengajar(){
        Dosen exp = new Dosen("20000001","Anton Sudardjo");
        JadwalKuliah jK = new JadwalKuliah();
        jK.setPengajar(exp);
        Dosen get = jK.getPengajar();
        assertEquals(exp,get);
    }

    /**
     * Method yang menguji setter waktu JadwalKuliah dan getter yang 
     * dari waktu (dalam bentuk string HH:MM-HH:MM)
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
     * Method yang memeriksa method yang menerjemahkan hari JadwalKuliah
     * ke dalam bahasa Inggris
     * @Input "" (String kosong)
     */
    @Test
    public void testIndonesianToDayOfWeekKosong() {
        String indonesian = "";
        DayOfWeek expResult = null;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    /**
     * Method yang memeriksa method yang menerjemahkan hari JadwalKuliah
     * ke dalam bahasa Inggris
     * @Input "adwrg" (hari yang tidak valid)
     */
    @Test
    public void testIndonesianToDayOfWeekInvalid() {
        String indonesian = "adgwrg";
        DayOfWeek expResult = null;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    /**
     * Method yang memeriksa method yang menerjemahkan hari JadwalKuliah
     * ke dalam bahasa Inggris
     * @Input "senin"
     */
    @Test
    public void testIndonesianToDayOfWeekSenin() {
        String indonesian = "senin";
        DayOfWeek expResult = DayOfWeek.MONDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    /**
     * Method yang memeriksa method yang menerjemahkan hari JadwalKuliah
     * ke dalam bahasa Inggris
     * @Input "selasa"
     */
    @Test
    public void testIndonesianToDayOfWeekSelasa() {
        String indonesian = "sElAsa";
        DayOfWeek expResult = DayOfWeek.TUESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    /**
     * Method yang memeriksa method yang menerjemahkan hari JadwalKuliah
     * ke dalam bahasa Inggris
     * @Input "Rabu"
     */
    @Test
    public void testIndonesianToDayOfWeekRabu() {
        String indonesian = "Rabu";
        DayOfWeek expResult = DayOfWeek.WEDNESDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    /**
     * Method yang memeriksa method yang menerjemahkan hari JadwalKuliah
     * ke dalam bahasa Inggris
     * @Input "KAMIS"
     */    
    @Test
    public void testIndonesianToDayOfWeekKamis() {
        String indonesian = "KAMIS";
        DayOfWeek expResult = DayOfWeek.THURSDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    /**
     * Method yang memeriksa method yang menerjemahkan hari JadwalKuliah
     * ke dalam bahasa Inggris
     * @Input "jumat"
     */
    @Test
    public void testIndonesianToDayOfWeekJumat() {
        String indonesian = "jumat";
        DayOfWeek expResult = DayOfWeek.FRIDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    /**
     * Method yang memeriksa method yang menerjemahkan hari JadwalKuliah
     * ke dalam bahasa Inggris
     * @Input "sabtu"
     */
    @Test
    public void testIndonesianToDayOfWeekSabtu() {
        String indonesian = "sabtu";
        DayOfWeek expResult = DayOfWeek.SATURDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
    /**
     * Method yang memeriksa method yang menerjemahkan hari JadwalKuliah
     * ke dalam bahasa Inggris
     * @Input "minggu"
     */
    @Test
    public void testIndonesianToDayOfWeekMinggu() {
        String indonesian = "minggu";
        DayOfWeek expResult = DayOfWeek.SUNDAY;
        DayOfWeek result = JadwalKuliah.indonesianToDayOfWeek(indonesian);
        assertEquals(expResult, result);
    }
    
}
