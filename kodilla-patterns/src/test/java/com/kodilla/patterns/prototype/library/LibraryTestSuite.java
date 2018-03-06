package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;


public class LibraryTestSuite {
    @Test
    public void testGetBooks() {

        //given
                Book book1 = new Book("Ogniem i mieczem", "Sienkiewicz", LocalDate.of(1999, 12, 21));
                Book book2 = new Book ("Pan Wolodyjowski", "Sienkiewicz", LocalDate.of(1988, 12, 14));
                Book book3 = new Book("Potop", "Sienkiewicz", LocalDate.of(1864, 06, 23));

        HashSet<Book> books = new HashSet<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

      Library library = new Library("test1");
      library.getBooks().add(book1);
      library.getBooks().add(book2);
      library.getBooks().add(book3);


      Library clonedBoard = null;
      try {
          clonedBoard = library.shallowCopy();
          clonedBoard.setName("test2");
          } catch (CloneNotSupportedException e) {
          System.out.println(e);
      }

      Library deepClonedLibrary = null;
      try {
          deepClonedLibrary = library.deepCopy();
          deepClonedLibrary.setName("test3");
      } catch (CloneNotSupportedException e) {
          System.out.println(e);
      }

        System.out.println(library);
        System.out.println(clonedBoard);
        System.out.println(deepClonedLibrary);

        //When
        //Then
      Assert.assertEquals(3, books.size());
      Assert.assertEquals(3, clonedBoard.getBooks().size());
      Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}



