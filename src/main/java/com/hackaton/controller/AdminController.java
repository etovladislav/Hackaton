package com.hackaton.controller;

import com.hackaton.model.Action;
import com.hackaton.model.Question;
import com.hackaton.model.Url;
import com.hackaton.repository.ActionRepository;
import com.hackaton.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 * Created by Юлия on 20.04.2016.
 */

@Controller
public class AdminController {

    @Autowired
    ActionRepository actionRepository;

    @Autowired
    QuestionRepository questionRepository;

    @RequestMapping(value = "/admin")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping(value = "/statistic")
    public String getStatisticPage(){
        return "statistic";
    }

    @RequestMapping(value = "/questions")
    public String getQuestionsWithAnswers(Model model){
        List<Question> questions = questionRepository.findAll();
        model.addAttribute("questions", questions);
        return "question-list";
    }

    @RequestMapping(value = "/urls")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<Url> getEndUrls(@RequestParam(value = "url") String url){

        return null;
    }

}
