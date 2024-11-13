package com.dslistorg.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dslistorg.dslist.dto.GameListDTO;
import com.dslistorg.dslist.entities.GameList;
import com.dslistorg.dslist.repositories.GameListRepository;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(gl -> new GameListDTO(gl)).toList();
    }
}
