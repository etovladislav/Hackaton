package com.hackaton.repository;

import com.hackaton.model.UserUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by etovladislav on 19.04.16.
 */
@Repository
public interface UserUrlRepository extends JpaRepository<UserUrl, Long> {
    List<UserUrl> findAllByUserId(Long id);

    List<UserUrl> findAllByUserIdAndUrl(Long userId, String url);
}
