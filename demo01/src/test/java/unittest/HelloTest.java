package unittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("case-demo01")
    public void case01() {
        // Arrange
        Hello hello = new Hello();
        // Act
        String actualResult = hello.hi("Chairat");
        // Assert
        assertEquals("Hello, Chairat", actualResult);
    }

}