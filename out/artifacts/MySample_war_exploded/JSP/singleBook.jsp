<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><c:out value="${bookToAdd.title}"/></title>
        
        <link rel = "stylesheet" href = "styles.css" 
        type = "text/css" />
    </head>
    <body>

        <h1><c:out value="${bookToAdd.title}"/></h1>
    
        <table>
            <tr>
                <td rowspan = "5">  <!-- cell spans 5 rows -->
                    <img style = "border: thin solid black" src =  
                    "images/${bookToAdd.imageFile}" 
                    alt = "${bookToAdd.title}"  />
                </td>
                <td class = "bold">Price:</td>

                <td> <del>&#2352;</del> <c:out value="${bookToAdd.fmprice}"/></td>
            </tr>
            
            <tr>
                <td class = "bold">ISBN #:</td>

                <td><c:out value="${bookToAdd.ISBN}"/></td>
            </tr>
         
            <tr>
                <td class = "bold">Edition:</td>

                <td><c:out value="${bookToAdd.editionNumber}"/></td>
            </tr>
         
            <tr>
                <td class = "bold">Copyright:</td>

                <td><c:out value="${bookToAdd.copyright}"/></td>
            </tr>
         
            <tr>
                <td>
                    <form method = "post" action="AddToCartServlet">
                        <p><input type = "submit" value = "Add to Cart" /></p>
                    </form>
                </td>
                <td>
                    <form method = "get" action="JSP/viewCart.jsp">
                        <p><input type = "submit" value = "View Cart" /></p>
                    </form>
                </td>
            </tr>
        
        </table>
    
    </body>
</html>