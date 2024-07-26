package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(String phoneType) {
        PhoneFactory phoneFactory = null;
        if (phoneType.equals("Android")) {
            phoneFactory = new AndroidFactory();
        } else if (phoneType.equals("Iphone")) {
            phoneFactory = new IphoneFactory();
        } else {
            throw new IllegalStateException();
        }

        MotherBoard motherBoard = phoneFactory.getMotherBoard();
        motherBoard.attachBattery(new Battery());
        motherBoard.attachProcessor(phoneFactory.getProcessor());

        Case phoneCase = phoneFactory.getCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(phoneFactory.getScreen());

        return phoneCase;
    }
}
