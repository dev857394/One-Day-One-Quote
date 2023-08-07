package com.example.onedayonequote.repository;

import com.example.onedayonequote.model.Content;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ContentRepositoryTest {

    @Autowired
    ContentRepository contentRepository;

    @Test
    void save() {
        Content content = new Content("quotation1", "person1");
        contentRepository.save(content);
    }

}