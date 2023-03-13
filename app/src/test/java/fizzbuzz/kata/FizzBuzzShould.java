package fizzbuzz.kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "3, Fizz",
            "5, Buzz",
            "15, FizzBuzz"
    })
    public void returnCorrectlyOutputBasedOnNumberEntered(int number, String expectedValue) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var actual = fizzBuzz.print(number);

        assertEquals(expectedValue, actual);
    }
}