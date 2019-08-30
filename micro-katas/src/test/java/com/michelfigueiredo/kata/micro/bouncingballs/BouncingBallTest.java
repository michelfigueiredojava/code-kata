package com.michelfigueiredo.kata.micro.bouncingballs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BouncingBallTest {

    @Test
    void can_bounce_from_height_3_bounce_066_window_150() {
        int ballSeenCount = BouncingBall.bouncingBall( 3, 0.66, 1.5 );

        assertEquals( 3, ballSeenCount );
    }

    @Test
    void can_bounce_from_height_30_bounce_066_window_150() {
        int ballSeenCount = BouncingBall.bouncingBall( 30, 0.66, 1.5 );

        assertEquals( 15, ballSeenCount );
    }


    @Test
    void can_bounce_from_height_30000_bounce_090_window_100() {
        int ballSeenCount = BouncingBall.bouncingBall( 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999D,
            0.99,
            0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001D );

        assertEquals( 180993, ballSeenCount );
    }


    @Test
    void cant_bounce_from_invalid_height() {
        int ballSeenCount = BouncingBall.bouncingBall( 0, 0.66, 1.5 );

        assertEquals( -1, ballSeenCount );
    }

    @Test
    void cant_bounce_from_bounce_less_than_0() {
        int ballSeenCount = BouncingBall.bouncingBall( 3, -0.1, 1.5 );

        assertEquals( -1, ballSeenCount );
    }

    @Test
    void cant_bounce_from_bounce_greater_than_1() {
        int ballSeenCount = BouncingBall.bouncingBall( 3, 1.1, 1.5 );

        assertEquals( -1, ballSeenCount );
    }

    @Test
    void cant_bounce_from_invalid_window_height() {
        int ballSeenCount = BouncingBall.bouncingBall( 1, 0.66, 1 );

        assertEquals( -1, ballSeenCount );
    }

}
