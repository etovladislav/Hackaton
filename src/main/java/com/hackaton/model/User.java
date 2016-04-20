package com.hackaton.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by etovladislav on 19.04.16.
 */
@Entity
@Table(name = "account")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String login;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    List<UserUrl> userUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public List<UserUrl> getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(List<UserUrl> userUrl) {
        this.userUrl = userUrl;
    }
}
