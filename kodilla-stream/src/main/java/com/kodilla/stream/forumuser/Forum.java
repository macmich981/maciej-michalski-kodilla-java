package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "MaxDamage", 'M', LocalDate.of(1982, 11, 19), 21));
        forumUsers.add(new ForumUser(2, "Brunona", 'F', LocalDate.of(1975, 4, 5), 0));
        forumUsers.add(new ForumUser(3, "Wanda", 'F', LocalDate.of(1992, 9, 14), 12));
        forumUsers.add(new ForumUser(4, "Szalony Jeździec", 'M', LocalDate.of(2000, 6, 17), 1));
        forumUsers.add(new ForumUser(5, "Pablo", 'M', LocalDate.of(1999, 2, 13), 5));
        forumUsers.add(new ForumUser(6, "Bezimienny", 'M', LocalDate.of(1986, 5, 18), 7));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(forumUsers);
    }
}
