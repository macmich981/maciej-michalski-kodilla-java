package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Book book = new Book("Metro 2033", "Dmitry Glukhovsky", LocalDate.of(2007, 12, 10));
        Book book1 = new Book("J.R.R Tolkien", "Władca Pierścieni", LocalDate.of(1961, 4, 13));
        Book book2 = new Book("Siergiej Antonow", "Ciemne tunele", LocalDate.of(2010, 7, 23));
        Book book3 = new Book("Ręczna robota", "Ryszard Cwirlej", LocalDate.of(2018,5, 16));
        Library library = new Library("Moja biblioteka");
        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow clone of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Moja druga biblioteka");
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Moja trzecia biblioteka");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.getBooks().remove(book);

        //Then
        System.out.println(library.getName());
        library.getBooks()
        .forEach(System.out::println);
        System.out.println();

        System.out.println(clonedLibrary.getName());
        clonedLibrary.getBooks()
        .forEach(System.out::println);
        System.out.println();

        System.out.println(deepClonedLibrary.getName());
        deepClonedLibrary.getBooks()
        .forEach(System.out::println);

        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
