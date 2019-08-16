package com.kodilla.testing.library;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondiotion("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondiotion(anyString())).thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondiotion("ZeroBooks")).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondiotion("FortyBooks")).thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then

            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
    }


    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf10Books = generateListOfNBooks(10);
            when(libraryDatabaseMock.listBooksWithCondiotion(anyString()))
                    .thenReturn(resultListOf10Books);

            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondiotion(anyString());
    }
//Zadanie

    @Test
    public void testListBooksInHandsOf() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("My First Name", "My Last Name", "000000");
        LibraryUser libraryUser2 = new LibraryUser("Jan", "Kowalski", "1111111");
        LibraryUser libraryUser3 = new LibraryUser("Tadzio", "Nowak", "2222222");

        List<Book> rentedBooks1 = new ArrayList<>();
        List<Book> rentedBooks2 = generateListOfNBooks(1);
        List<Book> rentedBooks3 = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(rentedBooks1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2)).thenReturn(rentedBooks2);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3)).thenReturn(rentedBooks3);;
        //When
        int result1 = bookLibrary.listBooksInHandsOf(libraryUser1);
        int result2 = bookLibrary.listBooksInHandsOf(libraryUser2);
        int result3 = bookLibrary.listBooksInHandsOf(libraryUser3);
        //Then
        Assert.assertEquals(0, result1);
        Assert.assertEquals(1, result2);
        Assert.assertEquals(5, result3);
    }
}
