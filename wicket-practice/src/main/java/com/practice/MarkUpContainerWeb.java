package com.practice;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class MarkUpContainerWeb extends WebPage {
	private String messageNumber;
	public MarkUpContainerWeb() {
		messageNumber=null;
		WebMarkupContainer webMarkupContainer=new WebMarkupContainer("MarkUpContainer");
		webMarkupContainer.add(new Label("messageNumber",messageNumber));
		add(webMarkupContainer);
		
		if(messageNumber!=null) {
			webMarkupContainer.setVisible(true);
		}
		else {
			webMarkupContainer.setVisible(false);
			add(new Label("Messages","NoUnreadMessages"));
		}
		
	}
}
