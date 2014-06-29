<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns = "http://www.w3.org/1999/xhtml">

<head>
   <title>Thank You!</title>

   <link rel = "stylesheet" href = "styles.css" 
      type = "text/css" />
</head>
<body>

   <h5>Your order has been processed.</h5>
	<h4>Your Bill Payment:</h4>
	<form action="../SessionInvalidateServelt">
	 <table>  
         <tr>
            <td class = "right bold">First name:</td>       

            <td>
                <b><c:out value="${param.firstname }"></c:out></b>
            </td>
         </tr>

         <tr>
            <td class = "right bold">Last name:</td>

            <td>
              <b><c:out value="${param.lastname }"></c:out></b>
            </td>
         </tr>
		<tr>
            <td class = "right bold">City:</td>

            <td>
                <b><c:out value="${param.city }"></c:out></b>
            </td>
         </tr>
         <tr>
          <td colspan="2"><b>Your credit card has been billed=
      <span class = "special">
        <del>&#2352;</del>.<c:out value="${total}"/>
      	</span>
   		</b></td>
   </tr>
         </table>
      <p><input type = "submit" value = "Wan to Shop Again? Click Here" /></p>
         </form>
        </body>
</html>
