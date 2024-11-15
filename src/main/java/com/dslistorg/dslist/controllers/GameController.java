package com.dslistorg.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dslistorg.dslist.dto.GameDTO;
import com.dslistorg.dslist.dto.GameMinDTO;
import com.dslistorg.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService GameService;

    @GetMapping(value = "/{id}")
    public GameDTO findAll(@PathVariable Long id) {
        return GameService.findById(id);
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = GameService.findAll();
        return result;
    }

}
