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
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "surplus_item_id")
    private SurplusItem surplusItem;

    @Enumerated(EnumType.STRING)
    private NotificationMethod notificationMethod;

    private Date createdAt = new Date();

    public enum NotificationMethod {
        EMAIL, PHONE
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public SurplusItem getSurplusItem() { return surplusItem; }
    public void setSurplusItem(SurplusItem surplusItem) { this.surplusItem = surplusItem; }

    public NotificationMethod getNotificationMethod() { return notificationMethod; }
    public void setNotificationMethod(NotificationMethod notificationMethod) { this.notificationMethod = notificationMethod; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
}
