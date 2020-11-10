package com.company;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        // Create two new BigDecimals
        BigDecimal bd1 =
                new BigDecimal("124567890.0987654321");
        BigDecimal bd2 =
                new BigDecimal("987654321.123456789");

        // Addition of two BigDecimals
        bd1 = bd1.add(bd2);
        System.out.println("BigDecimal add = " + bd1);

        // Multiplication of two BigDecimals
        bd1 = bd1.multiply(bd2);
        System.out.println("BigDecimal multyply = " + bd1);

        // Subtraction of two BigDecimals
        bd1 = bd1.subtract(bd2);
        System.out.println("BigDecimal substract = " + bd1);

        // Division of two BigDecimals
        bd1 = bd1.divide(bd2);
        System.out.println("BigDecimal divide = " + bd1);

        // BigDecima1 raised to the power of 2
        bd1 = bd1.pow(2);
        System.out.println("BigDecimal pow = " + bd1);

        // Negate value of BigDecimal1
        bd1 = bd1.negate();
        System.out.println("BigDecimal negate = " + bd1);
    }
}

