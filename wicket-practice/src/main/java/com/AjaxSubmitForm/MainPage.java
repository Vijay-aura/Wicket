package com.AjaxSubmitForm;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxSubmitLink;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.Model;

public class MainPage extends WebPage {
	Form form=new Form("form");
	private final WebMarkupContainer markupContainer=new WebMarkupContainer("comments");
	
	public MainPage() {
		markupContainer.setOutputMarkupPlaceholderTag(true);
		add(markupContainer);
		
		final List<String> comments=new ArrayList<String>();
		markupContainer.add(new ListView("list",comments) {

			@Override
			protected void populateItem(ListItem item) {
				item.add(new Label("comment",item.getModel()));
			}
			
		});
		
		final TextArea editor=new TextArea("editor",new Model(""));
		editor.setOutputMarkupPlaceholderTag(true);
		form.add(editor);
		form.add(new AjaxSubmitLink("save") {
			
			@Override
			protected void onSubmit(AjaxRequestTarget target, Form form) {
				comments.add(editor.getDefaultModelObjectAsString());
				editor.setModel(new Model(""));
				target.addComponent(markupContainer);
				target.focusComponent(markupContainer);
			}
		});
		markupContainer.add(form);
	}
}
