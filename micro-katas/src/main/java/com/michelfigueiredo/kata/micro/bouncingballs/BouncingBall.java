package com.michelfigueiredo.kata.micro.bouncingballs;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0) return -1;
        if (bounce <= 0 || bounce >= 1) return -1;
        if (window >= h) return -1;

        int seenCounter;
        double ballHeight = h;

        seenCounter = 1;
        while ((ballHeight = ballHeight * bounce) > window) {
            seenCounter = seenCounter + 2;
        }
        return seenCounter;

    }
}
