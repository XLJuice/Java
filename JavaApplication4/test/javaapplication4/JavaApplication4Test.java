/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1710532
 */
public class JavaApplication4Test {
    
    public JavaApplication4Test() {
    }
    
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
     * Test of main method, of class JavaApplication4.
     */
    @Test
    public void testfound() {
        int [] tarr = {1,2,3,4};
        JavaApplication4.binarySearch(tarr,0,3,3);
    }
    @Test
    public void testnotfound() {
        int [] tarr = {1,2,3,4};
        JavaApplication4.binarySearch(tarr,0,3,5);
    }

}
