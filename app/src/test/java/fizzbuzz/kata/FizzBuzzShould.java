package fizzbuzz.kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "98, 98",
            "3, Fizz",
            "6, Fizz",
            "63, Fizz",
            "5, Buzz",
            "10, Buzz",
            "55, Buzz",
            "15, FizzBuzz",
            "30, FizzBuzz",
            "45, FizzBuzz"
    })
    public void returnCorrectOutputBasedOnNumberEntered(int number, String expectedValue) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var actual = fizzBuzz.print(number);

        assertEquals(expectedValue, actual);
    }
}