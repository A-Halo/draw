package com.java.behavioral.Iterator;

public interface TViterator {
    void setChannel(int i);
    void next();
    void previous();
    boolean isLast();
    Object currentChannel();
    boolean isFirst();

}
