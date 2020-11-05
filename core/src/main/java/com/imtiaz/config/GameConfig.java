package com.imtiaz.config;

import com.imtiaz.GuessCount;
import com.imtiaz.MaxNumber;
import com.imtiaz.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
@ComponentScan(basePackages = "com.imtiaz")

public class GameConfig {

    // === fields ===
    @Value("${game.minNumber:5}")
    private int minNumber;

    @Value("${game.maxNumber:25}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;


    // === bean method ===
    @Bean
    @MinNumber
    public int minNumber(){
        return minNumber;
    }

    @Bean
    @MaxNumber
    public int maxNumber(){
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount(){
        return guessCount;
    }

}
