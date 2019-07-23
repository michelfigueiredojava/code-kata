package com.michelfigueiredo.kata.micro.bytelandiangoldcoins;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ByteLandianCoinsExchange {

    /**
     * in dynamic programming you reuse the values you calculated so you don't need to calculate it again and again
     * this map will hold the value and the maximum value after converting
     */
    private Map<Long,Long> map = new HashMap<>();

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            System.out.println(exchange(n) );
        }
    }

    static Long exchange(long amount) {
        if( amount < 0 || amount > 1_000_000_000 )throw new IllegalArgumentException("pass 0 <= n <= 1 000 000 000");
        ByteLandianCoinsExchange bytelandianCoinsExchange = new ByteLandianCoinsExchange();
        Long calculated = bytelandianCoinsExchange.calculateExchange(amount);
        return calculated;

    }

    private Long calculateExchange(long amount) {
        Long calculated = map.get( amount );
        if( calculated == null ){
            if( amount <= 2L )return amount;
            double nonRoundedDividedPer2 = amount / 2;
            long dividedPer2 = calculateExchange((long) Math.floor(nonRoundedDividedPer2));
            long dividedPer3 = calculateExchange((long) Math.floor(amount / 3));
            long dividedPer4 = calculateExchange((long) Math.floor(nonRoundedDividedPer2 / 2));
            long newAmount = dividedPer2 + dividedPer3 + dividedPer4;
            calculated = Math.max(amount, newAmount );
            map.put(amount, calculated);
        }
        return calculated;
    }

}
