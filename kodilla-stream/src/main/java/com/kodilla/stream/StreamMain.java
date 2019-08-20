package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    private static Forum initForum() {
        Forum forum = new Forum();
        forum.addUser(new ForumUser(1, "MaxDamage", 'M', LocalDate.of(1982, 11, 19), 21));
        forum.addUser(new ForumUser(2, "Brunona", 'F', LocalDate.of(1975, 4, 5), 0));
        forum.addUser(new ForumUser(3, "Wanda", 'F', LocalDate.of(1992, 9, 14), 12));
        forum.addUser(new ForumUser(4, "Szalony Jeździec", 'M', LocalDate.of(2000, 6, 17), 1));
        forum.addUser(new ForumUser(5, "Pablo", 'M', LocalDate.of(1999, 2, 13), 5));
        forum.addUser(new ForumUser(6, "Bezimienny", 'M', LocalDate.of(1986, 5, 18), 7));

        return forum;
    }
    public static void main(String[] args) {
        Forum forum = initForum();
        Map<Integer, ForumUser> selectedForumUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> ChronoUnit.YEARS.between(forumUser.getDayOfBirth(), LocalDate.now()) >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdentityNumber, forumUser -> forumUser));

        System.out.println("# elements: " + selectedForumUsers.size());
        selectedForumUsers.entrySet().stream()
                .map(forumUserEntry -> forumUserEntry.getKey() + ": " + forumUserEntry.getValue())
                .forEach(System.out::println);
    }
}
