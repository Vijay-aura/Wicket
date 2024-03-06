package com.pageParameters;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.Link;

public class HomePage extends WebPage {
	public HomePage() {
		add(new Link<Void>("Link") {
			public void onClick() {
				
				PageParameters pageParameters=new PageParameters();
				pageParameters.add("foo", "foo-Val");
				pageParameters.add("bar", "bar-val");
				setResponsePage(TargetPage.class,pageParameters);
			}
		});
	}
}
