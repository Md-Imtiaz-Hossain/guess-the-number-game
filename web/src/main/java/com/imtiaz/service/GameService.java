package com.imtiaz.service;

public interface GameService {

    boolean isGameOver();
    String getMainMessage();
    String getResultMessage();
    Void checkGuess(int guess);
    void reset();

}
