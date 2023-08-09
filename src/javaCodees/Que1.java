package javaCodees;
// Problem: Write a Java program that takes a string as input and prints the frequency of each character in the string.

import java.util.Arrays;
import java.util.Scanner;
public class Que1 {
    public static void main(String[] args) {
        int i ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String Sentence = sc.nextLine();
        System.out.println(Sentence);
        char []word = Sentence.toCharArray();
        int []charCount = new int[256];
        for(i = 0; i < Sentence.length();i++) {
            int p = Sentence.charAt(i);
            charCount[p]++;
        }

             for(i = 0 ;i < charCount.length; i++) {
                 if (charCount[i] != 0) {

                     System.out.println((char) i + ": " + charCount[i]);


                 }
             }


        }
    }

