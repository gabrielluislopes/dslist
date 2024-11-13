package com.gabriellopes.dslist.repositories;

import com.gabriellopes.dslist.entities.Game;
import com.gabriellopes.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {



}
