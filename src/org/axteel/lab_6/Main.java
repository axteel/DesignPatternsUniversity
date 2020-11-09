package org.axteel.lab_6;

public class Main {
    public static void main(String[] args) {
        String msg = "You have been notified!";

        BaseDecorator decorator = new BaseDecorator(new Slack());
        decorator.send(msg);

        decorator.setWrappee(new Facebook());
        decorator.send(msg);

        decorator.setWrappee(new SMS());
        decorator.send(msg);
    }
}
