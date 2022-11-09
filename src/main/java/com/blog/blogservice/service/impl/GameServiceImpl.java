package com.blog.blogservice.service.impl;

import com.blog.blogservice.entity.Comment;
import com.blog.blogservice.entity.Game;
import com.blog.blogservice.entity.Post;
import com.blog.blogservice.exception.ResourceNotFoundException;
import com.blog.blogservice.payload.CommentDto;
import com.blog.blogservice.payload.GameDto;
import com.blog.blogservice.repository.GameRepository;
import com.blog.blogservice.service.GameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {
    private GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public GameDto createGame(GameDto gameDto) {
        Game game = mapToEntity(gameDto);

        Game newGame = gameRepository.save(game);
        return maptoDto(newGame);
    }

//    @Override
//    public List<GameDto> getAllGame() {
//        List<Game> game = gameRepository.findAll();
//        return maptoDto(game);
//    }

    private GameDto maptoDto(Game game){
        GameDto gameDto = new GameDto();
        gameDto.setId(game.getId());
        gameDto.setMDate(game.getMDate());
        gameDto.setStadium(game.getStadium());
        gameDto.setTeam1(game.getTeam1());
        gameDto.setTeam2(game.getTeam2());
        return gameDto;
    }

    private Game mapToEntity(GameDto gameDto){
        Game game = new Game();
        game.setId(gameDto.getId());
        game.setMDate(gameDto.getMDate());
        game.setStadium(gameDto.getStadium());
        game.setTeam1(gameDto.getTeam1());
        game.setTeam2(gameDto.getTeam2());
        return game;
    }
}
