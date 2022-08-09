<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1 cellpadding=0 cellspacing=0>
		<%
		int flag = 1;
		%>
		<%
		for (int i = 1; i < 10; i++) {
		%>
		<tr>
			<%
			for (int j = 1; j < 10; j++) {
			%>
			<td width='70' height='70' align=center>
				<%
				out.println(i * j);
				%>
			</td>
			<%
			}
			%>
			<%
			flag = 0;
			%>
		</tr>
		<%}%>
	</table>

</body>
</html>