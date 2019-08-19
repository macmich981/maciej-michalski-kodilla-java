package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToDecorate, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(textToDecorate));
    }
}
