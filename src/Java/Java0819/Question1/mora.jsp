<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <% String user=(String) request.getAttribute("user"); user=user==null ? "" : user; String pc=(String)
        request.getAttribute("pc"); pc=pc==null ? "" : pc; String result=(String) request.getAttribute("result");
        result=result==null ? "" : result; %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Q1</title>
        </head>

        <body>
            <form action="mora-result" method="post">
                <p>手を選んでね：</p>
                <input type="radio" name="mora" value="0" <%=user.equals("グー") ? "checked" : "" %>><label>グー</label>
                <input type="radio" name="mora" value="1" <%=user.equals("チョキ") ? "checked" : "" %>><label>チョキ</label>
                <input type="radio" name="mora" value="2" <%=user.equals("パー") ? "checked" : "" %>><label>パー</label>
                <input type="submit" value="送信">
            </form>
            <% if (result.length()> 0) {
                %>
                <p>
                    あなたは<%=user%>
                </p>
                <p>
                    PCは<%=pc%>
                </p>
                <p>
                    <%=result%>
                </p>
                <% } %>
        </body>

        </html>