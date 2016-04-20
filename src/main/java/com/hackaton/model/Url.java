package com.hackaton.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

/**
 * Created by etovladislav on 19.04.16.
 */
@Entity
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    String url;

    @JsonIgnore
    @OneToMany(mappedBy = "url", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Question> questions;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
