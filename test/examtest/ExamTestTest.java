/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class ExamTestTest {
    
    ExamTest j= new ExamTest();
    @Test
    public void JunitTestCase1() {
         //If the input is from the user: AAVS => VS;
        assertEquals("VS", j.truncate ("AAVS"));
    }
     @Test
    public void JunitTestCase2() {
         //*If the input is from the user: ASD => SD;
        assertEquals("SD", j.truncate ("ASD"));
    }
     @Test
    public void JunitTestCase3() {
         //If the input is from the user: SDA => SDA;
        assertEquals("SDA", j.truncate ("SDA"));
    }
    @Test
    public void testTruncate_AAtTheEnd(){
        assertEquals("CDAA", j.truncate ("CDAA"));
    }
    @Test
    public void testSameFirstSame1Case1(){
        assertFalse (j.sameFirstSameLast("ABCD"));
    }
    @Test
    public void testSameFirstSame1Case2(){
        assertTrue(j.sameFirstSameLast("AABCAA"));
    }

    /*
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class JunitJavaPro.
     */
    
    
    
}
