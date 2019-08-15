package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    int quantityOfUsers;
    int quanitiyyOfPosts;
    int quantityOfComments;
    double averageQuanitiyyOfPosts;
    double averageQuantityOfComments;
    double averageQuantityOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = statistics.usersNames().size();
        quanitiyyOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();

        if (statistics != null) {
            if (quantityOfUsers > 0) {
                averageQuanitiyyOfPosts = quanitiyyOfPosts / quantityOfUsers;
                averageQuantityOfComments = quantityOfComments / quantityOfUsers;
            }

            if (quanitiyyOfPosts > 0) {
                averageQuantityOfCommentsPerPost = (double) quantityOfComments / (double) quanitiyyOfPosts;
            }
        }
    }

    public void showStatistics() {
        System.out.println("Liczba użytkowników forum: " + quantityOfUsers);
        System.out.println("Liczba postów na forum: " + quanitiyyOfPosts);
        System.out.println("Liczba komentarzy na forum: " + quantityOfComments);
        System.out.println("Srednia liczba postów na użytkownika: " + averageQuanitiyyOfPosts);
        System.out.println("Srednia liczba komentarzy na użytkownika: " + averageQuantityOfComments);
        System.out.println("Srednia liczba komentarzy na post: " + averageQuantityOfCommentsPerPost);
    }
}
