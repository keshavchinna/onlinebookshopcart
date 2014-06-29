<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns = "http://www.w3.org/1999/xhtml">

<head>
   <title>Book List</title>

   <link rel = "stylesheet" href = "styles.css" 
      type = "text/css" />
</head>
<body>
   <p class = "bigFont">Available Books</p>

   <p class = "bold">Click a link to view book information</p>
   <p></p>
   <table class="center" class = "bold">
   <c:set var="bookList" value="${applicationScope.isbnBook }" scope="session"/>
   <c:set var="map" value="${applicationScope.map }"></c:set>
     <c:forEach items="${bookList}" var="book">
       <tr>
          <td class="left">
          <c:set var="bookTo" value="${book.key }" scope="session">  </c:set>
             <a href="../BookServlet?isbn=${map.get(bookTo).getISBN()}">
              <c:out value="${map.get(bookTo).getTitle()}"/>, <c:out value="${map.get(bookTo).getEditionNumber()}"/>e
             </a>
          </td>
       </tr>
     </c:forEach>  
   </table>
   
</body> 

</html>