package com.blog.blogservice.payload;

import lombok.Data;

import java.util.Date;

@Data
public class GameDto {
    private Long id;
    private String mDate;
    private String stadium;
    private String team1;
    private String team2;
}
