package com.hackaton.service.impl;

import com.hackaton.model.Action;
import com.hackaton.model.Question;
import com.hackaton.model.Url;
import com.hackaton.model.UserUrl;
import com.hackaton.repository.UrlRepository;
import com.hackaton.repository.UserUrlRepository;
import com.hackaton.service.UrlService;
import com.hackaton.util.ActionDto;
import com.hackaton.util.QuestionForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by etovladislav on 19.04.16.
 */
@Service
public class UrlServiceImpl implements UrlService{

    @Autowired
    UserUrlRepository userUrlRepository;

    @Autowired
    UrlRepository urlRepository;

    @Override
    public void analizeShortestPath(String login, String startUrl, String endUrl) {

        List<UserUrl> userUrlList = userUrlRepository.findAllByUserIdAndUrl(1l, startUrl);
        List<UserUrl> urlListRes = new ArrayList<>();
        List<UserUrl> userUrlsMinimal = new ArrayList<>();
        Integer numberOfUrlMin = Integer.MAX_VALUE;
        Boolean isFind;
        for (UserUrl userUrl : userUrlList) {
            UserUrl url = userUrl;
            Integer numberOfUrl = 0;
            isFind = false;
            while(url.getParent() != null){
                numberOfUrl++;
                if (url.getUrl().equals(endUrl)) {
                    urlListRes.add(userUrl);
                    isFind = true;
                    if (numberOfUrl < numberOfUrlMin) {
                        numberOfUrlMin = numberOfUrl;
                        userUrlsMinimal.add(userUrl);
                    }
                    break;
                }
                url = url.getParent();
            }
            if (!isFind) {
                numberOfUrl++;
                if (url.getUrl().equals(endUrl)) {
                    urlListRes.add(userUrl);
                    if (numberOfUrl < numberOfUrlMin) {
                        numberOfUrlMin = numberOfUrl;
                        userUrlsMinimal.add(userUrl);
                    }
                    break;
                }
            }
        }
        userUrlList.size();
        urlListRes.size();
    }

    @Override
    @Transactional
    public void saveUrl(QuestionForm questionForm) {
        Url url = urlRepository.findOneByUrl(questionForm.getUrl());
        List<Question> questionList;
        if (url == null) {
            url = new Url();
            url.setUrl(questionForm.getUrl());
            questionList = new ArrayList<>();
        }else{
            if(url.getQuestions() != null){
                questionList = url.getQuestions();
            }else{
                questionList = new ArrayList<>();
            }
        }
        Question question = new Question();
        question.setText(questionForm.getText());
        question.setDescription(questionForm.getDescription());
        List<Action> actions = new ArrayList<>();
        for (ActionDto actionDto : questionForm.getActionList()) {
            Action action = new Action();
            action.setText(actionDto.getText());
            action.setSelector(actionDto.getSelector());
            action.setType(actionDto.getType());
            action.setQuestion(question);
            actions.add(action);
        }
        question.setUrl(url);
        question.setActionList(actions);
        questionList.add(question);
        url.setQuestions(questionList);
        urlRepository.save(url);
    }
}
