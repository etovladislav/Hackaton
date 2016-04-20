package com.hackaton.controller;

import com.hackaton.model.Question;
import com.hackaton.repository.QuestionRepository;
import com.hackaton.repository.UrlRepository;
import com.hackaton.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by etovladislav on 19.04.16.
 */
@Controller
public class IndexController {

    @Autowired
    UrlService urlService;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    UrlRepository urlRepository;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getIndexPage() {
        return "hello";
    }

    @RequestMapping(value = "/analyse", method = RequestMethod.GET)
    public String analyse(Model model) {
        urlService.analizeShortestPath("etovladislav", "http://www.gearbest.com/", "http://cart.gearbest.com/m-flow-a-cart.htm");
        return "analyse";
    }

    @RequestMapping(value = "/getActions", method = RequestMethod.GET)
    @ResponseBody
    public List<Question> getAllActions(@RequestParam("url") String url) {
        List<Question> questionList = urlRepository.findOneByUrl(url).getQuestions();
        List<Question> questionList1 = new ArrayList<>();
        for (int i = 0; i < questionList.size(); i++) {
            Question question = questionList.get(i);
            question.setId(Long.valueOf(i));
            questionList1.add(question);
        }
        return questionList1;
    }
}
