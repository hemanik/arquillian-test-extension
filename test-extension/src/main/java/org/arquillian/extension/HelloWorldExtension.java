package org.arquillian.extension;

import org.jboss.arquillian.core.spi.LoadableExtension;


/**
 * Created by hemani on 11/28/16.
 */
public class HelloWorldExtension implements LoadableExtension {

    public void register(ExtensionBuilder extensionBuilder) {
        System.out.println("In register");
        extensionBuilder.observer(HelloWorldObserver.class);
    }
}
