package com.hackaton.repository;

import com.hackaton.model.Question;
import com.hackaton.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by etovladislav on 20.04.16.
 */
public interface UrlRepository  extends JpaRepository<Url, Long>{

    Url findOneByUrl(String url);
}
