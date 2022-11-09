package com.blog.blogservice.controller;

import com.blog.blogservice.payload.GameDto;
import com.blog.blogservice.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/game")
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public ResponseEntity<GameDto> createGame(@RequestBody GameDto gameDto){
        return new ResponseEntity<>(gameService.createGame(gameDto), HttpStatus.CREATED);
    }
}
