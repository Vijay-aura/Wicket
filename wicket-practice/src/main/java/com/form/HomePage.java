package com.form;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class HomePage extends WebPage {
	public HomePage() {
		Form form=new Form("form") {
			@Override
			protected void onSubmit() {
			System.out.println("form has been subitted");	
			}
		};
		add(form);
		form.add(new TextField("field",new Model("")));
	}
}
