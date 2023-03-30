package org.launchcode.java.studios.countingcharacters;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import java.io.File;
import java.io.FileNotFoundException;

public class CountingCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.print("Please type a sentence (Case-Sensitive): ");
        String inputString = input.nextLine().replaceAll("[\\p{Punct}\\s]+", "");

        char[] StrToArr = inputString.toCharArray();

        for (char character : StrToArr) {
            if (characterCounts.containsKey(character)) {
                characterCounts.put(character, characterCounts.get(character) + 1);
            }
            else {
                characterCounts.put(character, 1);
            }
        }

        for (Map.Entry<Character, Integer> oneChar : characterCounts.entrySet()) {
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }
    }

}

//        File file = new File("/file");
//        Scanner input = new Scanner(file);
//
//        while (input.hasNextLine()) {
//            String inputString = input.nextLine().replaceAll("[\\p{Punct}\\s]+", "");
//        }