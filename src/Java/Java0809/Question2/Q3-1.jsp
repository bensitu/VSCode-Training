<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <% String Lunes1=request.getParameter("Lunes"); %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Q3</title>
        </head>

        <body>
            <% if (Lunes1.equals("yes")) {%>
                正解です！
                <%}else{ %>
                    不正解ですよ〜
                    <%} %>
        </body>

        </html>