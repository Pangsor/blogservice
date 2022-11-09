package com.blog.blogservice.repository;

import com.blog.blogservice.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
