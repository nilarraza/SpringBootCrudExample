
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg}</h1>

   <form   method="post" action="/addEmployee" >
             <fieldset> 
                 
                 <legend >Add  Employee</legend>
                 
                	
                   
                     <input type="text" name="name" placeholder="name" required autofocus><br>
                    <input type="text" name="age" placeholder="age" required autofocus><br>                                       
                                
                 
                 
                 <button type="submit" name="submit"  >Save Employee </button><br><br>
               
                 
            </fieldset>
         </form>
         
          <a href=""></a>
    

</body>
</html>