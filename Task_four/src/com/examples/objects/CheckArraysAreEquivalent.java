package com.examples.objects;

public class CheckArraysAreEquivalent {

    public static void main(String args[]) {

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEquivalent(word1, word2));
    }

    public static boolean arrayStringsAreEquivalent(String[] word1, String[] word2) {

        String sumOfWord_one = "";
        String sumOfWord_two = "";
        boolean answer = false;

        for(int i=0; i<word1.length; i++) {
            sumOfWord_one += word1[i];
        }

        for(int j=0; j<word2.length; j++) {
            sumOfWord_two += word2[j];
        }

        System.out.println("Word_one: " + sumOfWord_one);
        System.out.println("Word_two: " + sumOfWord_two);

        if(sumOfWord_one.equals(sumOfWord_two)) {
            answer = true;
        }

        return answer;

    }
}
