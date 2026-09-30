package com.java.test;

public class Palindrome {
    static void main() {
        String word="MadAm";
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }
        System.out.println(reverse);
        if(word.equalsIgnoreCase(reverse)){
            System.out.println("pali");
        }else{
            System.out.println("not pali");

        }

    }
}
