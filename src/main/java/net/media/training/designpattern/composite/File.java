package net.media.training.designpattern.composite;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:04 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class File implements FileSystem {
    private final String name;
    private final int size;
    private FileSystem parent;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public void setParent(FileSystem parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public FileSystem getParent() {
        return parent;
    }

    @Override
    public boolean fileExists(String name) {
        return this.name.equals(name);
    }
}
