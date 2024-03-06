package com.model;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.CompoundPropertyModel;

public class Compoundpropertymodel extends WebPage {
	public Compoundpropertymodel() {
		Person person=new Person("Some-name","Some-Surname");
		setDefaultModel(new CompoundPropertyModel(person));
		
		add(new Label("name"));
	}
}
