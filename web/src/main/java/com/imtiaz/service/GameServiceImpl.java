package com.imtiaz.service;

import com.imtiaz.Game;
import com.imtiaz.MessageGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    private final Game game;
    private final MessageGenerator messageGenerator;

    @Autowired
    public GameServiceImpl(Game game, MessageGenerator messageGenerator) {
        this.game = game;
        this.messageGenerator = messageGenerator;
    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public String getMainMessage() {
        return null;
    }

    @Override
    public String getResultMessage() {
        return null;
    }

    @Override
    public Void checkGuess(int guess) {
        return null;
    }

    @Override
    public void reset() {

    }
}
