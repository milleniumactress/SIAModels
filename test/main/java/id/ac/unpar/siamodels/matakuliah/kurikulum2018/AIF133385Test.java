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
public class AIF133385Test {
    
    private AIF133385 matkul;
    
    public AIF133385Test() {
        this.matkul = new AIF133385();
    }
    
    @Test
    public void testConstructor() {
        MataKuliah m = new AIF133385();
        assertEquals(this.matkul,m);
    }
    
}
