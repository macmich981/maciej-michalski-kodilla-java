package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("cicho bo przyjdzie Zdzicho", (textToDecorate) -> textToDecorate.toUpperCase());
        poemBeautifier.beautify("Intergalactic Wars", (textToDecorate) -> "***" + textToDecorate + "***");
        poemBeautifier.beautify("Siała baba mak", (textToDecorate) -> textToDecorate.replace('a', 'u'));
        poemBeautifier.beautify("To już jest koniec.", (textToDecorate) -> textToDecorate.concat("EndOFExercise"));
    }
}
