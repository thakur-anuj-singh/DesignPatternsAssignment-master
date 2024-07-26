package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:42:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class AndroidProcessor implements Processor {
    @Override
    public AndroidProcessor getProcessor() {
        return new AndroidProcessor();
    }
}
