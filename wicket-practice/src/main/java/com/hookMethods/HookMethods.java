package com.hookMethods;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HookMethods extends WebPage {
	private Label firstLabel;
	private String req;
	public HookMethods() {
		req="";
		firstLabel=new Label("com","Something is displaying");
		add(firstLabel);
	}
	
	@Override
	public void onConfigure() {
		super.onConfigure();
		if(req==null) {
			setVisible(false);
		}
		else {
			setVisible(true);
		}
	}
}
