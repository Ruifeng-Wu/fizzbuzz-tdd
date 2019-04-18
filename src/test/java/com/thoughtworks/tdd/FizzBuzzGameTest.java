package com.thoughtworks.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
}
