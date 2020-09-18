package com.devsuperior.dspesquisa.services;

import java.time.Instant;

import com.devsuperior.dspesquisa.dto.RecordDTO;
import com.devsuperior.dspesquisa.dto.RecordInsertDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.Record;
import com.devsuperior.dspesquisa.repositories.GameRepository;
import com.devsuperior.dspesquisa.repositories.RecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RecordService {
    @Autowired
    private RecordRepository repository;
    
    @Autowired
    private GameRepository gameRpository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto) {
        Record entity = new Record();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());
        // getOne instancia o objeto do tipo que voce precisa, ele nao vai no
        // banco de dados ainda só instancia o objeto monitorado para associar, 
        // quando voce salvar ele vai no banco de dados para fazer a associacao
        Game game = gameRpository.getOne(dto.getGameId());
        entity.setGame(game);
        entity = repository.save(entity);
        return new RecordDTO(entity);
    }
}
