package fizzbuzz.kata;

public class FizzBuzz {
    public String print(int number) {
        if(number == 3){
            return "Fizz";
        }
        else if(number == 5){
            return "Buzz";
        }
        else if(number == 15){
            return "FizzBuzz";
        }

        return Integer.toString(number);
    }
}