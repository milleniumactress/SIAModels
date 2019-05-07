/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.Mahasiswa;
import id.ac.unpar.siamodels.TahunSemester;
import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Ravi
 */
public class TestConstructor {

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184106
     */
    @Test
    public void testCheckPrasyaratTrue106() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184106 instance = new AIF184106();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF184119(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184106
     */
    @Test
    public void testCheckPrasyaratFalse106() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184106 instance = new AIF184106();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184108
     */
    @Test
    public void testCheckPrasyaratTrue108() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184108 instance = new AIF184108();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182106(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184108
     */
    @Test
    public void testCheckPrasyaratFalse108() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184108 instance = new AIF184108();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184109
     */
    @Test
    public void testCheckPrasyaratTrue109() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184109 instance = new AIF184109();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183107(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184109
     */
    @Test
    public void testCheckPrasyaratFalse109() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184109 instance = new AIF184109();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184110
     */
    @Test
    public void testCheckPrasyaratTrue110() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184110 instance = new AIF184110();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF181106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184110
     */
    @Test
    public void testCheckPrasyaratFalse110() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184110 instance = new AIF184110();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184114
     */
    @Test
    public void testCheckPrasyaratTrue114() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184114 instance = new AIF184114();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182112(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184114
     */
    @Test
    public void testCheckPrasyaratFalse114() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184114 instance = new AIF184114();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184115
     */
    @Test
    public void testCheckPrasyaratTrue115() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184115 instance = new AIF184115();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF181103(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184115
     */
    @Test
    public void testCheckPrasyaratFalse115() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184115 instance = new AIF184115();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184116
     */
    @Test
    public void testCheckPrasyaratTrue116() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184116 instance = new AIF184116();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183201(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183107(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184116
     */
    @Test
    public void testCheckPrasyaratFalse116() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184116 instance = new AIF184116();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184119
     */
    @Test
    public void testCheckPrasyaratTrue119() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184119 instance = new AIF184119();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182100(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183120(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184119
     */
    @Test
    public void testCheckPrasyaratFalse119() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184119 instance = new AIF184119();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184121
     */
    @Test
    public void testCheckPrasyaratTrue121() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184121 instance = new AIF184121();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183107(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184123
     */
    @Test
    public void testCheckPrasyaratFalse121() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184121 instance = new AIF184121();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184123
     */
    @Test
    public void testCheckPrasyaratTrue123() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184123 instance = new AIF184123();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF181106(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184123
     */
    @Test
    public void testCheckPrasyaratFalse123() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184123 instance = new AIF184123();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184125
     */
    @Test
    public void testCheckPrasyaratTrue125() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184125 instance = new AIF184125();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183107(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184125
     */
    @Test
    public void testCheckPrasyaratFalse125() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184125 instance = new AIF184125();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184129
     */
    @Test
    public void testCheckPrasyaratTrue129() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184129 instance = new AIF184129();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183236(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184129
     */
    @Test
    public void testCheckPrasyaratFalse129() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184129 instance = new AIF184129();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184222
     */
    @Test
    public void testCheckPrasyaratTrue222() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184222 instance = new AIF184222();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF184129(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184230
     */
    @Test
    public void testCheckPrasyaratFalse222() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184222 instance = new AIF184222();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184230
     */
    @Test
    public void testCheckPrasyaratTrue230() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184230 instance = new AIF184230();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183119(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184230
     */
    @Test
    public void testCheckPrasyaratFalse230() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184230 instance = new AIF184230();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184231
     */
    @Test
    public void testCheckPrasyaratTrue231() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184231 instance = new AIF184231();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184231
     */
    @Test
    public void testCheckPrasyaratFalse231() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184231 instance = new AIF184231();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184235
     */
    @Test
    public void testCheckPrasyaratTrue235() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184235 instance = new AIF184235();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182204(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182302(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184235
     */
    @Test
    public void testCheckPrasyaratFalse235() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184235 instance = new AIF184235();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184104
     */
    @Test
    public void testCheckPrasyaratTrue104() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184104 instance = new AIF184104();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182106(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184104
     */
    @Test
    public void testCheckPrasyaratFalse104() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184104 instance = new AIF184104();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184233
     */
    @Test
    public void testCheckPrasyaratTrue233() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184233 instance = new AIF184233();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184233
     */
    @Test
    public void testCheckPrasyaratFalse233() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184233 instance = new AIF184233();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184303
     */
    @Test
    public void testCheckPrasyaratTrue303() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184303 instance = new AIF184303();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183308(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184303
     */
    @Test
    public void testCheckPrasyaratFalse303() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184303 instance = new AIF184303();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184334
     */
    @Test
    public void testCheckPrasyaratTrue334() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184334 instance = new AIF184334();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182308(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184334
     */
    @Test
    public void testCheckPrasyaratFalse334() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184334 instance = new AIF184334();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184338
     */
    @Test
    public void testCheckPrasyaratTrue338() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184338 instance = new AIF184338();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182105(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184338
     */
    @Test
    public void testCheckPrasyaratFalse338() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184338 instance = new AIF184338();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184339
     */
    @Test
    public void testCheckPrasyaratTrue339() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184339 instance = new AIF184339();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182308(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184339
     */
    @Test
    public void testCheckPrasyaratFalse339() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184339 instance = new AIF184339();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184340
     */
    @Test
    public void testCheckPrasyaratTrue340() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184340 instance = new AIF184340();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182308(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184340
     */
    @Test
    public void testCheckPrasyaratFalse340() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184340 instance = new AIF184340();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184341
     */
    @Test
    public void testCheckPrasyaratTrue341() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184341 instance = new AIF184341();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF182101(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184341
     */
    @Test
    public void testCheckPrasyaratFalse341() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184341 instance = new AIF184341();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184344
     */
    @Test
    public void testCheckPrasyaratTrue344() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184344 instance = new AIF184344();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF184341(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184344
     */
    @Test
    public void testCheckPrasyaratFalse344() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184344 instance = new AIF184344();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa dapat mengambil matakuliah AIF184345
     */
    @Test
    public void testCheckPrasyaratTrue345() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184345 instance = new AIF184345();
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183300(), "A"));
        mahasiswa.getRiwayatNilai().add(new Mahasiswa.Nilai(new TahunSemester("182"), new AIF183204(), "A"));
        boolean expResult = true;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }

    /**
     * Tes mahasiswa tidak dapat mengambil matakuliah AIF184345
     */
    @Test
    public void testCheckPrasyaratFalse345() {
        Mahasiswa mahasiswa = new Mahasiswa("2018730041");
        List<String> reasonsContainer = new LinkedList<>();
        AIF184345 instance = new AIF184345();
        boolean expResult = false;
        boolean result = instance.checkPrasyarat(mahasiswa, reasonsContainer);
        assertEquals(expResult, result);
    }
    


}
