package com.dslistorg.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dslistorg.dslist.dto.GameListDTO;
import com.dslistorg.dslist.dto.GameMinDTO;
import com.dslistorg.dslist.dto.ReplacementDTO;
import com.dslistorg.dslist.services.GameListService;
import com.dslistorg.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;
    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findALl() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findAll(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

}
