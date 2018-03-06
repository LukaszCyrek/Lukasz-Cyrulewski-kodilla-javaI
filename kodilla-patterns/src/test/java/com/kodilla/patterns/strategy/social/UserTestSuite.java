package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
   public void testDefaultSharingStrategies() {
        //Given
        User marek = new Millenials("Marek Marecki");
        User dariusz = new YGeneration("Dariusz Darecki");
        User anna = new ZGeneration("Anna Anecka");

        //When
        String marekShare = marek.Social();
        System.out.println("Marek should: " +marekShare);
        String dariuszShare = dariusz.Social();
        System.out.println("Dariusz should: " +dariuszShare);
        String annaShare = anna.Social();
        System.out.println("Anna should: " +marekShare);

        //Then
        Assert.assertEquals("Use Facebook to public.", marekShare);
        Assert.assertEquals("Use Snapchat to public", dariuszShare);
        Assert.assertEquals("Use Twitter to public.", annaShare);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User dariusz = new Millenials("Dariusz Darecki");

        //When
        String dariuszShare = dariusz.Social();
        dariusz.setStrategy(new FacebookPublisher());
        dariuszShare = dariusz.Social();
        System.out.println("Dariusz should: " +dariuszShare);

        //Then
        Assert.assertEquals("Use Facebook to public.", dariuszShare);


    }

}
