<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ page import="java0817.*" %>
		<% Q2[] teams=new Q2[2]; teams[0]=new Q2("巨人", new String[] { "0" , "0" , "2" , "2" , "0" , "3" , "2" , "0"
			, "0" , "0" , "1" }); teams[1]=new Q2("阪神", new String[] { "2" , "0" , "0" , "1" , "0" , "0" , "1" , "0"
			, "5" , "0" , "2x" }); %>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<title>Q2</title>
			</head>

			<body>
				<table border="1">
					<thead>
						<tr>
							<th>&nbsp;</th>
							<% for (int i=1; i <=teams[0].getScore().length; i++) { %>
								<td>
									<%=i%>
								</td>
								<% } %>
									<th>計</th>
						</tr>
					</thead>
					<tbody>
						<% for (int i=0; i < teams.length; i++) { %>
							<tr>
								<th>
									<%=teams[i].getName()%>
								</th>
								<% for (int j=0; j < teams[i].getScore().length; j++) { %>
									<td>
										<%=teams[i].getScore()[j]%>
									</td>
									<% } %>
										<td>
											<%=teams[i].getTotalScore()%>
										</td>
							</tr>
							<% } %>
					</tbody>
				</table>
			</body>

			</html>