package com.michelfigueiredo.kata.micro.bouncingballs;

public class BouncingBall {
    public static int bounce(int buildingHeight, double bounce, double windowHeight) {
        int seenCounter;
        double ballHeight = buildingHeight;

        seenCounter = 1;
        do{
            seenCounter = seenCounter + 2;
            ballHeight = ballHeight * bounce;
        }while( ballHeight > windowHeight );

        return seenCounter;
    }
}
