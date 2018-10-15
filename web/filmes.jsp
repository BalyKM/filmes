<%-- 
    Document   : filmes
    Created on : 15/10/2018, 02:15:29
    Author     : kelvi
--%>
<%@page import="java.util.List"%>
<%@page import="br.edu.fjn.objeto.movie.Movie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
        <% List<Movie> listMovie = (List<Movie>)application.getAttribute("listMovie");
         for (Movie movie : listMovie){
        %><tr>
                         <td><%=movie.getName()%></td>
                         <td><%=movie.getDiretor()%></td>
                     </tr> 
        <%}%>
        </table>
        <h1>Hello World!</h1>
    </body>
</html>
