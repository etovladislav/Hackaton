package com.hackaton.util;

import com.hackaton.model.Action;
import com.hackaton.model.Url;
import java.util.List;

/**
 * Created by etovladislav on 20.04.16.
 */
public class QuestionForm {

    String text;

    String description;

    String url;

    List<ActionDto> actionList;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ActionDto> getActionList() {
        return actionList;
    }

    public void setActionList(List<ActionDto> actionList) {
        this.actionList = actionList;
    }
}
