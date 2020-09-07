package org.axteel.lab1;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file = new File("/Users/axteel/IdeaProjects/DesignPatternsUniversity/src/org/axteel/lab1/file.txt");

        FileManager manager = FileManager.getInstance();

        manager.setFilePermission(file, Permission.WRITE, true);
        manager.getFilePermissions(file);
        manager.writeToFile(file, "Hello", true);
        manager.readFile(file);
        manager.setFilePermission(file, Permission.READ, false);
        manager.readFile(file);
        manager.setFilePermission(file, Permission.WRITE, false);
        manager.writeToFile(file, "Cannot be written", true);
        manager.getFilePermissions(file);
        System.out.println("Grant all permissions");
        manager.grantAllPermissions(file);
    }
}
