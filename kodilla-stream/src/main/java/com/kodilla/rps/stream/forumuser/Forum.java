package com.kodilla.rps.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public void addUser(ForumUser forumUser) {
        forumUsers.add(forumUser);
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(forumUsers);
    }
}
