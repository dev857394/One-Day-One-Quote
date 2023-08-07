package com.example.onedayonequote;

import com.example.onedayonequote.model.Content;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;


@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbInit();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {
        private final EntityManager entityManager;

        public void dbInit() {
            String quotation;
            String person;

            for (int i = 1; i <= 5; i++) {
                quotation = "quotation"+i;
                person = "person"+i;

                Content content = new Content(quotation, person);

                entityManager.persist(content);
            }
        }
    }

}
