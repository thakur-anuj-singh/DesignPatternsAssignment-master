package net.media.training.designpattern.abstractfactory;

import com.sun.org.apache.xpath.internal.operations.And;

public abstract class PhoneFactory {
    public abstract MotherBoard getMotherBoard();
    public abstract Processor getProcessor();
    public abstract Screen getScreen();
    public abstract Case getCase();
}
