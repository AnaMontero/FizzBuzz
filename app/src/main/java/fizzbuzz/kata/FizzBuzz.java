package fizzbuzz.kata;

public class FizzBuzz {
    public String print(int number) {
        var text = "";
        if(number == 3){
            text = "Fizz";
        }
        else {
            text = Integer.toString(number);
        }
        return text;
    }
}
