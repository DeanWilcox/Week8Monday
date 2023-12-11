//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.ArrayBlockingQueue;

import org.junit.Test;

public class MainTest {
    /**
     * 
     */
    @Test
    public void testIsPrimeTrue(){
        // Arrange

        // Act
        boolean output = Main.IsPrime(5);

        // Assert
        assertTrue(output);

    }

    @Test
    public void testIsPrimeFalse(){
        // Arrange

        // Act
        boolean output = Main.IsPrime(4);

        // Assert
        assertFalse(output);
    }
    @Test
    
    public void testIsPrimeNumber1(){
        // Arrange

        // Act
        boolean output = Main.IsPrime(1);

        // Assert
        assertTrue(output);
    }
     @Test
    
    public void testIsPrimeNegativeNumber(){
        // Arrange

        // Act
        boolean output = Main.IsPrime(-1);

        // Assert
        assertFalse(output);
    }
     @Test
    
    public void testIsPrimeHighNumber(){
        // Arrange

        // Act
        boolean output = Main.IsPrime(97);

        // Assert
        assertTrue(output);
    }
    @Test (expected = NullPointerException.class)
        public void nullPointerSpecial2023() {
        Main.Special(2023);
    }
    
}