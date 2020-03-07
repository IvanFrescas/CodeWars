package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        parseInt("seven hundred eighty-three thousand nine hundred and nineteen");
    }

    public static int parseInt(String numStr) {
        numStr = numStr.replace('-', ' ');
        numStr = numStr.replace(" and", "");
        String[] numberText = numStr.split(" ");

        HashMap<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(0, "zero");
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");
        numbers.put(11,"eleven");
        numbers.put(12,"twelve");
        numbers.put(13,"thirteen");
        numbers.put(14,"fourteen");
        numbers.put(15,"fifteen");
        numbers.put(16,"sixteen");
        numbers.put(17,"seventeen");
        numbers.put(18,"eighteen");
        numbers.put(19,"nineteen");
        numbers.put(20, "twenty");
        numbers.put(30, "thirty");
        numbers.put(40, "forty");
        numbers.put(50, "fifty");
        numbers.put(60, "sixty");
        numbers.put(70, "seventy");
        numbers.put(80, "eighty");
        numbers.put(90, "ninety");

        int result = 0;
        int finalResult = 0;

        for (String word : numberText) {
            for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
                Integer numberInt = entry.getKey();
                String numberString = entry.getValue();

                if (word.equals(numberString)) {
                    result += numberInt;
                }
            }
            if (word.equals("hundred")) {
                result *= 100;
            }
            if (word.equals("thousand")) {
                result *= 1000;
                finalResult += result;
                result = 0;
            }
            if (word.equals("million")) {
                result *= 1000000;
            }
        }

        finalResult += result;
        return finalResult;
    }

}
