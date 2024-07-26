package net.media.training.designpattern.abstractfactory;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 9:13:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMakerTest {

    @Test
    public void AndroidPhoneIsMadeCorrectly() {
        Case phone = new PhoneMaker().buildPhone("Android");
        assertEquals(AndroidCase.class, phone.getClass());
        assertEquals(AndroidScreen.class, phone.getScreen().getClass());
        assertEquals(AndroidMotherBoard.class, phone.getMotherBoard().getClass());
        /*
            Initially we are directly calling the getProcessor() method using Phone Case
            Processor is part of motherboard, so that first we have to access motherboard than
            we can call getProcessor(). similar behaviour for battery.
         */
        assertEquals(AndroidProcessor.class, phone.getMotherBoard().getProcessor().getClass());
        assertEquals(Battery.class, phone.getMotherBoard().getBattery().getClass());
    }
    @Test
    public void IPhoneIsMadeCorrectly() {
        Case phone = new PhoneMaker().buildPhone("Iphone");
        assertEquals(IphoneCase.class, phone.getClass());
        assertEquals(IphoneScreen.class, phone.getScreen().getClass());
        assertEquals(IphoneMotherBoard.class, phone.getMotherBoard().getClass());
        assertEquals(IphoneProcessor.class, phone.getMotherBoard().getProcessor().getClass());
        assertEquals(Battery.class, phone.getMotherBoard().getBattery().getClass());
    }
}
