package com.pageParameters;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class TargetPage extends WebPage {
	public TargetPage(PageParameters pageParameters) {
		super(pageParameters);
		add(new Label("com","Com-val"));
	}
}
