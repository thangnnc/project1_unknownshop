/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownshop.dao;

import com.unknownshop.entity.Users;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class UserDAOTest {
    
    public UserDAOTest() {
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
     * Test of selectBySql method, of class UserDAO.
     */
    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        String sql = "";
        Object[] args = null;
        UserDAO instance = new UserDAO();
        List<Users> expResult = null;
        List<Users> result = instance.selectBySql(sql, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getList method, of class UserDAO.
     */
    @Test
    public void testGetList() {
        System.out.println("getList");
        UserDAO instance = new UserDAO();
        List<Users> expResult = null;
        List<Users> result = instance.getList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class UserDAO.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Users us = null;
        UserDAO instance = new UserDAO();
        int expResult = 0;
        int result = instance.insert(us);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class UserDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Users us = null;
        UserDAO instance = new UserDAO();
        int expResult = 0;
        int result = instance.update(us);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class UserDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String key = "";
        UserDAO instance = new UserDAO();
        int expResult = 0;
        int result = instance.delete(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfArray method, of class UserDAO.
     */
    @Test
    public void testGetListOfArray() {
        System.out.println("getListOfArray");
        String sql = "";
        String[] cols = null;
        Object[] args = null;
        UserDAO instance = new UserDAO();
        List expResult = null;
        List result = instance.getListOfArray(sql, cols, args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of signIn method, of class UserDAO.
     */
    @Test
    public void testSignIn() {
        System.out.println("signIn");
        String username = "";
        String password = "";
        Users user = null;
        UserDAO instance = new UserDAO();
        int expResult = 0;
        int result = instance.signIn(username, password, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectByUserName method, of class UserDAO.
     */
    @Test
    public void testSelectByUserName() {
        System.out.println("selectByUserName");
        String username = "";
        Users user = null;
        UserDAO instance = new UserDAO();
        int expResult = 0;
        int result = instance.selectByUserName(username, user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectRoles method, of class UserDAO.
     */
    @Test
    public void testSelectRoles() {
        System.out.println("selectRoles");
        UserDAO instance = new UserDAO();
        List expResult = null;
        List result = instance.selectRoles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restoreUser method, of class UserDAO.
     */
    @Test
    public void testRestoreUser() {
        System.out.println("restoreUser");
        Integer key = null;
        UserDAO instance = new UserDAO();
        int expResult = 0;
        int result = instance.restoreUser(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectUsers method, of class UserDAO.
     */
    @Test
    public void testSelectUsers() {
        System.out.println("selectUsers");
        String roles = "";
        UserDAO instance = new UserDAO();
        List<Users> expResult = null;
        List<Users> result = instance.selectUsers(roles);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectUsersDeleted method, of class UserDAO.
     */
    @Test
    public void testSelectUsersDeleted() {
        System.out.println("selectUsersDeleted");
        String roles = "";
        UserDAO instance = new UserDAO();
        List<Users> expResult = null;
        List<Users> result = instance.selectUsersDeleted(roles);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
