<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
 
<html xmlns = "http://www.w3.org/1999/xhtml">

<head>
   <title>Shopping Cart</title>

   <link rel = "stylesheet" href = "styles.css" 
      type = "text/css" />
</head>

<body>
   <p class = "bigFont">Shopping Cart</p>
   
   <c:if test="${notempty==1}">
      <table>
        <thead>
          <tr>
            <th>Product</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Total</th>
          </tr>
        </thead>
        <c:forEach items="${cart}" var="cartitem">
          <tr>
            <td><c:out value="${cartitem.value.book.title}"/></td>

            <td><c:out value="${cartitem.value.quantity}"/></td>

            <td class = "right">
               <c:out value="${cartitem.value.book.fmprice}"/>
            </td>

            <td class = "bold right">
               <c:out value="${cartitem.value.subtotal}"/>
            </td>
           </tr>
        </c:forEach> 
        
        <tr>
          <td colspan = "4" class = "bold right">Total: 
             <c:out value="${total}"/>
          </td>
        </tr>
      </table> 
      <p class = "bold green">
         <a href = "JSP/books.jsp">Continue Shopping</a>
      </p>

      <form method = "get" action = "JSP/order.jsp">
         <p><input type = "submit" value = "Check Out" /></p>
      </form>   
   </c:if>
   
   <c:if test="${notempty != 1}">
      <p>Shopping cart is currently empty.</p>
   </c:if>
   
</body>

</html>