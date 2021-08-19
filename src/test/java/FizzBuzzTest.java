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
    @Test
    void toPrintFizzWhenNumberContainsThree(){
        FizzBuzz fizzbuzz=new FizzBuzz(13);
        assertEquals("Fizz",fizzbuzz.fizzBuzz());
    }
    @Test
    void toPrintBuzzWhenNumberContainsFive(){
        FizzBuzz fizzbuzz=new FizzBuzz(56);
        assertEquals("Buzz",fizzbuzz.fizzBuzz());
    }
    @Test
    void toPrintFizzBuzzWhenNumberDivisibleByThreeAndFive(){
        FizzBuzz fizzbuzz=new FizzBuzz(30);
        assertEquals("FizzBuzz",fizzbuzz.fizzBuzz());
    }
    @Test
    void toPrintNullWhenNumberIsNeitherDisibleNorContainsThreeAndFive(){
        FizzBuzz fizzbuzz=new FizzBuzz(7);
        assertEquals(null,fizzbuzz.fizzBuzz());
    }
}
