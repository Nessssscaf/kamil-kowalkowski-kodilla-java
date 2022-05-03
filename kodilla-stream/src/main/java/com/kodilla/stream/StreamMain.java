package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Text beautification with lambdas");
        poemBeautifier.beautify("<<<", ">>>", a -> " Some text ");
        poemBeautifier.beautify("###", "###", a -> " Some next text ");
        poemBeautifier.beautify("oOoOo", "oOoOo", a -> " Other text ");
        poemBeautifier.beautify("**>", "<**", a -> " Other next text ");
        poemBeautifier.beautify("O-->", "<--O", a -> " Some dumb text ");
        poemBeautifier.beautify("O-->", "<--O", a -> " Some dumb text ".toUpperCase());
        poemBeautifier.beautify("**>", "<**", a -> " Other next text ".toLowerCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        // Zadanie: funkcyjny spacer po liście użytkowników forum
        System.out.println("Zadanie: funkcyjny spacer po liście użytkowników forum");
        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 2002)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}