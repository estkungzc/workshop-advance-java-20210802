package com.example.workshopdip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GenerateIdServiceUnitTest {

    @Mock
    private Random random;

    @Test
    @DisplayName("เริ่มต้นทดสอบกับ mockito + junit5")
    public void case01(){
        // Arrange
        GenerateIdService generateIdService = new GenerateIdService(random);
        when(random.nextInt(anyInt())).thenReturn(7); // Stub
        // Act
        String id = generateIdService.get();
        // Assert
        assertEquals("XYZ7", id);
    }

}