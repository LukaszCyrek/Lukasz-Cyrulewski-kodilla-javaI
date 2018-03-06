package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String Social() {
        return socialPublisher.share();
    }

    public void setStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}

