package com.vijay.HelloWorld;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

public class HomePage extends WebPage {
	public HomePage() {
		add(new Label("header", "Hello World"));

		add(new Link("Link") {
			public void onClick() {
				setResponsePage(AnotherPage.class);
			}
		});

		/*
		 * Containers and adding Components to the Containers and retriving them Using
		 * the get method.
		 */
//		Panel panel=new Panel("myPanel");
//		add(panel);

		WebMarkupContainer webMarkupContainer = new WebMarkupContainer("myPanel");
		add(webMarkupContainer);
		Label label = new Label("someLabel", "Label-Value");
		webMarkupContainer.add(label);

		Label name = (Label) get("myPanel:someLabel");
//		System.out.println(name);

		/*
		 * If we dont specify any container for the component then wicket will map the
		 * component to the corresponding html tag using the naming conventions
		 * 
		 */
		add(new Label("Com-Id", "Com-Val"));
	}
}
