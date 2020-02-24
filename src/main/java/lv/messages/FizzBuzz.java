package lesson3;

public class FizzBuzz {
    public String fizzBuzz(int inputNumber){
        if (inputNumber % 3 == 0) {
            if (inputNumber % 5 == 0) {
                return "fizzbuzz";
            } else {
                return "fizz";
            }
        } else if (inputNumber % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(inputNumber);
    }
}
