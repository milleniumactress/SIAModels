/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels;

import id.ac.unpar.siamodels.Mahasiswa.Nilai;
import id.ac.unpar.siamodels.matakuliah.kurikulum2018.AIF131101;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Muhammad Ravi
 */
public class NilaiTest {
    
    /**
     * Tes untuk mengambil tahun Ajaran yang di tempuh dari inner class Nilai.
     */
    @Test
    public void getTahunAjaran() {
        boolean lulusSaja = true;
        Mahasiswa instance = new Mahasiswa("2016730041");
        instance.riwayatNilai.add(new Mahasiswa.Nilai(new TahunSemester("161"), new AIF131101(),"A"));//6
        int expResult = 2016;
        Nilai nilai = instance.riwayatNilai.get(0);
        int result=nilai.getTahunAjaran();
        assertEquals(expResult, result, 0.0);
    }
    
    
}
