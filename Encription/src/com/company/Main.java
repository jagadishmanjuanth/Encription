package com.company;

public class Main {

//    public static String ceaserEncription(String string, int key) {
//        char[] newLetters = new char[string.length()];
//        int newKey = key % 26;
//        for (int i = 0; i < string.length(); i++) {
//            newLetters[i] = getNewLetter(string.charAt(i), newKey);
//        }
//        return new String(newLetters);
//    }
//
//    private static char getNewLetter(char letter, int key) {
//        int newLetterCode = letter + key;
//        return newLetterCode <= 122 ? (char) newLetterCode
//                : (char) (96 + newLetterCode % 122);
//    }

    public static void main(String[] args) {
        ceaserEncription("jagadishz", 4);
    }

    public static String ceaserEncription(String string, int key) {
        char[] newletter = new char[string.length()];
        int newKey = key % 26;
        for (int i = 0; i < string.length(); i++) {
           newletter[i] =  getNewletter(string.charAt(i),newKey);
        }
        return new String(newletter);
    }

    private static char getNewletter(char letter, int key) {
        int letterCode = letter + key;

        return letterCode <= 122 ? (char) letterCode : (char) (96 + letterCode % 122);
    }
//
//    public static String ceaserEncription(String string, int key) {
//        char[] newletter = new char[string.length()];
//        int newKey = key % 26;
//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        for (int i = 0; i < string.length(); i++) {
//            newletter[i] = getNewCode(string.charAt(i), newKey, alphabet);
//        }
//        return new String(newletter);
//    }
//
//    private static char getNewCode(char letter, int key, String alphabet) {
//        int newLetterCode = alphabet.indexOf(letter) + key;
//
//        return newLetterCode <= 25 ? alphabet.charAt(newLetterCode) : alphabet.charAt(-1 + newLetterCode % 25);
//    }
//

//
//    public static String ceaserEncription(String string, int key) {
//        char[] newLetter = new char[string.length()];
//        int newKey = key % 26;
//        String alpabet = "abcdefghijklmnopqrstuvwxyz";
//        for (int i = 0; i < string.length(); i++) {
//            newLetter[i] = getNewLetter(string.charAt(i), newKey, alpabet);
//        }
//        return new String(newLetter);
//    }
//
//    private static char getNewLetter(char letter, int key, String alpabet) {
//        int newLetterCode = alpabet.indexOf(letter) + key;
//        return newLetterCode <= 25 ? alpabet.charAt(newLetterCode) : alpabet.charAt(-1 + newLetterCode % 25);
}


