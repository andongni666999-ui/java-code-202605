package com.org.structure.composite;

// Composite（组合节点）

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{

    private String name;
    private List<FileSystem> children;

    public Folder(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        children.add(fileSystem);
    }

    public void remove(FileSystem fileSystem) {
        children.remove(fileSystem);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + name);
        for (FileSystem fileSystem : children) {
            fileSystem.display();
        }
    }

}
