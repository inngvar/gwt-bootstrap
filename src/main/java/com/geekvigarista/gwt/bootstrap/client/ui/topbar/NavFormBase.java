package com.geekvigarista.gwt.bootstrap.client.ui.topbar;

import com.geekvigarista.gwt.bootstrap.client.ui.base.Form;
import com.geekvigarista.gwt.bootstrap.client.ui.resources.BootstrapCssResources;
import com.google.gwt.user.client.ui.TextBox;

public class NavFormBase extends Form {

	private TextBox input = new TextBox();
	
	public NavFormBase() {
		addStyleName(BootstrapCssResources.pull_left);
		add(input);
	}
	
	public NavFormBase(int size) {
		this();
		setSize(size);
	}
	
	public void setAlignment(String alignment) {
		if (alignment.equalsIgnoreCase("left")) {
			removeStyleName(BootstrapCssResources.pull_right);
			addStyleName(BootstrapCssResources.pull_left);
		} else if (alignment.equalsIgnoreCase("right")) {
			removeStyleName(BootstrapCssResources.pull_left);
			addStyleName(BootstrapCssResources.pull_right);
		}
	}
	
	public void setSize(int size) {
		input.addStyleName("span" + size);
	}
	
	public TextBox getTextBox() {
		return input;
	}
	
	public void setPlaceholder(String placeholder) {
		input.setText(placeholder);
	}
}
