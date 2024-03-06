package com.hookMethods;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class ComponentTagBody extends WebPage {
	public ComponentTagBody() {
		add(new Label("Hello","Something is displaying") {
			protected void onComponentTagBody(MarkupStream stream,ComponentTag tag) {
				if(isEnabled()) {
					replaceComponentTagBody(stream, tag, "Component Body has been replaced");
				}
				else {
					super.onComponentTagBody(stream, tag);
				}
				System.out.println("OnRender");
			}
			@Override
			protected void onAfterRender() {
				System.out.println("After Render");
				super.onAfterRender();
			}
		});
	}
	

}
