import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void toPrintFizzWhenNumberDivisibleByThree(){
        FizzBuzz fizzbuzz=new FizzBuzz(9);
        assertEquals("Fizz",fizzbuzz.fizzBuzz());
    }
    @Test
    void toPrintBuzzWhenNumberDivisibleByFive(){
        FizzBuzz fizzbuzz=new FizzBuzz(10);
        assertEquals("Buzz",fizzbuzz.fizzBuzz());
    }

}
