package com.michelfigueiredo.kata.micro.bytelandiangoldcoins;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author mfigueiredo
 */
class ByteLandianCoinsExchangeTest {

    private ByteLandianCoinsExchange bytelandianCoinsExchange;

    @BeforeEach
    void setUp() {
        bytelandianCoinsExchange = new ByteLandianCoinsExchange();
    }

    @Test
    void
    can_change_2() {
        long amountAcquired = ByteLandianCoinsExchange.exchange(2);
        assertEquals(2L, amountAcquired);
    }

    @Test
    void
    can_change_7() {
        long amountAcquired = ByteLandianCoinsExchange.exchange(7);
        assertEquals(7L, amountAcquired);
    }

    @Test
    void
    can_change_8() {
        long amountAcquired = bytelandianCoinsExchange.exchange(8);
        assertEquals(8L, amountAcquired);
    }


    @Test
    void
    can_change_12() {
        long amountAcquired = bytelandianCoinsExchange.exchange(12);
        assertEquals(13L, amountAcquired);
    }


    @Test
    void
    can_change_24() {
        long amountAcquired = bytelandianCoinsExchange.exchange(24);
        assertEquals(27L, amountAcquired);
    }

    @Test
    void
    can_change_1000000000() {
        long amountAcquired = bytelandianCoinsExchange.exchange(1000000000);
        assertEquals(4243218150L, amountAcquired);
    }

}
