package com.nacre.poc.onlinebookshopping;

import java.util.HashMap;



import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


/**
 * Application Lifecycle Listener implementation class ApplicationContextListener
 * @param <Image>
 *
 */
@WebListener
public class ApplicationContextListener<Image> implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ApplicationContextListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
     */
 
	public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
		
    	BookBean javaBook=new BookBean("9780130895608","ADVANCED JAVA(TM) 2 PLATFORM HOW TO PROGRAM","2009",1,2364,4312,"advjhtp.jpg");    
        BookBean cBook=new BookBean("356801308956","C How to Program","2008",2,4356,2312,"chp.jpg");
        BookBean cppBook=new BookBean("680130895618","C++ How to Programe","2008",1,4621,2841,"cpphp.jpg");
        BookBean javaComplete=new BookBean("1259002462498","Java The Complete Reference","2012",8,89641,1250,"javacomplete.jpg");
        BookBean oracleCertified=new BookBean("9780955160349"," Certified Expert Java EE 6 Web Component Developer","2011",6,67846,2775,"ocejwcd.jpg");
        HashMap<String,BookBean> map=new HashMap<String,BookBean>();
        map.put("9780130895608",javaBook );
        map.put("356801308956",cBook );
        map.put("680130895618",cppBook );	
        map.put("1259002462498",javaComplete);
        map.put("9780955160349",oracleCertified);
        ServletContext servletContext = arg0.getServletContext();
        servletContext.setAttribute("map", map);
    }

	/**
     * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
    }
	
}
