package com.hackaton.service;

import com.hackaton.util.QuestionForm;

/**
 * Created by etovladislav on 19.04.16.
 */
public interface UrlService {

    void analizeShortestPath(String login, String startUrl, String endUrl);

    void saveUrl(QuestionForm questionForm);
}
