package org.apache.wicket;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;

/**
 * Homepage
 */
public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    // TODO Add any page properties or variables here

    /**
     * Constructor that is invoked when page is invoked without a session.
     * 
     * @param parameters
     *            Page parameters
     */
    public HomePage(final PageParameters parameters) {

        List<String> values = new ArrayList<String>();
        values.add("Hide Link: One");
        values.add("Hide Link: Two");

        ListView<String> listView = new ListView<String>("listView", values) {

            @Override
            protected void populateItem(ListItem<String> item) {
                AjaxLink<Void> link = new AjaxLink<Void>("link") {

                    @Override
                    public void onClick(AjaxRequestTarget target) {
                        setVisible(false);
                        target.addComponent(this);
                    }

                };
                link.setOutputMarkupPlaceholderTag(true);
                link.add(new Label("label", item.getModel()));
                item.add(link);
            }
        };
        add(listView);

    }
}
