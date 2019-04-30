/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.TahunSemester;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Amabel
 */
public class AIF183117Test {

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF183117
     */
    @Test
    public void testCheckPrasyaratTrue() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF183117 instance = new AIF183117();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182105(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF181103(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF183117.
     */
    @Test
    public void testCheckPrasyaratFalse() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF183117 instance = new AIF183117();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    
}
