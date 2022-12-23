/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examtest;

import java.util.Arrays;
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
    
    ExamTest j;
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Hello ");
    }
    @Before
    public void setUp() {
        j= new ExamTest();
        System.out.println("Start");
        
    }
    @Test
    public void JunitTestCase1() {
         //If the input is from the user: AAVS => VS;
        assertEquals("VS", j.truncate ("AAVS"));
        System.out.println("JunitTestCase1");
    }
     @Test
    public void JunitTestCase2() {
         //*If the input is from the user: ASD => SD;
        assertEquals("SD", j.truncate ("ASD"));
        System.out.println("JunitTestCase2");
        
    }
     @Test
    public void JunitTestCase3() {
         //If the input is from the user: SDA => SDA;
        assertEquals("SDA", j.truncate ("SDA"));
        System.out.println("JunitTestCase3");
    }
    @Test
    public void testTruncate_AAtTheEnd(){
        assertEquals("CDAA", j.truncate ("CDAA"));
        System.out.println("testTruncate_AAtTheEnd");
    }
    @Test
    public void testSameFirstSame1Case1(){
        assertFalse (j.sameFirstSameLast("ABCD"));
        System.out.println("testSameFirstSame1Case1");
    }
    @Test
    public void testSameFirstSame1Case2(){
        assertTrue(j.sameFirstSameLast("AABCAA"));
        System.out.println("testSameFirstSame1Case2");
    }
     @After
    public void tearDown() {
        System.out.println("Ending");
    }
    //the method that throws Exception
    @Test(expected= NullPointerException.class)
        public void testArraySort() {
        int[] actual=null;
        Arrays.sort(actual);
 }

   
    @AfterClass
    public static void tearDownClass() {
         System.out.println("Bayy");
    }
    
    
    
   

    /**
     * Test of main method, of class JunitJavaPro.
     */
    
    
    
}
