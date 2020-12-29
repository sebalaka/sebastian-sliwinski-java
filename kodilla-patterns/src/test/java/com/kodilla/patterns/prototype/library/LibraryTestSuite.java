package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        Book book = new Book("Book1", "Martin", LocalDate.of(2019,2,4));
        Book book1 = new Book("Book2", "Braun", LocalDate.of(2018,3,5));
        Set<Book> books = library.getBooks();
        books.add(book);
        books.add(book1);



        Library clonedLib = null;
        try {
            clonedLib = library.shallowCopy();
            clonedLib.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLib = null;
        try {
            deepClonedLib = library.deepCopy();
            deepClonedLib.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When

        //Then
        System.out.println(library);
        System.out.println(clonedLib);
        System.out.println(deepClonedLib);

        assertEquals(2, books.size());
        assertEquals(2, library.books.size());
        assertEquals(2, clonedLib.books.size());
        assertEquals(2, deepClonedLib.books.size());

        assertEquals(books.size(), library.getBooks().size());
        assertEquals(books.size(), deepClonedLib.getBooks().size());
        assertEquals(books.size(), clonedLib.getBooks().size());

    }
}