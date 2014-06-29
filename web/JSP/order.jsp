<?xml version = "1.0"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns = "http://www.w3.org/1999/xhtml">

<head>
   <title>Order</title>

   <link rel = "stylesheet" href = "styles.css" 
      type = "text/css" />
</head>

<body>
   <p class = "bigFont">Shopping Cart Check Out</p>
   <form method = "post" action = "process.jsp">

      <p style = "font-weight: bold">
         Please input the following information.</p>
      <table>  
         <tr>
            <td class = "right bold">First name:</td>       

            <td>
               <input type = "text" name = "firstname" 
                  size = "25" />
            </td>
         </tr>

         <tr>
            <td class = "right bold">Last name:</td>

            <td>
               <input type = "text" name = "lastname" 
                  size = "25" />
            </td>
         </tr>

         <tr>
            <td class = "right bold">Street:</td>

            <td>
               <input type = "text" name = "street" size = "25" />
            </td>
         </tr>

         <tr>
            <td class = "right bold">City:</td>

            <td>
               <input type = "text" name = "city" size = "25" />
            </td>
         </tr>

         <tr>
            <td class = "right bold">State:</td>

            <td>
               <input type = "text" name = "state" size = "25" />
            </td>
         </tr>

         <tr>
            <td class = "right bold">Zip code:</td>

            <td>
               <input type = "text" name = "zipcode" 
                  size = "10" />
            </td>
         </tr>

         <tr>
            <td class = "right bold">Phone #:</td>

            <td>
               (
                  <input type = "text" name = "phone" size = "3" />
               )

               <input type = "text" name = "phone2" 
                      size = "3" /> -

               <input type = "text" name = "phone3" size = "4" />
            </td>
         </tr>  

         <tr>
            <td class = "right bold">Credit Card #:</td>

            <td>
               <input type = "text" name = "creditcard" 
                  size = "25" />  
            </td>
         </tr>

         <tr>
            <td class = "right bold">Expiration (mm/yy):</td>

            <td>
               <input type = "text" name = "expires" 
                  size = "2" /> /

               <input type = "text" name = "expires2" 
                  size = "2" />
            </td>
         </tr>        
      </table>
      <p><input type = "submit" value = "Submit" /></p>
   </form>
</body>

</html>
