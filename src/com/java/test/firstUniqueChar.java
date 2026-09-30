package com.java.test;

public class firstUniqueChar {
    static void main() {
        String str = "swiss swissd";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println(str.charAt(i));
                break;
            }

        }
    }
}
