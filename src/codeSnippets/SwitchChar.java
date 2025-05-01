package codeSnippets;

import java.util.Scanner;

public class SwitchChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result;
        System.out.print("Please enter a character: ");
        char ch = input.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result = "Vowel";
                break;
            default:
                result = "Not a vowel";
        }

        System.out.println("Character is: " + result);
        input.close(); // Close the scanner to prevent resource leaks
    }
    }

    

