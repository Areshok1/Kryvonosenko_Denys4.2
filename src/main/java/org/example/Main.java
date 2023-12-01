package org.example;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        String message = "testing";
        String vowelEncoded = Encode.encodeVowelSubstitution(message);
        String consonantEncoded = Encode.encodeConsonantSubstitution(message);

        out.println("Original: " + message);
        out.println("Vowel Encoded: " + vowelEncoded + ", Decoded: " + Decode.decode(vowelEncoded));
        out.println("Consonant Encoded: " + consonantEncoded + ", Decoded: " + Decode.decode(consonantEncoded));
    }
}
