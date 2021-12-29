package FizzBuzz;

public class FizzBuzz {
    public String check(int number) {
        if(number <= 0) {
            throw new IllegalArgumentException("The number must be greater than zero.");
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if(number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
