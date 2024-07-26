package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:48:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class IphoneCase implements Case {
    private MotherBoard motherBoard;
    private Screen screen;
    public void attachMotherBoard(MotherBoard motherBoard) {
        if (!motherBoard.State().equals("running"))
            throw new RuntimeException("Motherboard not functional");
        this.motherBoard = motherBoard;
    }
    public void attachScreen(Screen screen) {
        this.screen = screen;
    }
    public Screen getScreen() {
        return screen;
    }
    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
