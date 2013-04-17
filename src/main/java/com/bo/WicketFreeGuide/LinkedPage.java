package com.bo.WicketFreeGuide;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;


/**
 * Author: lebk.lei@gmail.com Date: 2013-4-17
 */
public class LinkedPage extends WebPage
{
  public LinkedPage(final PageParameters parameters)
  {
    super(parameters);

    add(new Label("linkedPage", "This is a linked page"));


  }
}
