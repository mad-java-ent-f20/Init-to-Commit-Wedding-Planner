package edu.matc.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;


/**
 * A class to represent a user.
 *
 * @author
 */
@Entity(name = "User")
@Table(name = "user")
public class User {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "user_name")
    private String userName;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @Column(name = "wedding_date")
    private LocalDate weddingDate;




    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userName  the user name
     * @param weddingDate        the id
     *
     */
    public User(String firstName, String lastName, String userName, LocalDate weddingDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        //this.id = id;
        this.weddingDate = weddingDate;
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
     * Sets dob.
     *
     * @param weddingDate the dob
     */
    public void setDob(LocalDate weddingDate) {
        this.weddingDate = weddingDate;
    }

    /**
     * Gets dob.
     *
     * @return the dob
     */
    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    /**
     * Gets age of user.
     *
     * @return the age

    public int getAge() {
        return(int) ChronoUnit.YEARS.between(dob,LocalDate.now());

    }
*/
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", id=" + id +
                ", weddingDate=" + weddingDate +
                '}';
    }
}