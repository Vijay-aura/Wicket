package com.Vijay;

import org.apache.wicket.Page;

import org.apache.wicket.protocol.http.WebApplication;

import com.form.InputFieldsPage;

public class PracticeApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-gener+ated method stub
        return  InputFieldsPage.class;
	}
	 
}