package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User jan = new Millenials("Jan Blachowicz");
        User kamil = new YGeneration("Kamil Bond");
        User rambo = new ZGeneration("Rambo Bambo");

        //When
        String janPublisher = jan.sharePost();
        System.out.println("Jan use: " + janPublisher);
        String kamilPublisher = kamil.sharePost();
        System.out.println("Kamil use: " + kamilPublisher);
        String ramboPublisher = rambo.sharePost();
        System.out.println("Rambo use: " + ramboPublisher);

        //Then
        assertEquals("Snapchat", janPublisher);
        assertEquals("Facebook", kamilPublisher);
        assertEquals("Twitter", ramboPublisher);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User kamil = new YGeneration("Kamil Bond");

        //When
        String kamilPublisher = kamil.sharePost();
        System.out.println("Kamil use: " + kamilPublisher);
        kamil.setSocialPublisher(new TwitterPublisher());
        kamilPublisher = kamil.sharePost();
        System.out.println("Kamil now use: " + kamilPublisher);

        //Then
        assertEquals("Twitter", kamilPublisher);
    }
}