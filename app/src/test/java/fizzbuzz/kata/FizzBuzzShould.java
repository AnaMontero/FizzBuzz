package fizzbuzz.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzShould {
    @Test
    public void returnNumberEntered() {
        var expected = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        var actual = fizzBuzz.print(1);

        assertEquals(expected, actual);
    }

    @Test
    public void returnFizzWhenNumberIs3() {
        var expected = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        var actual = fizzBuzz.print(3);

        assertEquals(expected, actual);
    }
}