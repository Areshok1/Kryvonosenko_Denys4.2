package org.example;

public class Encode {
    private static final String VOWELS = "aeiou";
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxyz";

    public static String encodeVowelSubstitution(String message) {
        StringBuilder encoded = new StringBuilder();
        for (char c : message.toCharArray()) {
            int index = VOWELS.indexOf(c);
            if (index != -1) {
                encoded.append(index + 1);
            } else {
                encoded.append(c);
            }
        }
        return encoded.toString();
    }

    public static String encodeConsonantSubstitution(String message) {
        StringBuilder encoded = new StringBuilder();
        for (char c : message.toCharArray()) {
            int index = CONSONANTS.indexOf(c);
            if (index != -1) {
                encoded.append(CONSONANTS.charAt((index + 1) % CONSONANTS.length()));
            } else {
                encoded.append(c);
            }
        }
        return encoded.toString();
    }
}
