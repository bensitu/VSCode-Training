<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    import="com.northsea.maven.mantal_arithmetic.*" %>
    <% int a=(int) (Math.random() * 50 + 50); int b=(int) (Math.random() * 50 + 50); int sum=a*b; int inputAns;
        MA_game_status status=(MA_game_status)application.getAttribute("status"); %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Q1</title>
        </head>

        <body>
            <h1>暗算チャレンジャー</h1>
            <p>
                正答数:<% status.getCorrect(); %>
            </p>
            <p>
                誤答数:<% status.getWrong(); %>
            </p>
            <form action="" method="post">
                <p>
                    <%=a %>x<%=b %>=<input type="number" name=answer value="<%=sum%>"><input type="submit" value="送信">
                </p>
            </form>
            <% if (sum==a) %>
        </body>

        </html>