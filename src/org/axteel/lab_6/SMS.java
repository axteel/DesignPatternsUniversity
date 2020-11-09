package org.axteel.lab_6;

public class SMS implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println("SMS: " + msg);
    }
}
