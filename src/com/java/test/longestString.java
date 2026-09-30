package com.java.test;

import java.util.HashSet;
import java.util.Set;

public class longestString {
    static void main(String[] args) {
        String str="abcabctt";
       //String str = "abcabcbb";
        Set<Character> set=new HashSet<>();
        int left=0;
        int maxlength=0;
        for(int right=0;right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxlength=Math.max(maxlength,right-left+1);
        }
        System.out.println(maxlength);
    }
}
