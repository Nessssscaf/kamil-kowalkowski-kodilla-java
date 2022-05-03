package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum() {
        theUsersList.add(new ForumUser(0001, "Gandalf",
                'M', 1987, 12, 12, 43));
        theUsersList.add(new ForumUser(0002, "Mary",
                'F', 1989, 05, 16, 5));
        theUsersList.add(new ForumUser(0003, "Joseph",
                'M', 2015, 12, 06, 7));
        theUsersList.add(new ForumUser(0004, "Filemon",
                'M', 1995, 06, 04, 0));
        theUsersList.add(new ForumUser(0005, "Missy",
                'F', 2000, 01, 01, 25));
        theUsersList.add(new ForumUser(0006, "Terminator",
                'M', 1990, 12, 30, 9));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUsersList);
    }
}