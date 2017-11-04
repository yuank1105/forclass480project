/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class UserTest {
    private User user;
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        user=new User();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of verify method, of class User.
     */
    @Test
    public void testVerify() {
        assertEquals("cris1231234",user.verifyUser("cris123","1234"));
    }
    
//       @Test
//    public void Verify() {
//        assertTrue(user.verify("cris123","1234"));
//    }
    }
    

