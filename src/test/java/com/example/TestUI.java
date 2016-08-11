package com.example;

import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import org.vaadin.jetty.VaadinJettyServer;

/**
 * This is a standard Vaadin UI implementation with a main method that allows running this class.
 * You can create a "run configuration" in your IDE or run with Maven:
 * mvn exec:java -Dexec.mainClass="com.example.TestUI" -Dexec.classpathScope=test
 */
@Widgetset("com.example.WidgetSet") // this is required only if you have to compile the widgetset
public class TestUI extends UI {

    public static void main(String[] args) throws Exception {
        new VaadinJettyServer(8080, TestUI.class).start();
    }

    @Override
    protected void init(VaadinRequest request) {
        setContent(new MyComponent());
    }

}
