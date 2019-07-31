package com.michelfigueiredo.kata.micro.factorial;

import java.math.BigInteger;

class FactorialCalculator {
    private final int amount;
    private BigInteger factorial;

    public FactorialCalculator(int amount) {
        this.amount = amount;

        factorial = BigInteger.valueOf( amount );
        for (int i = amount -1; i > 1; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
    }

    public int countZerosInTheEnd() {
        if( factorial == null )return 0;
        int count = 0;
        String number = factorial.toString();
        if( number.equals("0") || !number.endsWith("0") )return 0;

        for (int i = number.length()-1; i >= 0; i--) {
            if( number.charAt(i)!= '0' ){
                break;
            }else{
                count++;
            }
        }

        return count;
    }

    public BigInteger getFactorial() {
        return factorial;
    }

}
