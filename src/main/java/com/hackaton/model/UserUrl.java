package com.hackaton.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by etovladislav on 19.04.16.
 */
@Entity
@Table(name = "user_url")
public class UserUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    @Column(name = "user_hash")
    String userHash;

    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    String url;

    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    String titile;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parent_id")
    UserUrl parent;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    Integer time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserHash() {
        return userHash;
    }

    public void setUserHash(String userHash) {
        this.userHash = userHash;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitile() {
        return titile;
    }

    public void setTitile(String titile) {
        this.titile = titile;
    }

    public UserUrl getParent() {
        return parent;
    }

    public void setParent(UserUrl parent) {
        this.parent = parent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
