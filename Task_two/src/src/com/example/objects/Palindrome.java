package com.example.objects;

public class Palindrome {

    public static void main(String args[]) {

        System.out.println(isPolindrome(323));
    }

    public static boolean isPolindrome(int x) {

        boolean answer = false;

        if(x < 10 && x > -10) {
            answer = true;
        } else if (x > 100 && x < 1000){
            int a = x / 100;
            int b = x % 10;

            if (a == b) {
                answer = true;
            }
        }

        return answer;
    }
}
