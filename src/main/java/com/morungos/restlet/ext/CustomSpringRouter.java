package com.morungos.restlet.ext;

import org.restlet.Component;
import org.restlet.Restlet;
import org.restlet.ext.spring.SpringRouter;
import org.restlet.routing.Redirector;

public class CustomSpringRouter extends SpringRouter {
	
	CustomSpringRouter(Component component) {
		super(component.getContext());
	}

	public void setDefaultAttachment(Object route) {
        if (route instanceof Redirector) {
            this.attachDefault((Restlet) route);
        } else {
            super.setDefaultAttachment(route);
        }
    }
}
