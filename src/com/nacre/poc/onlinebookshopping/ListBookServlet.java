package com.nacre.poc.onlinebookshopping;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/ListBookServlet")
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see javax.servlet.http.HttpServlet#HttpServlet()
     */
    public ListBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session=request.getSession();
		ServletContext servletContext = request.getServletContext();
		Object attribute = servletContext.getAttribute("map");
		HashMap<String, BookBean> map=(HashMap<String, BookBean>)attribute;
		HashMap<String, String> isbnBook=new HashMap<String, String>();
		Set<Entry<String,BookBean>> entrySet = map.entrySet();
		Iterator<Entry<String, BookBean>> iterator = entrySet.iterator();
	    	while(iterator.hasNext()) {
			Entry<String, BookBean> next = iterator.next();
			BookBean bookData=next.getValue();
			String key = next.getKey();
			isbnBook.put(key, bookData.getTitle());
	    	}
	    	servletContext.setAttribute("isbnBook", isbnBook);
	    	
			response.sendRedirect("JSP/books.jsp");
		
	    }
		

	/**
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
