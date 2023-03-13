package fizzbuzz.kata;

public class FizzBuzz {
    public String print(int number) {
        if(number >= 0 && number <= 100) {

            return CalculationHandler.calculateValueToReturn(number);
        }
        return "Value out of limits";
    }
}