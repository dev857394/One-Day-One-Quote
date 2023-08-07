package com.example.onedayonequote.controller;

import com.example.onedayonequote.model.Content;
import com.example.onedayonequote.repository.ContentRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional
@Rollback
class ContentControllerTest {

    @Autowired
    ContentController contentController;
    @Autowired
    ContentRepository contentRepository;

    @Test
    @DisplayName("랜덤 명언 가져오기")
    void getRandomQuote() {
        Content content = new Content("quotation1", "person1");
        contentRepository.save(content);

        contentController.getRandomQuote();


    }
}