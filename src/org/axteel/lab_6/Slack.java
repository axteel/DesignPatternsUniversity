package org.axteel.lab_6;

import org.axteel.lab_6example.DataSource;
import org.axteel.lab_6example.DataSourceDecorator;

public class Slack implements Notifier {
    @Override
    public void send(String msg) {
        System.out.println(decorate() + msg);
    }

    public String decorate() {
        return "SlackDecorator: ";
    }
}
