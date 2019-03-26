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
public class AIF133305Test {
    
    private AIF133305 matkul;
    
    public AIF133305Test() {
        this.matkul = new AIF133305();
    }
    
    @Test
    public void testConstructor() {
        MataKuliah m = new AIF133305();
        assertEquals(this.matkul,m);
    }
    
}
