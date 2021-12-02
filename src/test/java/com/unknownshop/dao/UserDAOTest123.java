/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownshop.dao;

import com.unknownshop.entity.Users;
import com.unknownshop.util.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserDAOTest123 {
//
//    @Mock
//    ResultSet mockResultSet;
//    
//    @Mock
//    PreparedStatement mockPreparedStmnt;
    
    @Mock
    UserDAO dao = new UserDAO();
    
    @Test
    public void testSelectBySql() {
        System.out.println("selectBySql");
        try (MockedStatic<XJdbc> jdbc = Mockito.mockStatic(XJdbc.class)) {
            // test resultset
            ResultSet expRs = null;
            jdbc.when(() -> XJdbc.query("", ""))
                .thenReturn(expRs);
            ResultSet actRs = XJdbc.query("", "");
            assertEquals(expRs, actRs);
            // test return list
            List<Users> expected = new ArrayList<>();
            when(dao.selectBySql("","")).thenReturn(expected);
            List<Users> actual = dao.selectBySql("", "");
            assertEquals(expected, actual);
        } catch (Exception ex) {
            fail("Lỗi rồi nè. Sửa đi!");
        }
    }

    @Test
    public void testGetList() {
        System.out.println("getList");
        List<Users> expected = new ArrayList<>();
        when(dao.selectBySql("","")).thenReturn(expected);
        List<Users> actual = dao.selectBySql("", "");
        assertEquals(expected, actual);
    }

//    @Test
//    public void testInsertValid() {
//        System.out.println("insert");
//        Users us = null;
//        UserDAO instance = new UserDAO();
//        int expResult = 0;
//        int result = instance.insert(us);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
//
//    /**
//     * Test of update method, of class UserDAO.
//     */
//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        Users us = null;
//        UserDAO instance = new UserDAO();
//        int expResult = 0;
//        int result = instance.update(us);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
//
//    /**
//     * Test of delete method, of class UserDAO.
//     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        String key = "";
//        UserDAO instance = new UserDAO();
//        int expResult = 0;
//        int result = instance.delete(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
//
//    /**
//     * Test of getListOfArray method, of class UserDAO.
//     */
//    @Test
//    public void testGetListOfArray() {
//        System.out.println("getListOfArray");
//        String sql = "";
//        String[] cols = null;
//        Object[] args = null;
//        UserDAO instance = new UserDAO();
//        List expResult = null;
//        List result = instance.getListOfArray(sql, cols, args);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
//
//    /**
//     * Test of signIn method, of class UserDAO.
//     */
//    @Test
//    public void testSignIn() {
//        System.out.println("signIn");
//        String username = "";
//        String password = "";
//        Users user = null;
//        UserDAO instance = new UserDAO();
//        int expResult = 0;
//        int result = instance.signIn(username, password, user);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
//
//    /**
//     * Test of selectByUserName method, of class UserDAO.
//     */
//    @Test
//    public void testSelectByUserName() {
//        System.out.println("selectByUserName");
//        String username = "";
//        Users user = null;
//        UserDAO instance = new UserDAO();
//        int expResult = 0;
//        int result = instance.selectByUserName(username, user);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
//
//    /**
//     * Test of selectRoles method, of class UserDAO.
//     */
//    @Test
//    public void testSelectRoles() {
//        System.out.println("selectRoles");
//        UserDAO instance = new UserDAO();
//        List expResult = null;
//        List result = instance.selectRoles();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
//
//    /**
//     * Test of restoreUser method, of class UserDAO.
//     */
//    @Test
//    public void testRestoreUser() {
//        System.out.println("restoreUser");
//        Integer key = null;
//        UserDAO instance = new UserDAO();
//        int expResult = 0;
//        int result = instance.restoreUser(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
//
//    /**
//     * Test of selectUsers method, of class UserDAO.
//     */
//    @Test
//    public void testSelectUsers() {
//        System.out.println("selectUsers");
//        String roles = "";
//        UserDAO instance = new UserDAO();
//        List<Users> expResult = null;
//        List<Users> result = instance.selectUsers(roles);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
//
//    /**
//     * Test of selectUsersDeleted method, of class UserDAO.
//     */
//    @Test
//    public void testSelectUsersDeleted() {
//        System.out.println("selectUsersDeleted");
//        String roles = "";
//        UserDAO instance = new UserDAO();
//        List<Users> expResult = null;
//        List<Users> result = instance.selectUsersDeleted(roles);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is jdbc prototype.");
//    }
    
}
