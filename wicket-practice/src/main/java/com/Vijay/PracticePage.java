package com.Vijay;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import com.Vijay.layout.FooterPanel;

public class PracticePage extends WebPage {
	public PracticePage() {
		WebMarkupContainer markupContainer=new WebMarkupContainer("markupContainer");
		MyPanel panel=new MyPanel("myPanel");
		markupContainer.add(new Label("com-Con","val-Con"));
		markupContainer.add(panel);
		add(markupContainer);
		
		markupContainer.add(new FooterPanel("myFooterPanel"));
	}
}
