package com.kodilla.patterns2.adapter.bookclasifier.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    Statistics statistics = new Statistics();
    @Override
    public int publicationYearMedian(Set<BookA> bookSet) {
        Map<BookSignature, BookB> map = new HashMap<>();
        for (BookA element: bookSet) {
            BookSignature bookSignature = new BookSignature(element.getSignature());
            BookB bookB = new BookB(element.getAuthor(), element.getTitle(), element.getPublicationYear());
            map.put(bookSignature, bookB);
        }
        return statistics.medianPublicationYear(map);
    }
}
