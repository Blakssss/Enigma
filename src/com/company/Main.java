package com.company;
import java.util.Scanner;
public class Main {
    String alphabet1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main main = new Main();
        int intInput = input.nextInt();
        char charInput = input.next().charAt(0);
        char returnNumber = main.numberToLetter(intInput);
        int returnLetter = main.letterToNumber(charInput);
    }
    char numberToLetter(int number) {
        char[] alphabet = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Æ', 'Ø', 'Å'};
        return alphabet[number];
    }
    int letterToNumber(char letter) {
        int number = alphabet1.indexOf(letter);
        return number;
    }
}
