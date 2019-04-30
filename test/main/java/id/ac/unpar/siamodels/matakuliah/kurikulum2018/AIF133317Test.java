/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.MataKuliah;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Richard
 */
public class AIF133317Test {
    
    private AIF133317 matkul;
    
    public AIF133317Test() {
        this.matkul = new AIF133317();
    }
    
    @Test
    public void testConstructor() {
        MataKuliah m = new AIF133317();
        assertEquals(this.matkul,m);
    }
    
}
