package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class calculateAdvStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsZeroPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        int quantityOfPosts = 0;
        when(statistics.postsCount()).thenReturn(quantityOfPosts);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, forumStatistics.quantityOfUsers);
        Assert.assertEquals(0, forumStatistics.quanitiyyOfPosts);
        Assert.assertEquals(0, forumStatistics.quantityOfComments);
        Assert.assertEquals(0, forumStatistics.averageQuanitiyyOfPosts, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfComments, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfCommentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticsThousandPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        int quantityOfPosts = 1000;
        when(statistics.postsCount()).thenReturn(quantityOfPosts);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, forumStatistics.quantityOfUsers);
        Assert.assertEquals(1000, forumStatistics.quanitiyyOfPosts);
        Assert.assertEquals(0, forumStatistics.quantityOfComments);
        Assert.assertEquals(0, forumStatistics.averageQuanitiyyOfPosts, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfComments, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfCommentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        int quantityOfComments = 0;
        when(statistics.commentsCount()).thenReturn(quantityOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, forumStatistics.quantityOfUsers);
        Assert.assertEquals(0, forumStatistics.quanitiyyOfPosts);
        Assert.assertEquals(0, forumStatistics.quantityOfComments);
        Assert.assertEquals(0, forumStatistics.averageQuanitiyyOfPosts, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfComments, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfCommentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticsLessComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        int quantityOfPosts = 1000;
        int quantityOfComments = 500;
        when(statistics.postsCount()).thenReturn(quantityOfPosts);
        when(statistics.commentsCount()).thenReturn(quantityOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, forumStatistics.quantityOfUsers);
        Assert.assertEquals(1000, forumStatistics.quanitiyyOfPosts);
        Assert.assertEquals(500, forumStatistics.quantityOfComments);
        Assert.assertEquals(0, forumStatistics.averageQuanitiyyOfPosts, 0.01);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfComments, 0.01);
        Assert.assertEquals(0.5, forumStatistics.averageQuantityOfCommentsPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsMoreComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        int quantityOfPosts = 500;
        int quantityOfComments = 1000;
        when(statistics.postsCount()).thenReturn(quantityOfPosts);
        when(statistics.commentsCount()).thenReturn(quantityOfComments);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, forumStatistics.quantityOfUsers);
        Assert.assertEquals(500, forumStatistics.quanitiyyOfPosts);
        Assert.assertEquals(1000, forumStatistics.quantityOfComments);
        Assert.assertEquals(0, forumStatistics.averageQuanitiyyOfPosts, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfComments, 0);
        Assert.assertEquals(2   , forumStatistics.averageQuantityOfCommentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticsZeroUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        when(statistics.usersNames()).thenReturn(usersNames);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, forumStatistics.quantityOfUsers);
        Assert.assertEquals(0, forumStatistics.quanitiyyOfPosts);
        Assert.assertEquals(0, forumStatistics.quantityOfComments);
        Assert.assertEquals(0, forumStatistics.averageQuanitiyyOfPosts, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfComments, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfCommentsPerPost, 0);
    }

    @Test
    public void testCalculateAdvStatisticsHundredUsers() {
        //Given
        Statistics statistics = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>(Collections.nCopies(100, ""));
        when(statistics.usersNames()).thenReturn(usersNames);
        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(100, forumStatistics.quantityOfUsers);
        Assert.assertEquals(0, forumStatistics.quanitiyyOfPosts);
        Assert.assertEquals(0, forumStatistics.quantityOfComments);
        Assert.assertEquals(0, forumStatistics.averageQuanitiyyOfPosts, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfComments, 0);
        Assert.assertEquals(0, forumStatistics.averageQuantityOfCommentsPerPost, 0);
    }
}
