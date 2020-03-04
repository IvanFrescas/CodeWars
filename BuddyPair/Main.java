package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(buddy(2177, 4357));

    }

    public static String buddy(long start, long limit) {

        long firstBodyDivisors;
        long secondBodyDivisors;
        long firstBody;
        long secondBody;

        for (firstBody = start; firstBody <= limit; firstBody++) {

            firstBodyDivisors = SumDivisors(firstBody);
            secondBody = firstBodyDivisors - 1;
            secondBodyDivisors = SumDivisors(secondBody);


            if (firstBody == (secondBodyDivisors - 1)) {
                if (secondBody > firstBody) {
                    return "(" + firstBody + " " + secondBody + ")";
                }
            }
        }
        return "Nothing";
    }

    private static long SumDivisors (long n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                if (n/i == i) {
                    sum += i;
                }
                else {
                    sum += i;
                    sum += n/i;
                }
            }
        }
        return (sum - n);
    }

}
