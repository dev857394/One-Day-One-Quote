package com.example.onedayonequote.service;

import com.example.onedayonequote.repository.ContentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Rollback
class ContentServiceTest {

    @Autowired ContentService contentService;
    @Autowired
    ContentRepository contentRepository;

    @Test
    void getRandomNumTest() {

        Random random = new Random();
        int randomIdx = random.nextInt(3000);
        System.out.println("randomIdx = " + randomIdx);
    }
}