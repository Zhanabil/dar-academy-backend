package com.example.objects;

public class Palindrome {

    public static void main(String args[]) {

        System.out.println(isPolindrome(9889));
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
        } else if (x > 1000 && x < 10000) {
            int a = x / 1000;
            int a2 = x % 10;
            int b = ( x / 100 ) % 10;
            int b2 = ( x % 100) / 10;

            System.out.println(a + " " + a2 + " - " + b + " " + b2);
            if ( a == a2 && b == b2) {

                answer = true;
            }
        }

        return answer;
    }
}
