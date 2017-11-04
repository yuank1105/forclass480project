/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class WebControllerTest {
     private WebController controller;
     private final String key="facebook";
    
    public WebControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        controller=new WebController();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GetsearchEngineLinks method, of class WebController.
     */
    @Test
    public void testGetsearchEngineLinks() throws Exception {
        controller.GetsearchEngineLinks(key);
    }

    /**
     * Test of numberOflinks method, of class WebController.
     */
    @Test
    public void testNumberOflinks() throws IOException {
        assertTrue(controller.numberOflinks(controller.GetsearchEngineLinks(key).size()));
    }

    /**
     * Test of AreaCanBe method, of class WebController.
     */
    @Test
    public void testAreaCanBe() throws IOException {
   assertEquals(64,controller.AreaCanBe(controller.GetsearchEngineLinks(key).size()));
    }

    /**
     * Test of CheckingDiv method, of class WebController.
     */
    @Test
    public void testCheckingDiv() throws IOException {
    assertTrue(controller.CheckingDiv(16,controller.GetsearchEngineLinks(key).size()));
    }
    
}
