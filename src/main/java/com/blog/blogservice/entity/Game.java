package com.blog.blogservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(
        name = "game"
)
public class Game {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String mDate;
    private String stadium;
    private String team1;
    private String team2;

}
