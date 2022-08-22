<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <% int a=(int) (Math.random() * 100 + 50); int b=(int) (Math.random() * 100 + 50); int sum=a*b; %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Q1</title>
        </head>

        <body>
            <h1>暗算チャレンジャー</h1>
            <p>
                正答数:<% %>
            </p>
            <p>
                誤答数:<% %>
            </p>
            <form>
                <p>
                    <% %>x<% %>=<input type="text" name=sum value=""><input type="submit" value="送信">
                </p>
            </form>
            <% if (sum==a) %>
        </body>

        </html>