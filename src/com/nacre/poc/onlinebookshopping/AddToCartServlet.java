package com.nacre.poc.onlinebookshopping;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddToCartServlet
 */
@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see javax.servlet.http.HttpServlet#HttpServlet()
     */
    public AddToCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 {
		      HttpSession session = request.getSession( false );
		      RequestDispatcher dispatcher;
		      if ( session == null ) {
		         dispatcher = 
		            request.getRequestDispatcher( "JSP/index.jsp" );
		         dispatcher.forward( request, response );
		      }
		      
		      Map<String,CartItemBean> cart =  (Map<String,CartItemBean>) session.getAttribute( "cart" );
		      
		      BookBean book = 
		         ( BookBean ) session.getAttribute( "bookToAdd" );
		      
		      String total = (String) session.getAttribute( "total" );
		      Double dtotal;
		      
		      if ( total != null ) {
		    	  dtotal = Double.parseDouble(total);
		      } else {
		    	  dtotal = 0.0;
		      }
		      
		      if ( cart == null ) {
		         cart = new HashMap<String,CartItemBean>();
		         session.setAttribute( "cart", cart );
		         session.setAttribute("total", "0.0");
		      }
		      
		      dtotal = dtotal + Double.parseDouble(book.getFmprice());
		      session.setAttribute("total", "" +  new DecimalFormat("0.00").format( dtotal ) );
		      session.setAttribute("notempty", "1");
		      CartItemBean cartItem = 
		         ( CartItemBean ) cart.get( book.getISBN() );
		      if ( cartItem != null ) {
		         cartItem.setQuantity( cartItem.getQuantity() + 1 );
		         Double subtotal = cartItem.getQuantity() * cartItem.getBook().getPrice();
		         cartItem.setSubtotal( new DecimalFormat("0.00").format( subtotal ) );
		      }
		      else {
		    	 CartItemBean cibean = new CartItemBean( book, 1 );
		    	 cibean.setSubtotal( new DecimalFormat("0.00").format( book.getPrice() ) );
		         cart.put( book.getISBN(), cibean );
		      }
		      
		      dispatcher = 
		         request.getRequestDispatcher( "JSP/viewCart.jsp" );
		      dispatcher.forward( request, response );
		   }  
	}

}
