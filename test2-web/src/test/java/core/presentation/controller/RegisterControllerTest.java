/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.presentation.controller;

import core.service.RegisterFacade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nel
 */
public class RegisterControllerTest {
    
    public RegisterControllerTest() {
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
     * Test of getServices method, of class RegisterController.
     */
    @org.junit.Test
    public void testGetServices() {
        System.out.println("getServices");
        RegisterController instance = new RegisterController();
        RegisterFacade expResult = null;
        RegisterFacade result = instance.getServices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServices method, of class RegisterController.
     */
    @org.junit.Test
    public void testSetServices() {
        System.out.println("setServices");
        RegisterFacade Services = null;
        RegisterController instance = new RegisterController();
        instance.setServices(Services);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModel method, of class RegisterController.
     */
    @org.junit.Test
    public void testGetModel() {
        System.out.println("getModel");
        RegisterController instance = new RegisterController();
        RegisterController.RegisterModel expResult = null;
        RegisterController.RegisterModel result = instance.getModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModel method, of class RegisterController.
     */
    @org.junit.Test
    public void testSetModel() {
        System.out.println("setModel");
        RegisterController.RegisterModel Model = null;
        RegisterController instance = new RegisterController();
        instance.setModel(Model);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class RegisterController.
     */
    @org.junit.Test
    public void testRegister() {
        System.out.println("register");
        RegisterController instance = new RegisterController();
        String expResult = "";
        String result = instance.register();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
