package com.example.onedayonequote.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String quotation;

    @Column
    private String person;

    public Content(String quotation, String person) {
        this.quotation = quotation;
        this.person = person;
    }
}
