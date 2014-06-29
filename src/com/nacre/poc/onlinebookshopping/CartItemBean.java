package com.nacre.poc.onlinebookshopping;

import java.io.*;

/**
 * @author keshav
 *
 */
public class CartItemBean implements Serializable {
   private static final long serialVersionUID = 1L;
   private BookBean book;
   private int quantity;
   private String subtotal;
   
   
	/**
	 * @param bookToAdd
	 * @param number
	 */
	public CartItemBean(BookBean bookToAdd, int number) {
		book = bookToAdd;
		quantity = number;
	}
   /**
 * @return
 */
public BookBean getBook()
   {
      return book;
   }
   /**
 * @param number
 */
public void setQuantity( int number )
   {
      quantity = number;
   }
   /**
 * @return
 */
public int getQuantity()
   {
      return quantity;
   }
   /**
 * @param st
 */
public void setSubtotal( String st )
   {
      subtotal = st;
   }
   /**
 * @return
 */
public String getSubtotal()
   {
      return subtotal;
   }
   
}
