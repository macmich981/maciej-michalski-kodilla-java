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
        when(statistics.postsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, forumStatistics.getQuanitiyyOfPosts());
    }

    @Test
    public void testCalculateAdvStatisticsThousandPosts() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(1000, forumStatistics.getQuanitiyyOfPosts());
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(0, forumStatistics.getAverageQuantityOfComments(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsLessComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(1000, forumStatistics.getQuanitiyyOfPosts());
        Assert.assertEquals(500, forumStatistics.getQuantityOfComments());
        Assert.assertEquals(0.5, forumStatistics.getAverageQuantityOfCommentsPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsMoreComments() {
        //Given
        Statistics statistics = mock(Statistics.class);
        when(statistics.postsCount()).thenReturn(500);
        when(statistics.commentsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();
        //When
        forumStatistics.calculateAdvStatistics(statistics);
        //Then
        Assert.assertEquals(500, forumStatistics.getQuanitiyyOfPosts());
        Assert.assertEquals(1000, forumStatistics.getQuantityOfComments());
        Assert.assertEquals(2   , forumStatistics.getAverageQuantityOfCommentsPerPost(), 0.01);
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
        Assert.assertEquals(0, forumStatistics.getQuantityOfUsers());
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
        Assert.assertEquals(100, forumStatistics.getQuantityOfUsers());
    }
}
