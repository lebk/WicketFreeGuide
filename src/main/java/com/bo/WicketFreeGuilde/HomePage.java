package com.bo.WicketFreeGuilde;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("helloMessage", "Hello World"));

	  add(new Link("id"){

      @Override
      public void onClick()
      {
      this.setResponsePage(LinkedPage.class);  
      }});
	  

    }
}
