package net.media.training.designpattern.abstractfactory;

//import sun.jvm.hotspot.types.CIntegerField;
/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:48:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Case {
    public void attachMotherBoard(MotherBoard motherBoard);

    public void attachScreen(Screen screen);

    public Screen getScreen();

    public MotherBoard getMotherBoard();

}
