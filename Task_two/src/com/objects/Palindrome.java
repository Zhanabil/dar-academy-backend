package com.objects;

public class Palindrome {

    public static void main(String args[]) {

        System.out.println(isPalindrome(9229));
    }

    public static boolean isPalindrome(int x) {

        boolean answer = false;
        int a, a2, b, b2, c, c2;

        if (x < 10 && x > -10) {
            answer = true;
        } else if (x > 10 && x < 100){
            a = x / 10;
            a2 = x % 10;

            if(a == a2) {
                answer = true;
            }
        } else if (x > 100 && x < 1000) {

            a = x / 100;
            a2 = x % 10;

            if(a == a2) {
                answer = true;
            }
        } else if (x > 1000 && x < 10000) {
            a = x / 1000;
            a2 = x % 10;
            b = (x / 100) % 10;
            b2 = ( x % 100) / 10;

            if (a == a2 && b == b2) {
                answer = true;
            }
        }

        return answer;
    }
}
