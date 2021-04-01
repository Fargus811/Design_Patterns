package main.java.com.sergeev.behavioral_pattern.iterator.example_iterator;

import main.java.com.sergeev.behavioral_pattern.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
