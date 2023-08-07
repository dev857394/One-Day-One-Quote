package com.example.onedayonequote.controller;

import com.example.onedayonequote.dto.QuoteResponseDto;
import com.example.onedayonequote.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class ContentController {

    private final ContentService contentService;

//    @GetMapping("/")
    public ResponseEntity<QuoteResponseDto> getRandomQuote() {
        QuoteResponseDto randomQuote = contentService.getRandomQuote();

        return ResponseEntity.status(HttpStatus.OK)
                .body(randomQuote);
    }

    @GetMapping("/")
    public String getRandomQuoteHome(Model model) {
        QuoteResponseDto randomQuote = contentService.getRandomQuote();

        model.addAttribute("randomQuote", randomQuote);
//        model.addAttribute("randomQuote.person", randomQuote.getPerson());

        return "homethymeleaf";
    }


}
