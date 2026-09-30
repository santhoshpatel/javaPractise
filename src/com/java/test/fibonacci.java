package com.java.test;

public class fibonacci {
    static void main() {
        int n=10;
        int a=0;
        int b=1;
        System.out.println(a+" "+ b);
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
