package fizzbuzz.kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FizzBuzzShouldNot {

    @ParameterizedTest
    @CsvSource({
            "1, 5",
            "31, Fizz",
            "59, Buzz",
            "99, FizzBuzz"
    })
    public void returnIncorrectValueWhenNumberIsBetWeenZeroAndOneHundred(int number, String expectedValue) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var actual = fizzBuzz.print(number);

        assertNotEquals(expectedValue, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "-1, -1",
            "101, 101",
            "-3, Fizz",
            "102, Fizz",
            "-5, Buzz",
            "110, Buzz",
            "105, FizzBuzz"
    })
    public void returnValueWhenNumberIsNotBetWeenZeroAndOneHundred(int number, String expectedValue) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        var actual = fizzBuzz.print(number);

        assertNotEquals(expectedValue, actual);
    }
}