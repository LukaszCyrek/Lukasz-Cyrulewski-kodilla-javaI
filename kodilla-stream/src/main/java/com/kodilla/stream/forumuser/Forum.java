package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Marek", 'M', LocalDate.of(1989, 02, 12), 32));

    }
    public  List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);

    }
}
