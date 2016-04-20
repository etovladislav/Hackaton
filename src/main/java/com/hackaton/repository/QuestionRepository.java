package com.hackaton.repository;

import com.hackaton.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by etovladislav on 20.04.16.
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
