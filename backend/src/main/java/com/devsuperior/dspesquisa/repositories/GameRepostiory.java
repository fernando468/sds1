package com.devsuperior.dspesquisa.repositories;

import com.devsuperior.dspesquisa.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepostiory extends JpaRepository<Game, Long> {
    
}
