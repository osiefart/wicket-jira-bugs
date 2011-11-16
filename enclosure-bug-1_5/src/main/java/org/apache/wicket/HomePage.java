package org.apache.wicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {

        // Add the simplest type of label
        Label label = new Label("message", "If you see this message wicket is properly configured and running");
        add(label);

        label.setVisibilityAllowed(false);

    }
}
