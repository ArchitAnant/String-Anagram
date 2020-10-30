package com.company;

import java.util.Scanner;

public class Main {
/*A string is said to be an anagram if it contains the same characters and same length,
but in a different order, e.g. army and Mary are anagrams.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String d = sc.nextLine();
        System.out.print("Enter the second string: ");
        String f = sc.nextLine();
        int count = 0;
        for (int i = 0 ; i<d.length();i++){
            for(int j = 0; j <f.length();j++){
                if (d.charAt(i)==f.charAt(j)){
                    count++;
                break;
                }
            }
        }
        if (d.length()==f.length() && count == f.length()){
            System.out.println("The given strings are anagram");
        }
        else
            System.out.println("The given strings are not anagram");
    }
}
