package com.gabriellopes.dslist.repositories;

import com.gabriellopes.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {



}
