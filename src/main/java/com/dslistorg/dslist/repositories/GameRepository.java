package com.dslistorg.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dslistorg.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
