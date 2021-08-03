package com.example.workshopdip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GenerateIdService {

    private final Random random;

    @Autowired
    public GenerateIdService(Random random) {
        this.random = random;
    }

    public String get() {
        int number = random.nextInt(10);
        return "XYZ" + number;
    }

}