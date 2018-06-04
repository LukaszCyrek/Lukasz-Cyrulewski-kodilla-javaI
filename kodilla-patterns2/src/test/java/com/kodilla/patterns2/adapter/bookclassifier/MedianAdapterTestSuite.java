package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.bookclassifier.MedianAdapter;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
   public void publicationYearMedianTest() {

        MedianAdapter medianAdapter = new MedianAdapter();
        Set<BookA> myList = new HashSet<>();
        BookA book1 = new BookA("Jacek", "First Book", 1999, "12345");
        BookA book2 = new BookA("Franek", "Second Book", 2001, "54321");
        BookA book3 = new BookA("Darek", "Third Book", 2003, "32134");
        myList.add(book1);
        myList.add(book2);
        myList.add(book3);

       int median = medianAdapter.publicationYearMedian(myList);

       assertEquals(2001, median);

   }
}
