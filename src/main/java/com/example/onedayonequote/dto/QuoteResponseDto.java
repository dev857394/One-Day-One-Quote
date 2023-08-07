package com.example.onedayonequote.dto;

import com.example.onedayonequote.model.Content;
import lombok.Getter;

@Getter
public class QuoteResponseDto {
    private String quotation;
    private String person;

    public QuoteResponseDto(Content content) {
        this.quotation = content.getQuotation();
        this.person = content.getPerson();
    }
}
