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
 * @author Gerry
 */
public class AIF134487Test {
    
    
                private AIF134487 matkul;
    
    public AIF134487Test() {
        this.matkul = new AIF134487();
    }
    
    @Test
    public void testConstructor() {
        MataKuliah m = new AIF134487();
        assertEquals(this.matkul,m);
    }
    
}
