package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Marek", 'F', LocalDate.of(1989, 02, 12), 32));
        theUserList.add(new ForumUser(2, "Jan", 'M', LocalDate.of(1990, 02, 12), 100));
        theUserList.add(new ForumUser(3, "Darek", 'M', LocalDate.of(1999, 02, 12), 32));
    }
    public  List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);

    }
}
