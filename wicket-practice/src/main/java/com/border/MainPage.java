package com.border;

import org.apache.wicket.markup.html.WebPage;

public class MainPage extends WebPage {
	public MainPage() {
		
		add(new BaseBorder("myBorder"));
	}
}
