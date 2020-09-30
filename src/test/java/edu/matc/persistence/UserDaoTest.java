package edu.matc.persistence;

import edu.matc.entity.User;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

/**
 * The type User dao test.
 */
public class UserDAOTest {


    //instance variable for UserDAO
    UserDAO dao;

    /**
     * Creating the DAO.
     */
    @BeforeEach
    public void setUp()  {
        dao = new UserDAO();
    }

    /**
     * Verifies get all users successfully.
     */
    @Test
    public void testGetAllUsers() {
        List<User> users = dao.getAllUsers();
        assertEquals(6, users.size());
    }

    /**
     * Verifies search last name successfully.
     */
    @Test
    public void testSearchLastName() {
        List<User> users = dao.searchLastName("c");
        assertEquals(3, users.size());
    }

    /**
     * Verifies a user is returned correctly based on id search.
     */
    @Test
    public void getByIdSuccess() {
        User retrievedUser = dao.getById(3);
        assertEquals("Barney", retrievedUser.getFirstName());
    }


    /**
     * Verify successful retrieval of a user
     */
    @Test
    void getByIdSuccess() {
        User retrievedUser = dao.getById(3);
        assertEquals("Barney", retrievedUser.getFirstName());
        assertEquals("Curry", retrievedUser.getLastName());
        assertEquals("bcurry", retrievedUser.getUserName());
        //TODO compare remaining values
    }

    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {

        User newUser = new User("Fred", "Flintstone", "fflintstone", LocalDate.parse("1968-01-01"));
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getById(id);
        assertEquals("Fred", insertedUser.getFirstName());
        // Could continue comparing all values, but
        // it may make sense to use .equals()
        // TODO review .equals recommendations http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#mapping-model-pojo-equalshashcode
    }

    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(3));
        assertNull(dao.getById(3));
    }
}