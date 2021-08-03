package com.example.workshopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class GenerateIdServiceTest {

    @Autowired
    private GenerateIdService generateIdService;

    @Test
    @DisplayName("Demo01 spring boot")
    public void case01() {
        String id = generateIdService.get();
        assertEquals("XY27", id);
    }

}