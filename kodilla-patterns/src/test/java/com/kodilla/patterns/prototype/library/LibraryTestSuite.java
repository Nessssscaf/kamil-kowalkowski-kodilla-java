package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library = new Library("Fantasy");
        Book book = new Book("Lord of the Rings", "Tolkien", LocalDate.of(2010, 12, 25));
        Book book1 = new Book("Hobbit", "Tolkien", LocalDate.of(2007, 11, 5));
        Book book2 = new Book("Potter", "Rowling", LocalDate.of(2005, 12, 20));
        Book book3 = new Book("Witcher", "Sapkowski", LocalDate.of(2008, 5, 23));

        library.books.add(book);
        library.books.add(book1);
        library.books.add(book2);
        library.books.add(book3);

        //When
        Integer result = library.books.size();
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Fantasy 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Fantasy 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        assertEquals(4, result);
        assertEquals(4, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
    }
}