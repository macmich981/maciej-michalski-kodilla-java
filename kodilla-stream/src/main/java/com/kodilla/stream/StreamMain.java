package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> selectedForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> ChronoUnit.YEARS.between(forumUser.getDayOfBirth(), LocalDate.now()) >= 20)
                .filter(forumUser -> forumUser.getPublishedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdentityNumber, forumUser -> forumUser));

        System.out.println("# elements: " + selectedForumUsers.size());
        selectedForumUsers.entrySet().stream()
                .map(ForumUserEntry -> ForumUserEntry.getKey() + ": " + ForumUserEntry.getValue())
                .forEach(System.out::println);
    }
}