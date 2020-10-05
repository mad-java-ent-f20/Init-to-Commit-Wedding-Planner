package edu.matc.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The type Event.
 * @author amoua
 */
@Entity(name = "Order")
@Table(name = "event")
public class Event {

    private int id;
    private User user;
    private int wedding_date;
    private int budget;

    /**
     * Instantiates a new Event.
     */
    public Event() {

    }

    /**
     * Instantiates a new Event.
     *
     * @param user the user
     */
    public Event(User user) {
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
     */
    public int getWedding_date() {
        return wedding_date;
    }

    /**
     * Sets wedding date.
     *
     * @param wedding_date the wedding date
     */
    public void setWedding_date(int wedding_date) {
        this.wedding_date = wedding_date;
    }

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

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", user=" + user +
                ", wedding_date=" + wedding_date +
                ", budget=" + budget +
                '}';
    }
}
