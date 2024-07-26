package net.media.training.designpattern.observer;

public interface Subscriber {
    boolean isOutdoors();

    void notifySunRose();
    void notifySunSet() ;

    void goOutdoors();
    void goIndoors();

    boolean isFeelingWarm();
    boolean isFeelingTired();
}
