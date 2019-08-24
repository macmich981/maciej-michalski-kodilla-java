package com.kodilla.rps.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToDecorate, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(textToDecorate));
    }
}
