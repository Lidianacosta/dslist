package com.dslistorg.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dslistorg.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
