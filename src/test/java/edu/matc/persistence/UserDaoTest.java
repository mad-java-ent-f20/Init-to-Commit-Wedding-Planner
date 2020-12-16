package edu.matc.persistence;

import com.mysql.cj.Session;
import edu.matc.entity.Event;
import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.test.util.DatabaseUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.transaction.Transaction;
import javax.transaction.Transactional;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
@Transactional

class UserDaoTest {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private Session session;
    Transaction transaction = null;


    GenericDao genericDao;
    GenericDao genericDaoEvent; //create
    DatabaseUtility databaseUtility;

    /**
     * Run set up tasks before each tests
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {

        genericDao = new GenericDao(User.class);
        databaseUtility = new DatabaseUtility();
        databaseUtility.runSQL("cleandb.sql");
        databaseUtility.runSQL("createTestData.sql");

    }

    /**
     * Verifies gets all users successfully.
     */
    @Test
    void getAll() {
        List<User> users = genericDao.getAll();
        assertEquals(6, users.size());
    }



    /**
     * Verifies a user is returned correctly based on id search
     */
    @Test
    void getById() {
        User retrievedUser = (User)genericDao.getById(3);
        assertNotNull(retrievedUser);
        assertEquals("Barney", retrievedUser.getFirstName());
    }

    /**
     * Verify successful insert of a user
     */
    @Test
    void insert() {

        User newUser = new User("Fred", "Flintstone", "fflintstone","fhensen@nomail.com");
        @SuppressWarnings("unchecked") // Just for this one statement
        int id = genericDao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = (User)genericDao.getById(id);
        String expectedUser = "Fred";
        String actualUser = insertedUser.getFirstName();
        assertTrue(expectedUser.equals(actualUser));
    }

    /**
     * Verify successful insert of an event
     */
    @Test
    void insertWithEventSuccess() {

        User newUser = new User("Fred", "Flinstone", "fflinstone", "fredf@nomail.com");
        String location = "Madison";
        String budget = "3400";
        String numOfGuests = "65";
        String user_name = "fflinstone";
        Event event = new Event(budget, location, numOfGuests, user_name);

        newUser.addEvent(event);

        @SuppressWarnings("unchecked") // Just for this one statement
        int id = genericDao.insert(newUser);

        assertNotEquals(0,id);
        User insertedUser = (User)genericDao.getById(id);
        String expectedUser = "Fred";
        String actualUser = insertedUser.getFirstName();
        //assertTrue(expectedUser.equals(actualUser));
        assertNotNull(insertedUser);
    }

    /**
     * Verify successful insert of a user and an userRole
     */
    @Test
    void insertWithRoleSuccess() {
        String userRoleName = "user";
        User newUser = new User("Fred", "Flintstone", "fflintstone", "fflinstone@nomail.com");
        Role userRoles = new Role(userRoleName, "fflintstone", newUser);
        newUser.addUserRoles(userRoles);
        int id = genericDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = (User)genericDao.getById(id);
        assertNotNull(insertedUser);
        assertEquals("Fred", insertedUser.getFirstName());
        assertEquals(1, insertedUser.getUserRoles().size());
    }

    /**
     * Verify successful delete of user
     */
    @Test
    void delete() {

        genericDao.delete(genericDao.getById(3));
        assertNull(genericDao.getById(3));
    }

    /**
     * Verify successful update of user
     */
    @Test
    void saveOrUpdate() {
        String updateNewUser = "Fred";
        User userBeforeUpdate = (User)genericDao.getById(2);
        userBeforeUpdate.setLastName(updateNewUser);
        genericDao.saveOrUpdate(userBeforeUpdate);
        User userAfterUpdate = (User)genericDao.getById(2);

        String expectedUser = "Fred";
        String actualUser = userAfterUpdate.getLastName();
        assertTrue(expectedUser.equals(actualUser));
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = genericDao.getByPropertyLike("lastName", "Curry");
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = genericDao.getByPropertyLike("lastName", "c");
        assertEquals(3, users.size());
    }
}