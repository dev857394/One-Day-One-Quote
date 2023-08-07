package com.example.onedayonequote.service;

import com.example.onedayonequote.dto.QuoteResponseDto;
import com.example.onedayonequote.model.Content;
import com.example.onedayonequote.repository.ContentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Random;

@Slf4j
@RequiredArgsConstructor
@Service
public class ContentService {

    private final ContentRepository contentRepository;

//    public QuoteResponseDto getRandomQuote() {
//        long count = contentRepository.count();
//        log.info("count query");
//        int idx = (int) (Math.random() * count); // 0.23279967568276427 * count, count 범위 안에서 랜덤;
//        log.info("set index");
//        PageRequest pageRequest = PageRequest.of(idx, 1); // size 1인 랜덤한 idx 페이지 = quote 값
//        log.info("set pageRequest");
//        Page<Content> quotePage = contentRepository.findAll(pageRequest);
//        log.info("find quotepage");
//
//        if (!quotePage.hasContent()) {
//            throw new IllegalArgumentException("값을 찾을 수 없음");
//        }
//
//        return new QuoteResponseDto(quotePage.getContent().get(0));
//    }

    @Transactional
    public QuoteResponseDto getRandomQuote() {
        long count = contentRepository.count();
        System.out.println("count = " + count);

        Random random = new Random();
        int idx = random.nextInt((int) count);
        System.out.println("idx = " + idx);
        /*
        * idx 범위 : 0~count-1 이므로, +1을 해준다.
        * */
        Content content = contentRepository.findById((long) idx+1)
                .orElseThrow(() -> new IllegalArgumentException("No Content!"));

        return new QuoteResponseDto(content);
    }
}
