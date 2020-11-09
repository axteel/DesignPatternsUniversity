package org.axteel.lab_6;

public class Facebook implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("Facebook: " + msg);
    }
}
