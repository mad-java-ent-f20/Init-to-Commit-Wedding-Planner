package edu.matc.persistence;

import edu.matc.entity.Event;
import edu.matc.entity.User;
import edu.matc.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User dao test.
 */
class UserDaoTest {
    GenericDao genericDao;
    //UserDao dao;

    /**
     * Run set up tasks before each tests
     * Creating the dao.
     */
    @BeforeEach
    void setUp() {
       // dao = new UserDao();
        genericDao = new GenericDao(User.class);

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

    }

    /**
     * Verifies gets all users successfully.
     */
    @Test
    void getAll() {
        List<User> users = genericDao.getAll();
        assertEquals(5, users.size());
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

        User newUser = new User("Fred", "Flintstone", "fflintstone");
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

        User newUser = new User("Fred", "Flinstone", "fflinstone");
        String location = "Madison";
        Event event = new Event(location, newUser);

        newUser.addEvent(event);

        int id = genericDao.insert(newUser);

        assertNotEquals(0,id);
        User insertedUser = (User)genericDao.getById(id);
        String expectedUser = "Fred";
        String actualUser = insertedUser.getFirstName();
        assertTrue(expectedUser.equals(actualUser));
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
        String updateNewUser = "Davis";
        User userBeforeUpdate = (User)genericDao.getById(3);
        userBeforeUpdate.setLastName(updateNewUser);
        genericDao.saveOrUpdate(userBeforeUpdate);
        User userAfterUpdate = (User)genericDao.getById(3);

        String expectedUser = "Davis";
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