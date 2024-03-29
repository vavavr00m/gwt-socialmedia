
package com.tinesoft.gwt.socialmedia.showcase.server.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * Facade for Guice dependency injector container.
 * 
 * @author Tine Kondo<kondotine@gmail.com>
 */
public class GuiceServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServerModule(), new DispatchServletModule());
    }
}
