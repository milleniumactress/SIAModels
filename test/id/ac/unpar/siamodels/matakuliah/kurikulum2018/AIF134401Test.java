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
public class AIF134401Test {
    
    private AIF134401 matkul;
    
    public AIF134401Test() {
        this.matkul = new AIF134401();
    }
    
    @Test
    public void testConstructor() {
        MataKuliah m = new AIF134401();
        assertEquals(this.matkul,m);
    }
    
}
