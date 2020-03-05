package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFracts(new int[][]{{1, 3}, {5, 3}}));
    }

    public static String sumFracts(int[][] l) {

        if (l.length <= 0) return null;
        int up = l[0][0];
        int down = l[0][1];

        for (int i = 1; i < l.length; i++) {

            int A = up;
            int B = down;
            int C = l[i][0];
            int D = l[i][1];

            down = B * D;
            up = (down / B * A) + (down / D * C);

        }
        return asFraction(up, down);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static String asFraction(int a, int b) {
        long gcd = gcd(a, b);
        if ((b / gcd) == 1) {
            return "" + a / b;
        } else {
            return "[" + (a / gcd) + ", " + (b / gcd) + "]";
        }
    }
}
