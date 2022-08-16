<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Number</title>
    </head>

    <body>
        <% int guessNum=(int) (Math.random() * 100 + 1); %>

            <p>1~100の乱数を生成したよ！</p>
            <p>いくつかな？</p>
            <form action="Q1-1.jsp" method="post">
                <input type="text" value="" id="number" name="num" maxlength="3">
                <input type="submit" id="btn1" value="送信">
            </form>
            <jsp:include page="0816Q1-1.jsp" flush="true | false" />

    </body>

    </html>