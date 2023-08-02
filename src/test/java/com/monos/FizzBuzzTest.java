package com.monos;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void testCheckIfisDivisible() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkIfisDivisible(3);
        assertEquals("Fizz", result);
        assertThat(result, is("Fizz"));
    }

    @Test
    void testCheckIfisDivisibleBy5(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkIfisDivisible(5);
        assertEquals("Buzz", result);
        assertThat(result, is("Buzz"));
        
    }

    // @Test
    // void testCheckIfisDivisibleBy3and5(){
    //     FizzBuzz fizzbuzz = new FizzBuzz();
    //     String result = fizzbuzz.checkIfisDivisible(15);
    //     assertEquals("FizzBuzz",result);     
    // }

    
    

    


}
