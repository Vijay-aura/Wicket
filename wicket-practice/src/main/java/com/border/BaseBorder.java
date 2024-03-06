package com.border;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.border.Border;

public class BaseBorder extends Border {
	public BaseBorder(String id) {
		super(id);
		add(new Label("username","SomeOne"));
		add(new Label("password","SomePassword"));
	}
}
