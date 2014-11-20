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
        Vector3D anotherVector = new Vector3D(1,2,3);
        Vector3D instance = new Vector3D(2,3,4);
        Vector3D expResult = new Vector3D(3,5,7);
        Vector3D result = instance.add(anotherVector);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testMultiplyByScalar() {
        System.out.println("multiplyByScalar");
        double alpha = 0.0;
        Vector3D instance = new Vector3D(1,2,3);
        Vector3D expResult = new Vector3D(alpha*1,alpha*2,alpha*3);
        Vector3D result = instance.multiplyByScalar(alpha);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testDotProduct() {
        System.out.println("dotProduct");
        Vector3D anotherVector = new Vector3D(1,2,3);
        Vector3D instance = new Vector3D(4,5,6);
        double expResult = 1*4+2*5+3*6;
        double result = instance.dotProduct(anotherVector);
        assertEquals(expResult, result, 0.0);
        
      
    }

    @Test
    public void testCrossProduct() {
        System.out.println("crossProduct");
        Vector3D anotherVector = new Vector3D(4,5,6);
        Vector3D instance = new Vector3D(1,2,3);
        Vector3D expResult = new Vector3D((2*6)-(3*5),(3*4)-(1*6),(1*5)-(2*4));
        Vector3D result = instance.crossProduct(anotherVector);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(1,2,3);
        String expResult = "[1.0, 2.0, 3.0]";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testEquals() {
        System.out.println("equals");
        Object anotherObject = new Vector3D();
        Vector3D instance = new Vector3D();
        boolean expResult = true;
        boolean result = instance.equals(anotherObject);
        assertEquals(expResult, result);
       
    }
    
}
