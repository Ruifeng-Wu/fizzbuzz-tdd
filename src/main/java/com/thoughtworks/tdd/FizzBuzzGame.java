package com.thoughtworks.tdd;

/**
 * @author Ruifeng-Wu
 * @Email RuifengWu93@gmail.com
 * @date 2019/4/18 17:09
 */
public class FizzBuzzGame {
    final static int DIVIDEND3 = 3;
    final static int DIVIDEND5 = 5;
    final static int DIVIDEND7 = 7;

    public String fizzBuzz(int number) {
        String result = "";
        if (aliquot(number, DIVIDEND3)) {
            result += "Fizz";
        }
        if (aliquot(number, DIVIDEND5)) {
            result += "Buzz";
        }
        if (aliquot(number, DIVIDEND7)) {
            result += "Whizz";
        }
        return "".equals(result) ? String.valueOf(number) : result;
    }

    private boolean aliquot(int number, int dividend) {
        return number % dividend == 0;
    }


}
