package com.model;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

public class ModelPage extends WebPage {
	public ModelPage() {
		Person person=new Person("Some","Kethagani");
		
		Label label=new Label("name",new Model(person.getName()));
		label.setRenderBodyOnly(true);
		add(label);
	}
}