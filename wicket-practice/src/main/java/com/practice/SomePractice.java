package com.practice;



import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.Fragment;

public class SomePractice extends WebPage {
	public SomePractice() {
		Fragment fragment=new Fragment("ContentArea", "fragmentArea", this);
		add(fragment);
		
	}
}
