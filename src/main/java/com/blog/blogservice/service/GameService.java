package com.blog.blogservice.service;

import com.blog.blogservice.payload.GameDto;
import com.blog.blogservice.payload.PostDto;

import java.util.List;

public interface GameService {
    GameDto createGame(GameDto gameDto);
//    List<GameDto> getAllGame();
}
