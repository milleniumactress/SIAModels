/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.MataKuliah;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Richard
 */
public class AIF133315Test {
    private AIF133315 matkul;
    
    public AIF133315Test() {
        this.matkul = new AIF133315();
    }
    
    @Test
    public void testConstructor() {
        MataKuliah m = new AIF133315();
        assertEquals(this.matkul,m);
    }
    
}
