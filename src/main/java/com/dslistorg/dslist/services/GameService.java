package com.dslistorg.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dslistorg.dslist.dto.GameMinDTO;
import com.dslistorg.dslist.entities.Game;
import com.dslistorg.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(g -> new GameMinDTO(g)).toList();
    }

}
