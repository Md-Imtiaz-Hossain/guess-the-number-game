package com.imtiaz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class MessageGeneratorImplement implements MessageGenerator {


    // === Fields ===
    private final Game game;


    // === Constructor ===
    public MessageGeneratorImplement(Game game) {
        this.game = game;
    }


    // === init ===
    @PostConstruct
    public void init(){
        log.info("game = {}", game);
    }


    // === public methods ===
    @Override
    public String getMainMessage() {
        return "Number is between " + game.getSmallest() + " and " + game.getBiggest() + ". Can you guess it? ";
    }

    @Override
    public String getResultMessage() {

        if (game.isGameWon()){
            return "You guess it! The number was " + game.getNumber();
        }else if (game.isGameLost()){
            return "You lost. The Number was " + game.getNumber();
        }else if (!game.isValidNumberRange()){
            return "Invalid Number Range";
        }else if (game.getRemainingGuesses() == game.getGuessCount()){
            return "What is your first guess ?";
        }else{
            String direction = "Lower";

            if (game.getGuess() < game.getNumber()){
                direction = "Higher";
            }
            return direction + "! You Have " + game.getRemainingGuesses() + " Guesses Left" ;
        }
    }
}
