package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:39:41 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MotherBoard {
    void attachBattery(Battery battery);
    void attachProcessor(Processor processor);
    String State();
    Processor getProcessor();
    Battery getBattery();
}
