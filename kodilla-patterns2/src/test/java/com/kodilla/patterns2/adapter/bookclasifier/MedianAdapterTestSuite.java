package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("first","Black",1995,"Yoo"));
        books.add(new Book("second","Jack",1988,"Woo"));
        books.add(new Book("third","Poker",2005,"Poo"));

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(books);

        //Then
        Assertions.assertEquals(1995,median);
    }
}