package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * The type Event.
 * @author amoua
 */
@Entity(name = "Event")
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    private User user;

   // @Column(name = "wedding_date")
    //private int wedding_date;

    @Column(name = "budget")
    private int budget;

    @Column(name = "location")
    private String location;

    /**
     * No arg constructor.
     */
    public Event() {

    }

    /**
     * Instantiates a new Event.
     *
     * @param user the user
     */
    public Event(String location, User user) {
        this.user = user;
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
     * Gets wedding date.
     *
     * @return the wedding date

    public int getWedding_date() {
        return wedding_date;
    }

    /**
     * Sets wedding date.
     *
     * @param wedding_date the wedding date

    public void setWedding_date(int wedding_date) {
        this.wedding_date = wedding_date;
    }
*/
    /**
     * Gets budget.
     *
     * @return the budget
     */
    public int getBudget() {
        return budget;
    }

    /**
     * Sets budget.
     *
     * @param budget the budget
     */
    public void setBudget(int budget) {
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
                ", location='" + location + '\'' +
                '}';
    }

}
