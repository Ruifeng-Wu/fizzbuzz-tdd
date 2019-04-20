package com.thoughtworks.tdd;

/**
 * @author Ruifeng-Wu
 * @Email RuifengWu93@gmail.com
 * @date 2019/4/18 17:09
 */
public class FizzBuzzGame {
    public String fizzBuzz(int number) {
        String result = "";
        if (isFizz(number)) {
            result += "Fizz";
        }
        if (isBuzz(number)) {
            result += "Buzz";
        }
        if (isWhizz(number)) {
            result += "Whizz";
        }
        return "".equals(result) ? String.valueOf(number) : result;
    }

    private boolean isWhizz(int number) {
        return number % 7 == 0;
    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }
}
