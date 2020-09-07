package org.axteel.lab1;

import java.io.*;

public class FileManager {
    private static FileManager manager;

    private FileManager() {}

    public static FileManager getInstance() {
        if (manager == null) {
            manager = new FileManager();
        }

        return manager;
    }

    public void setFilePermission(File file, Permission permission, boolean status) {
        if (!file.exists())
            throw new RuntimeException("File " + file.getName() + " does not exist");

        switch (permission){
            case READ: file.setReadable(status);
                break;
            case WRITE: file.setWritable(status);
                break;
            case EXECUTE: file.setExecutable(status);
                break;
        }
    }

    public void getFilePermissions(File file) {
        System.out.println("File " + file.getName());
        System.out.println("Readable: " + (file.canRead() ? "Access granted" : "Access denied"));
        System.out.println("Writable: " + (file.canWrite() ? "Access granted" : "Access denied"));
        System.out.println("Execute: " + (file.canExecute() ? "Access granted" : "Access denied"));
    }

    public void grantAllPermissions(File file) {
        file.setReadable(true);
        file.setWritable(true);
        file.setExecutable(true);

        System.out.println("Full access granted to " + file.getName());
    }

    /**
     * Adds text into a new line
     * */
    public void writeToFile(File file, String text, boolean append) {
        try (CharArrayWriter writer = new CharArrayWriter()) {
            FileWriter fileWriter = new FileWriter(file, append);
            writer.append(text);
            writer.writeTo(fileWriter);

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(File file) {
        System.out.println("Reading from... " + file.getName());

        try {
            Reader reader = new FileReader(file);
            int charAsNumber = reader.read();
            while(charAsNumber != -1) {
                char character = (char) charAsNumber;
                System.out.print(character);
                charAsNumber = reader.read();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
