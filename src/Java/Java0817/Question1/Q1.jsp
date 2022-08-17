<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <% int sum=0; for(int i=1000;i<=3000;i++){ sum +=i; } %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8" />
            <title>1000+3000</title>
        </head>

        <body>
            <p>10000から3000までの和は<%=sum %>です。</p>
        </body>

        </html>