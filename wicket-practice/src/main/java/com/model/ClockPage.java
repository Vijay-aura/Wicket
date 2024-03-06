
package com.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;

public class ClockPage extends WebPage {
	public ClockPage() {
		Model clock=new Model() {
			@Override
			public Serializable getObject() {
				SimpleDateFormat sf=new SimpleDateFormat("hh:mm:ss");
				String time=sf.format(new Date());
				return time;
			}
		};
		add(new Label("clock",clock));
		add(new Link<Void>("refresh") {
			@Override
			public void onClick() {
				
			}
		});
	}
}
