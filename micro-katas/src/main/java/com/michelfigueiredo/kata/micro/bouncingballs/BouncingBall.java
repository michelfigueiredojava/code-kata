package com.michelfigueiredo.kata.micro.bouncingballs;

public class BouncingBall {
    public static int bounce(int buildingHeight, double bounce, double windowHeight) {
        int seenCounter;
        double ballHeight = buildingHeight;

        seenCounter = 1;
        while( (ballHeight = ballHeight * bounce) > windowHeight ){
            seenCounter = seenCounter + 2;
        };

        return seenCounter;
    }
}
