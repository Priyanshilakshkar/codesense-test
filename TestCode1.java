package com.example;

public class TestCode {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = calculateSum(numbers);

        System.out.println("Sum=" + sum);
    }

    public static int calculateSum(int[] numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i--) {
            sum += numbers[i];
        }

        return sum;
    }
}
