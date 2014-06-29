package com.nacre.poc.onlinebookshopping;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see javax.servlet.http.HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession( false );
		ServletContext servletContext = request.getServletContext();
        RequestDispatcher dispatcher =
                request.getRequestDispatcher( "JSP/index.jsp" );
        if ( session == null )
            dispatcher.forward( request, response );
		Object attribute = servletContext.getAttribute("map");
		HashMap<String, BookBean> map=(HashMap<String, BookBean>)attribute;
		Set<Entry<String,BookBean>> entrySet = map.entrySet();
		Iterator<Entry<String, BookBean>> iterator = entrySet.iterator();       
		BookBean book = null;
        
        String isbn = request.getParameter( "isbn" );
        
        while ( iterator.hasNext() ) {
        	Entry<String, BookBean> next = iterator.next();
        	book=next.getValue();
            if ( isbn.equals( book.getISBN() ) ) {
            	
            	BookBean newbook = reformatBookPrice(book);
                session.setAttribute( "bookToAdd", newbook );
                dispatcher =
                        request.getRequestDispatcher( "JSP/singleBook.jsp" );
                dispatcher.forward( request, response );
            }
        }
        if ( book == null )
            dispatcher.forward( request, response );
	}
	private BookBean reformatBookPrice(BookBean bookOld) {
    	BookBean bookNew = bookOld;
    	
    	String newprice = new DecimalFormat("0.00").format( bookOld.getPrice() );
    	bookNew.setFmprice( newprice );
    	
    	return bookNew;
    }

	/**
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
