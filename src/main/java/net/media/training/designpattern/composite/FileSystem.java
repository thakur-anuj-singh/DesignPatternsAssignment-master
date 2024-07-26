package net.media.training.designpattern.composite;

public interface FileSystem {
    int getSize();
    String getName();
    void setParent(FileSystem fileSystem);
    FileSystem getParent();
    boolean fileExists(String name);
}
