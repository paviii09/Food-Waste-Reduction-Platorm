package com.example.fwrp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import java.util.Date;


@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "surplus_item_id")
    private SurplusItem surplusItem;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    private Action action;

    private Date createdAt = new Date();

    public enum Action {
        CLAIMED, PURCHASED
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public SurplusItem getSurplusItem() { return surplusItem; }
    public void setSurplusItem(SurplusItem surplusItem) { this.surplusItem = surplusItem; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Action getAction() { return action; }
    public void setAction(Action action) { this.action = action; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
}
