package com.example.onedayonequote.repository;

import com.example.onedayonequote.model.Content;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {

    @Override
    Page<Content> findAll(Pageable pageable);
}
