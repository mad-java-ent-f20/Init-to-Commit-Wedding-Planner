package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Event.
 * @author amoua
 */
@Entity(name = "Event")
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    private User user;

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "budget")
    private String budget;

    @Column(name = "location")
    private String location;

    @Column(name = "numOfGuests")
    private String numOfGuests;



    /**
     * No arg constructor.
     */
    public Event() {

    }

    /**
     * Instantiates a new Event.
     *
     * @param budget budget of wedding
     * @param location location of wedding
     */
    public Event(String budget, String location, String numOfGuests, String user_name) {
        this.budget = budget;
        this.location = location;
        this.numOfGuests = numOfGuests;
        this.user_name = user_name;
    }


    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getNumOfGuests() {
        return numOfGuests;
    }

    public void setNumOfGuests(String numOfGuests) {
        this.numOfGuests = numOfGuests;
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
     * Gets budget.
     *
     * @return the budget
     */
    public String getBudget() {
        return budget;
    }

    /**
     * Sets budget.
     *
     * @param budget the budget
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }


    /**
     * Gets location.
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     */
    public void setLocation(String location) {
        this.location = location;

    }
    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", user=" + user +
                ", budget=" + budget +
                ", location='" + location +
                ", numOfGuests='" + numOfGuests + '\'' +
                '}';
    }

}
