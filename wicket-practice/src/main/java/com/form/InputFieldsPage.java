package com.form;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.CheckBoxMultipleChoice;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.form.ListChoice;
import org.apache.wicket.markup.html.form.ListMultipleChoice;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

public class InputFieldsPage extends WebPage {
	
	Person person=new Person();
	Form form=new Form("form");
	private WebMarkupContainer container=new WebMarkupContainer("detailsContainer");
	
	List<String> countries=Arrays.asList("India","Australia","US");
	List<String> states=Arrays.asList("Andhra Pradesh","Telengana","Karnataka");
	List<String> genders=Arrays.asList("Male","Female","Not Specified");
	List<String> languages=Arrays.asList("Telugu","English","Kannada");
	
	public InputFieldsPage() {
		person.setCountry("India");
		
		form.add(createFirstNameField("firstName"));
		form.add(createLastNameField("lastName"));
		form.add(createPasswordField("password"));
		form.add(createCountryField("country"));
		form.add(createStateField("state"));
		form.add(createGenderField("gender"));
		form.add(createLanguageField("languages"));
		form.add(creteIndianField("isIndian"));
		
		add(form);
		add(container);
		
		form.add(new Button("button") {
			@Override
			public void onSubmit() {
				form.setVisible(false);
				container.add(new Label("details",person.toString()));
				container.setVisible(true);
			}
		});
		container.setVisible(false);
		container.setOutputMarkupPlaceholderTag(true);
		
	}
	public FormComponent createFirstNameField(String s) {
		return new TextField(s,new PropertyModel(person, "firstName"));
	}
	public FormComponent createLastNameField(String s) {
		return new TextField(s,new PropertyModel(person, "lastName"));
	}
	public FormComponent createPasswordField(String s) {
		return new PasswordTextField(s, new PropertyModel(person, "password"));
	}
	public FormComponent createCountryField(String s) {
		return new ListChoice(s,new PropertyModel(person,"country"),countries) {
			protected void onComponentTag(ComponentTag tag) {
				tag.put("size","2");
			}
		};
	}
	public FormComponent createStateField(String s) {
		return new DropDownChoice(s,new PropertyModel(person,"state"),states);
	}
	public FormComponent createGenderField(String s) {
		return new RadioChoice(s,new PropertyModel(person, "gender"),genders).setSuffix("");
	}
	public FormComponent createLanguageField(String s) {
		return new ListMultipleChoice(s,new PropertyModel(person, "languages") , languages);
	}
	
	public FormComponent creteIndianField(String s) {
		return new CheckBox(s,new PropertyModel(person,"isIndian"));
	}
}