package com.Vijay.layout;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;

public class FinalLayout extends WebPage {
	private Component headerPanel;
	private Component menuPanel;
	private Component footerPanel;
	
	public FinalLayout() {
		add(headerPanel=new HeaderPanel("myHeaderPanel"));
		add(menuPanel=new MenuPanel("myMenuPanel"));
		add(footerPanel=new FooterPanel("myFooterPanel"));
	}

	public Component getHeaderPanel() {
		return headerPanel;
	}

	public void setHeaderPanel(Component headerPanel) {
		this.headerPanel = headerPanel;
	}

	public Component getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(Component menuPanel) {
		this.menuPanel = menuPanel;
	}

	public Component getFooterPanel() {
		return footerPanel;
	}

	public void setFooterPanel(Component footerPanel) {
		this.footerPanel = footerPanel;
	}
	
	
}
