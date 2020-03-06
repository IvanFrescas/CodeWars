package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println(easyLine(4));
    }

    private static BigInteger easyLine(int line) {

        BigInteger[][] triangle = new BigInteger[line + 1][line + 1];

        for (int j = 0; j < triangle.length; j++) {
            triangle[j][0] = BigInteger.valueOf(1);
            triangle[j][j] = BigInteger.valueOf(1);
        }

        for (int j = 2; j < triangle.length; j++) {
            for (int k = 1; k < j; k++) {
                triangle[j][k] = triangle[j - 1][k - 1].add(triangle[j - 1][k]);
            }
        }

        BigInteger res = BigInteger.ZERO;
        for (int j = 0; j < triangle.length; j++) {
            res = res.add(triangle[line][j].pow(2));
        }
        return res;
    }
}