package net.media.training.designpattern.observer;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sun {
    private boolean isUp;
    final private ArrayList<Subscriber> subscriberArrayList;

    public Sun() {
        subscriberArrayList = new ArrayList<Subscriber>();
    }
    public void addSubscriber(Subscriber subscriber){
        subscriberArrayList.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber){
        subscriberArrayList.remove(subscriber);
    }

    public boolean isUp() {
        return isUp;
    }

    public void set() {
        isUp = false;
        for(Subscriber subscriber : subscriberArrayList){
            if(subscriber.isOutdoors()){
                subscriber.notifySunSet();
            }
        }
    }
    public void rise() {
        isUp = true;
        for(Subscriber subscriber : subscriberArrayList){
            if(subscriber.isOutdoors()){
                subscriber.notifySunRose();
            }
        }
    }
}