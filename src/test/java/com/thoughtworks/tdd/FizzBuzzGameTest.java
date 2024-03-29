package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * @author Ruifeng-Wu
 * @Email RuifengWu93@gmail.com
 * @date 2019/4/17 17:12
 */
public class FizzBuzzGameTest {
    FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

    @Test
    public void returns_the_number_given_number_not_divisible_by_3_5_nor_7() throws Exception {

        assertThat(fizzBuzzGame.fizzBuzz(1), is("1"));
    }

    @Test
    public void returns_Fizz_given_number_divisible_by_3() throws Exception {
        assertThat(fizzBuzzGame.fizzBuzz(3), is("Fizz"));
    }

    @Test
    public void returns_Buzz_given_number_divisible_by_5() throws Exception {
        assertThat(fizzBuzzGame.fizzBuzz(5), is("Buzz"));
    }

    @Test
    public void returns_Whizz_given_number_divisible_by_7() throws Exception {
        assertThat(fizzBuzzGame.fizzBuzz(7), is("Whizz"));
    }

    @Test
    public void returns_FizzBuzz_given_number_divisible_by_both_3_5() throws Exception {
        assertThat(fizzBuzzGame.fizzBuzz(15), is("FizzBuzz"));
    }

    @Test
    public void returns_FizzWhizz_given_number_divisible_by_both_3_7() throws Exception {
        assertThat(fizzBuzzGame.fizzBuzz(21), is("FizzWhizz"));
    }

    @Test
    public void returns_BuzzWhizz_given_number_divisible_by_both_5_7() throws Exception {
        assertThat(fizzBuzzGame.fizzBuzz(35), is("BuzzWhizz"));
    }

    @Test
    public void returns_FizzBuzzWhizz_given_number_divisible_by_3_5_7() throws Exception {
        assertThat(fizzBuzzGame.fizzBuzz(105), is("FizzBuzzWhizz"));
    }
}
