package com.hackaton.model;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by etovladislav on 19.04.16.
 */
@Entity
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    String selector;

    String type;

    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    String text;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    Question question;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
