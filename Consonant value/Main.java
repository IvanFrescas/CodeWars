package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(solve("zodics"));
        System.out.println(solve2("zodics"));

    }

    private static int solve2(String s) {
        String[] sArray = s.split("[aeiou]+");
        int result = Arrays.stream(sArray)
                .mapToInt(t -> t.chars().map(c -> c - 96).sum())
                .max()
                .getAsInt();

        return result;
    }

    public static int solve(final String s) {

        char letter;
        int highest = 0;
        int aux = 0;

        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                aux = 0;
            } else {
                aux += Character.getNumericValue(letter) - 9;
            }
            if (aux > highest) {
                highest = aux;
            }
        }

        return highest;
    }
}
