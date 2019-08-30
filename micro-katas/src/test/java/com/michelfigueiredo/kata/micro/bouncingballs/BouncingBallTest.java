package com.michelfigueiredo.kata.micro.bouncingballs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BouncingBallTest {

    @Test
    void can_bounce_from_height_3_bounce_066_window_150() {
        int ballSeenCount = BouncingBall.bounce( 3, 0.66, 1.5 );

        assertEquals( 3, ballSeenCount );
    }


    @Test
    void can_bounce_from_height_30_bounce_066_window_150() {
        int ballSeenCount = BouncingBall.bounce( 30, 0.66, 1.5 );

        assertEquals( 15, ballSeenCount );
    }

}
