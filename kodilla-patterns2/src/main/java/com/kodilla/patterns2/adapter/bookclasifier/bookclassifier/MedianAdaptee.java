package com.kodilla.patterns2.adapter.bookclasifier.bookclassifier;


import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {


    @Override
    public int medianPublicationYear(Map<BookSignature, BookB> books) {
       Statistics theStatisticsMedian = new Statistics();
        return theStatisticsMedian.medianPublicationYear(books);
    }

    @Override
    public int averagePublicationYear(Map<BookSignature, BookB> books) {
        Statistics theStatisticsAverage = new Statistics();
        return theStatisticsAverage.averagePublicationYear(books);
    }

}
