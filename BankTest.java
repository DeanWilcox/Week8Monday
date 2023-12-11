import static org.junit.Assert.assertEquals;

import org.junit.Test;
import orgg.junit.Assert;

public class BankTest {
    @Test()
    public void testGetBalanceShouldDefaultToZero() {
        //Arrange
        Bank bank = new Bank();

        //Act
        double balance = bank.GetBalance();

        //Assert
        assertEquals(0, balance, 0);

    }
    @Test 
    public void testGetBalanceShouldInitializeViaConstructor(){
        //Arrange
        Bank bank = new Bank("Dean", 100);

        //Act
        double balance = bank.GetBalance();

        //Assert
        assertEquals(100, balance, 0);

    }
    @Test 
    public void testConvertUSDToAUD(){
        //Arrange
        double usdAmount = 100.00;

        //Act
        double audAmount = Bank.ConvertUSDToAud(usdAmount);

        //Assert
        assertEquals(expectedAudAmount, audAmount, 0.01);

    }
}