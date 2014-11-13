/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vectors;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class Vector3DTest {
    
    public Vector3DTest() {
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

    @Test
    public void testLength() {
        System.out.println("length");
        Vector3D instance = new Vector3D(1,2,3);
        double expResult = Math.sqrt(1*1+2*2+3*3);
        double result = instance.length();
        assertEquals(expResult, result, 0.0);
           }

    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D anotherVector = null;
        Vector3D instance = new Vector3D();
        Vector3D expResult = null;
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 0.0;
        Vector3D instance = new Vector3D();
        Vector3D expResult = null;
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = null;
        Vector3D instance = new Vector3D();
        double expResult = 0.0;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = null;
        Vector3D instance = new Vector3D();
        Vector3D expResult = null;
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = null;
        Vector3D instance = new Vector3D();
        boolean expResult = false;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
