package com.morungos.restlet.ext;

import org.restlet.Component;
import org.restlet.routing.Redirector;

public class CustomRedirector extends Redirector {
	public CustomRedirector(Component component, String targetPattern, int mode) {
        super(component.getContext(), targetPattern, mode);
    }
}
