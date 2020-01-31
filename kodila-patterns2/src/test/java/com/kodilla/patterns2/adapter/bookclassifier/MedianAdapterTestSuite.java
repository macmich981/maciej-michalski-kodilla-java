package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book ("J.R.R. Tolkien", "Władca Pierścieni", 1962, "WP1962");
        Book book2 = new Book ("Dmitrij Gluchovsky", "Metro 2033", 2010, "M2010");
        Book book3 = new Book ("Nowy autor", "Nowy tytuł", 2020, "New signature");
        Set<Book> myBooks = new HashSet<>();
        myBooks.add(book1);
        myBooks.add(book2);
        myBooks.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int publicationYearMedian = medianAdapter.publicationYearMedian(myBooks);

        // Then
        assertEquals(2010, publicationYearMedian);
    }
}