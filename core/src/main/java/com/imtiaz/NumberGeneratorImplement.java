package com.imtiaz;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImplement implements NumberGenerator {


    // === Fields ===
    private final Random random = new Random();

    @Getter
    private final int minNumber;
    @Getter
    private final int maxNumber;


    // === Constructor ===
    @Autowired
    public NumberGeneratorImplement(@MinNumber int minNumber, @MaxNumber int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }


    // === Public Methods ===
    @Override
    public int next() {
        return random.nextInt(maxNumber-minNumber)+minNumber;
    }



}
