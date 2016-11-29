package org.arquillian.extension;

import org.jboss.arquillian.core.api.annotation.Observes;

import org.jboss.arquillian.test.spi.event.suite.BeforeClass;
import org.jboss.arquillian.test.spi.event.suite.BeforeSuite;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by hemani on 11/28/16.
 */
public class HelloWorldObserver {

   private static final Logger logger = Logger.getLogger(HelloWorldObserver.class.getName());

   public void foo(@Observes BeforeSuite beforeSuite) {

      logger.log(Level.INFO, "Hello Hemani");
   }
}
