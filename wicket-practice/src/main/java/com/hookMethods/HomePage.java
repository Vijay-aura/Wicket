package com.hookMethods;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

public class HomePage extends WebPage {
	private Label firstLabel;
	private Label secondLabel;
	public HomePage() {
		firstLabel=new Label("label","firstLabel");
		secondLabel=new Label("label","SecondLabel");
//		add(firstLabel);
		add(secondLabel);
		add(new Link<Void>("reload") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void onClick() {
				
			}
		});
	}
	
	@Override
	protected void onBeforeRender() {
		if(contains(firstLabel,true)) {
			replace(secondLabel);
		}
		else {
			replace(firstLabel);
		}
		super.onBeforeRender();
	}
}
