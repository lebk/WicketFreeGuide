package com.bo.WicketFreeGuide;
import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;


/**
 * Author: lebk.lei@gmail.com Date: 2013-4-17
 */
public class Chap3Template extends WebPage
{

  private static final String CONTENT_ID = "content";
  private Component headerPanel;
  private Component menuPanel;
  private Component footerPanel;

  public Chap3Template()
  {
    add(headerPanel = new Chap3HeaderPanel("headerPanel"));
    add(menuPanel = new Chap3MenuPanel("menuPanel"));
    add(footerPanel = new Chap3FooterPanel("footerPanel"));
    add(new Label(CONTENT_ID, "I am not a single content"));
  }
}
