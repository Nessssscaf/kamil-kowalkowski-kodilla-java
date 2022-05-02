package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify (String a, String b, PoemDecorator poemDecorator) {
        String result = a + poemDecorator.decorate(a) + b;
        System.out.println(result);
    }
}
