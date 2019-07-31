package com.michelfigueiredo.kata.micro.factorial;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {

    @Test
    void can_calculate_factorial_of_3() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(3);
        BigInteger result = factorialCalculator.getFactorial();

        assertEquals( BigInteger.valueOf(6), result );
    }

    @Test
    void can_calculate_factorial_of_10() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(10);
        BigInteger result = factorialCalculator.getFactorial();

        assertEquals( BigInteger.valueOf(3628800), result );
    }

    @Test
    void can_calculate_zeros_in_factorial_of_3() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(3);
        int zerosInTheEnd = factorialCalculator.countZerosInTheEnd();

        assertEquals( 0, zerosInTheEnd );
    }

    @Test
    void can_calculate_zeros_in_factorial_of_6() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(6);
        int zerosInTheEnd = factorialCalculator.countZerosInTheEnd();

        assertEquals( 1, zerosInTheEnd );
    }

    @Test
    void can_calculate_zeros_in_factorial_of_60() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(60);
        int zerosInTheEnd = factorialCalculator.countZerosInTheEnd();

        assertEquals( 14, zerosInTheEnd );
    }

    @Test
    void can_calculate_zeros_in_factorial_of_100() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(100);
        int zerosInTheEnd = factorialCalculator.countZerosInTheEnd();

        assertEquals( 24, zerosInTheEnd );
    }


    @Test
    void can_calculate_zeros_in_factorial_of_1024() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(1024);
        int zerosInTheEnd = factorialCalculator.countZerosInTheEnd();

        assertEquals( 253, zerosInTheEnd );
    }


    @Test
    void can_calculate_zeros_in_factorial_of_23456() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(23456);
        int zerosInTheEnd = factorialCalculator.countZerosInTheEnd();

        assertEquals( 5861, zerosInTheEnd );
    }


    @Test
    void can_calculate_zeros_in_factorial_of_8735373() {
        FactorialCalculator factorialCalculator = new FactorialCalculator(8735373);
        int zerosInTheEnd = factorialCalculator.countZerosInTheEnd();

        assertEquals( 2183837, zerosInTheEnd );
    }
}

