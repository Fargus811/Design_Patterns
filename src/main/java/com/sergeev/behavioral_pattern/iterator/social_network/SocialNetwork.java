package main.java.com.sergeev.behavioral_pattern.iterator.social_network;

import main.java.com.sergeev.behavioral_pattern.iterator.example_iterator.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
