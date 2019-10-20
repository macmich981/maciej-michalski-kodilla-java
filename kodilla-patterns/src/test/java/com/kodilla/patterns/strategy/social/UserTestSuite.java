package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User matthew = new YGeneration("Matthew");
        User andrew = new ZGeneration("Andrew");

        //When
        String johnSharedPost = john.sharePost();
        String matthewSharedPost = matthew.sharePost();
        String andrewSharedPost = andrew.sharePost();

        //Then
        Assert.assertEquals("Facebook", johnSharedPost);
        Assert.assertEquals("Snapchat", matthewSharedPost);
        Assert.assertEquals("Twitter", andrewSharedPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John");
        //When
        String johnSharedPost = john.sharePost();
        john.setSocialPublisher(new TwitterPublisher());
        johnSharedPost = john.sharePost();
        //Then
        Assert.assertEquals("Twitter", johnSharedPost);
    }
}
