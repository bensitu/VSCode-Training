<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>

    <body>

        <% String snum=request.getParameter("number"); int num; %>
            <% if (snum !=null) { %>
                <% num=Integer.valueOf(snum); %>
                    <%} else {%>
                        <% num=0; %>
                            <% } %>
                                <% if (num> 100) {
                                    %>
                                    <% out.println("Your inputted number is larger than 100. ダメ！"); %>
                                        <% } else if (num < 0) { %>
                                            <% out.println("Your inputted number is less than 0. ダメ！"); %>
                                                <% } else if (num < guessNum) { %>
                                                    <% out.println(num + " is too small!!!" ); %>
                                                        <% } else if (num> guessNum) {
                                                            %>
                                                            <% out.println(num + " is too large!!!" ); %>
                                                                <% } else { %>
                                                                    <% out.println("Bingo! The guess number is " + guessNum);
	%>
	<%
	}
	%>



</body>
</html>