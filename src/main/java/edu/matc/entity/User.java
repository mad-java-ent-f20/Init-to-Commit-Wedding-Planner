package edu.matc.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import java.util.HashSet;
import java.util.Set;


/**
 * A class to represent a user.
 *
 * @author amoua
 */
@Entity(name = "User")
@Table(name = "user") // this is case sensitive
public class User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    //@Column(name = "wedding_date")
    //private LocalDate weddingDate;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Event> events = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Role> userRoles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    public Set<Contact> contacts = new HashSet<>();


    /**
     * Instantiates a new User.
     */
    public User() {
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets wed event.
     *
     * @return events the wed event
     */
    public Set<Event> getEvents() {
        return events;
    }

    /**
     * Sets wed event.
     *
     * @param events the wed event
     */
    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    /**
     * Get password
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Get the email.
     *
     * @return the email
     */

    public String getEmail() {
        return email;
    }
    /**
     * Set email
     *
     * @param email the password
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Add event.
     *
     * @param event the event
     */
    public void addEvent(Event event) {
        events.add(event);
        event.setUser(null);
    }


    /**
     * Remove event.
     *
     * @param event the event
     */
    public void removeEvent(Event event) {
        events.remove(event);
        event.setUser(null);
    }

    /**
     * Gets user roles.
     *
     * @return the user roles
     */
    public Set<Role> getUserRoles() {
        return userRoles;
    }

    /**
     * Sets user roles.
     *
     * @param userRoles the user roles
     */
    public void setUserRoles(Set<Role> userRoles) {
        this.userRoles = userRoles;
    }


    /**
     * Add UserRoles.
     *
     * @param userRole the UserRole to add
     */
    public void addUserRoles(Role userRole) {
        userRoles.add( userRole );
        userRole.setUser( this );
    }


    /**
     * Remove user roles.
     *
     * @param userRole the user role
     */
    public void removeUserRoles(Role userRole) {
        userRoles.remove( userRole );
        userRole.setUser( null );
    }

    /**
     * Add a contact
     *
     * @param contact the UserRole to add
     */
    public void addContact(Contact contact) {
        contacts.add(contact);
        contact.setUser(this);
    }

    /**
     * Instantiates a new User with password
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userName  the user name
     * @param password  the password
     * @param email     the email
     */
    public User(String firstName, String lastName, String userName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.email = email;

    }

    /**
     * Instantiates a new User.
     *
     * @param userName the user name
     * @param password the password
     */
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * Instantiates a new User with email
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userName  the user name
     * @param email     the email
     */
    public User(String firstName, String lastName, String userName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;

    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}