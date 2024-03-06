package com.vijay.HelloWorld;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class AnotherPage extends WebPage {
	public AnotherPage() {
		add(new Label("Com-id","Com-Value"));
	}
}
