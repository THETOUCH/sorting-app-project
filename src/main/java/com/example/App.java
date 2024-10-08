package com.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        if (args.length > 10) {
            System.out.println("Please, write less than 10 symbols");
            return;
        }

        try {
            int[] sortedNumbers = sortNumbers(args);
            System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));
        } catch (NumberFormatException e) {
            System.out.println("Error: only Integer");
        }
    }

    // Метод для сортировки чисел
    public static int[] sortNumbers(String[] args) {
        if (args.length > 10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        Arrays.sort(numbers);
        return numbers;
    }
}