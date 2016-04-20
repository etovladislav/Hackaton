package com.hackaton.service.impl;

import com.hackaton.model.UserUrl;
import com.hackaton.repository.UserUrlRepository;
import com.hackaton.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by etovladislav on 19.04.16.
 */
@Service
public class UrlServiceImpl implements UrlService{

    @Autowired
    UserUrlRepository userUrlRepository;

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
}
