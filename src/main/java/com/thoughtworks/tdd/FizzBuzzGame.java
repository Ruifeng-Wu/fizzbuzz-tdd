package com.thoughtworks.tdd;

/**
 * @author Ruifeng-Wu
 * @Email RuifengWu93@gmail.com
 * @date 2019/4/18 17:09
 */
public class FizzBuzzGame {
    public String fizzBuzz(int number) {
        String result = "";
        if (divisible3(number)) {
            result += "Fizz";
        }
        if (divisible5(number)) {
            result += "Buzz";
        }
        if (divisible7(number)) {
            result += "Whizz";
        }
        return "".equals(result) ? String.valueOf(number) : result;
    }

    private boolean divisible7(int number) {
        return number % 7 == 0;
    }

    private boolean divisible5(int number) {
        return number % 5 == 0;
    }

    private boolean divisible3(int number) {
        return number % 3 == 0;
    }
}
