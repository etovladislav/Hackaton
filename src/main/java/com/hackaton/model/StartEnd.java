package com.hackaton.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by etovladislav on 19.04.16.
 */
@Entity
@Table(name = "start_end")
public class StartEnd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    @Column(name = "start_url")
    String startUrl;

    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    @Column(name = "end_url")
    String endUrl;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartUrl() {
        return startUrl;
    }

    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }

    public String getEndUrl() {
        return endUrl;
    }

    public void setEndUrl(String endUrl) {
        this.endUrl = endUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
