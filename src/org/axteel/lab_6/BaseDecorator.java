package org.axteel.lab_6;

public class BaseDecorator implements Notifier {
    private Notifier wrappee;

    public BaseDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String msg) {
        wrappee.send(msg);
    }

    public void setWrappee(Notifier wrappee) {
        this.wrappee = wrappee;
    }
}
