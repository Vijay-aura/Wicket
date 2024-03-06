package com.Vijay;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.panel.Panel;

public class MyPanel extends Panel {

	public MyPanel(String id) {
		super(id);
		add(new Label("header","header-data"));
		add(new Label("Footer","Footer-data"));
	}

}
