package com.thoughtworks.tdd;

/**
 * @author Ruifeng-Wu
 * @Email RuifengWu93@gmail.com
 * @date 2019/4/18 17:09
 */
public class FizzBuzzGame {
    public String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "BuzzWhizz";
        }
        if (number % 3 == 0 && number % 7 == 0) {
            return "FizzWhizz";
        }
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 7 == 0) {
            return "Whizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        return "" + number;
    }
}
