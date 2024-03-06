package com.button;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class ButtonPage extends WebPage {
	Form form=new Form("form") {
		protected void onSubmit() {
			System.out.println("form button is called");
		}
	};
	public ButtonPage() {
		add(form);
		form.add(new Button("button1") {
			public void onSubmit() {
				System.out.println("button1 is called");
			}
		});
		
		form.add(new Button("button2") {
			public void onSubmit() {
				System.out.println("button2 is called");
			}
		});
	}
	
}
