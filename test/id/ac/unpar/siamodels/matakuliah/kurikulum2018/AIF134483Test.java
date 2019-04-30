/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.unpar.siamodels.matakuliah.kurikulum2018;

import id.ac.unpar.siamodels.MataKuliah;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gerry
 */
public class AIF134483Test {
    
       
                private AIF134483 matkul;
    
    public AIF134483Test() {
        this.matkul = new AIF134483();
    }
    
    @Test
    public void testConstructor() {
        MataKuliah m = new AIF134483();
        assertEquals(this.matkul,m);
    }
    
}
