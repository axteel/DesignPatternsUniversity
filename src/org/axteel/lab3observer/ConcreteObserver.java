package org.axteel.lab3observer;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ConcreteObserver implements Observer {
    private final Observable observable;
    private String name;

    public ConcreteObserver(Observable observable) {
        this.observable = observable;
    }

    public Observable getObservable() {
        return observable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        Logger logger = SimpleLogger.getLogger(ConcreteObserver.class);
        logger.log(Level.INFO, name + ": notification had been received");
    }
}
