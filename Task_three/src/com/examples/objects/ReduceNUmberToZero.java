package com.examples.objects;

public class ReduceNUmberToZero {

    public static void main(String[] args) {

        System.out.println("Result is " + numberOfSteps(14, 0));

    }

    public static int numberOfSteps(int num, int steps) {


        if (num == 0) {

            return steps;

        } else {
            if (num % 2 == 0) {

                return numberOfSteps(num/2, steps+1);

            } else {

                return numberOfSteps(num-1, steps+1);
            }
        }
    }

}
