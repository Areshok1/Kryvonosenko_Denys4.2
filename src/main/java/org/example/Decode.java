package org.example;

public class Decode {
    private static final String VOWELS = "aeiou";
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";

    public static String decode(String encodedMessage) {
        StringBuilder decoded = new StringBuilder();
        String[] words = encodedMessage.split("\\s+");
        for (String word : words) {
            if (word.matches("\\d+")) {
                decoded.append(decodeVowelSubstitution(word)).append(" ");
            } else {
                decoded.append(decodeConsonantSubstitution(word)).append(" ");
            }
        }
        return decoded.toString().trim();
    }

    private static String decodeVowelSubstitution(String encodedWord) {
        StringBuilder decoded = new StringBuilder();
        for (char c : encodedWord.toCharArray()) {
            if (Character.isDigit(c)) {
                int index = Integer.parseInt(String.valueOf(c)) - 1;
                if (index >= 0 && index < VOWELS.length()) {
                    decoded.append(VOWELS.charAt(index));
                } else {
                    decoded.append(c);
                }
            } else {
                decoded.append(c);
            }
        }
        return decoded.toString();
    }

    private static String decodeConsonantSubstitution(String encodedWord) {
        StringBuilder decoded = new StringBuilder();
        for (char c : encodedWord.toCharArray()) {
            int index = CONSONANTS.indexOf(c);
            if (index != -1) {
                decoded.append(CONSONANTS.charAt((index - 1 + CONSONANTS.length()) % CONSONANTS.length()));
            } else {
                decoded.append(c);
            }
        }
        return decoded.toString();
    }
}