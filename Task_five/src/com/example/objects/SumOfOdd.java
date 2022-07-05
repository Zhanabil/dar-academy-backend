package com.example.objects;

public class SumOfOdd {

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3};

        System.out.println("Answer is: " + sumOddLengthSubArrays(arr));
    }

    public static int sumOddLengthSubArrays(int[] arr) {

        int result = 0;
        int[] temp = new int[arr.length];
        int left = 0;
        int mid = arr.length/2 + 1;
        int end = arr.length-1;

        if(arr.length > 2) {

        }


        for(int i=0; i<arr.length; i++) {
            temp[0] = arr[i];
            result += sumOfArray(temp);
            System.out.println(temp[0] + " : " + sumOfArray(temp) + " : " + result);
        }

        return result;
    }

    public static int sumOfArray(int[] arr) {

        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
