package com.submitformDataUsingLinks;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.SubmitLink;

public class HomePage extends WebPage {
	Form form=new Form("form") {
		protected void onSubmit() {
			System.out.println("form is called");
		}
	};
	public HomePage() {
		add(form);
		form.add(new SubmitLink("inside") {
			public void onSubmit() {
				System.out.println("inside link is called");
			}
		});
		
		add(new SubmitLink("outside",form){
			public void onSubmit() {
				System.out.println("outside link is called");
			}
		});
	}
}
