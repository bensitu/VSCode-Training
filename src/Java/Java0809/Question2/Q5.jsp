<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>

    <body>
        <form>
            <label for="foods"> </label> <select id="foods" name="foods">
                <option value="nasi">好きな食べ物を一つ選んでください</option>
                <option value="susi">寿司</option>
                <option value="ramen">ラーメン</option>
                <option value="yakiniku">焼肉</option>
            </select>
            <input type="button" id="btn1" value="送信" onclick="btnFunction()">
        </form>
    </body>

    </html>