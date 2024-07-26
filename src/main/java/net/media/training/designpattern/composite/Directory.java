package net.media.training.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 19, 2011
 * Time: 9:18:51 PM
 * To change this template use pre_refactoring.File | Settings | pre_refactoring.File Templates.
 */
public class Directory implements FileSystem{
    private final String name;
    private final List<FileSystem> fileSystems;
    private FileSystem parent;

    public String getName() {
        return name;
    }

    public Directory(String name, List<FileSystem> fileSystems,FileSystem parent){
        this.name = name;
        this.fileSystems = fileSystems;
        for (FileSystem fileSystem : fileSystems) {
            fileSystem.setParent(this);
        }
        this.parent = parent;
    }
    public void delete() {
        Directory fileSystem = (Directory)parent;
        fileSystem.getFileSystems().remove(this);
    }
    public int getSize(Directory directory){
        int sum = 0;
        for(FileSystem fileSystem : directory.getFileSystems()){
            sum += fileSystem.getSize();
        }
        return sum;
    }
    public int getSize(){
        return getSize(this);
    }

    public boolean fileExists(String name) {
        if(this.name.equals(name)) return true;
        for(FileSystem fileSystem:fileSystems){
            boolean status = fileSystem.fileExists(name);
            if(status) return true;
        }
        return false;
    }
    public boolean directoryExists(String name){
        return fileExists(name);
    }
    public void remove(FileSystem fileSystem){
        fileSystems.remove(fileSystem);
    }
    public void add(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }
    public List<FileSystem> getFileSystems(){
        return fileSystems;
    }
    public void setFileSystems(FileSystem fileSystem){
        this.parent = fileSystem;
    }
    public FileSystem getParent() {
        return parent;
    }
    public void setParent(FileSystem fileSystem) {
        this.parent = fileSystem;
    }
}
