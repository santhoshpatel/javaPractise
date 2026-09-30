package com.java.test;

public class reverseNumber {
    static void main() {
        int num=19273;
        int reverse=0;
        while(num!=0){
            reverse=reverse*10+num%10;
            num=num/10;
        }
        System.out.println(reverse);
    }
}
