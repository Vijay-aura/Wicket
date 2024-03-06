package com.hookMethods;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class ComponentTagPage extends WebPage {
	public ComponentTagPage() {
		add(new Label("Hello", "Hello Message") {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected void onComponentTag(ComponentTag tag) {
				super.onComponentTag(tag);

				tag.setName("span");
				tag.put("style", "color:steelblue");
			}
		});
	}

}
