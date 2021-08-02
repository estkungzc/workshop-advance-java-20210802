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

    @Test
    @DisplayName("case-demo02 : ทดสอบ database")
    public void case02() {
        // Arrange
        Hello hello = new Hello();
        hello.userDB = new UserDB() {
            @Override
            public String getNameById(int id) {
                return "Chairat";
            }
        };
        // Act
        String name = hello.workWithDb(1);
        // Assert
        assertEquals("Chairat", name);
    }

}