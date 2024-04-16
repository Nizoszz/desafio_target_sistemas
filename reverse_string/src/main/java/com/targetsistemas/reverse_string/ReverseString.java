package com.targetsistemas.reverse_string;

import java.util.Scanner;

public class ReverseString {
    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase to reverse: ");
        while (!scanner.hasNextLine()){
            System.out.println("Invalid phrase. Please re-enter: ");
            scanner.next();
        }

        String phrase = scanner.nextLine();
        scanner.close();

        char[] chars = phrase.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end){
            char word = chars[start];
            chars[start] = chars[end];
            chars[end] = word;

            start++;
            end--;
        }

        System.out.println("Inverted value of this sentence: " + new String(chars));

    }

}
