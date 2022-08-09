<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>

    <body>
        <form>
            <p>お使いのOSを選んでください</p>
            <input type="checkbox" id="windows" name="OS" value="Windows"><label for="Windows">Windows</label>
            <input type="checkbox" id="mac" name="OS" value="Mac"><label for="Mac">Mac</label>
            <input type="checkbox" id="linux" name="OS" value="Linux"><label for="Linux">Linux</label>
            <input type="button" id="btn1" value="送信" onclick="btnFunction()">
        </form>
    </body>

    </html>