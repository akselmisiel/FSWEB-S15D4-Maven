package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        return cleanedStr.equals(reversedStr);
    }

    public static String convertDecimalToBinary(int decimal) {
        LinkedList<Integer> binary = new LinkedList<>();
        while (decimal > 0) {
            binary.addFirst(decimal % 2);
            decimal = decimal / 2;
        }
        return binary.toString().replaceAll("[^0-1]", "");
    }
}