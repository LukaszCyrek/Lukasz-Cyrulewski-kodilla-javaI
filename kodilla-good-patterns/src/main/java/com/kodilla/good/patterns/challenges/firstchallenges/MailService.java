package com.kodilla.good.patterns.challenges.firstchallenges;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("E-mail został wysłany do: " + user.getFirstName() + " " + user.getLastName());
    }
}
