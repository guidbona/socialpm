package com.ocpsoft.socialpm.gwt.client.local.view.component;

import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class Anchor extends ComplexPanel
{
   public Anchor()
   {
      setElement((Element) Document.get().createAnchorElement().cast());
   }

   public Anchor(String s)
   {
      this();
      getElement().setInnerText(s);
   }

   public Anchor(Widget w)
   {
      this();
      super.add(w, getElement());
   }

   @Override
   public void add(Widget w)
   {
      super.add(w, getElement());
   }
   
   public void setInnerHTML(String html)
   {
      getElement().setInnerHTML(html);
   }
   
   public void setHref(String href)
   {
      getAnchorElement().setHref(href);
   }
   
   public AnchorElement getAnchorElement()
   {
      return super.getElement().cast();
   }
   
   public void setAttribute(String name, String value)
   {
      getAnchorElement().setAttribute(name, value);
   }
   
}
