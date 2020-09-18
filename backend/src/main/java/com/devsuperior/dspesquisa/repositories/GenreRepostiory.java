package com.devsuperior.dspesquisa.repositories;

import com.devsuperior.dspesquisa.entities.Genre;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepostiory extends JpaRepository<Genre, Long> {
    
}
