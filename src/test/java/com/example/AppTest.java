package com.example;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testSortNumbers_WithValidInput() {
        String[] input = {"5", "3", "8", "1", "2"};
        int[] expected = {1, 2, 3, 5, 8};
        int[] result = App.sortNumbers(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortNumbers_WithNegativeNumbers() {
        String[] input = {"-1", "-3", "2", "0", "5"};
        int[] expected = {-3, -1, 0, 2, 5};
        int[] result = App.sortNumbers(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortNumbers_WithMixedInput() {
        String[] input = {"3", "-1", "2", "5", "0", "-4"};
        int[] expected = {-4, -1, 0, 2, 3, 5};
        int[] result = App.sortNumbers(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortNumbers_WithNonIntegerInput() {
        String[] input = {"3", "abc", "5"};
        assertThrows(NumberFormatException.class, () -> {
            App.sortNumbers(input);
        });
    }

    @Test
    public void testSortNumbers_WithMoreThanTenInputs() {
        String[] input = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            App.sortNumbers(input);
        });
    }
}