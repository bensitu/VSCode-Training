<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <script type="text/javascript">
            function myBtn1() {
                let correct = document.getElementById('yes');
                if (correct.checked) {
                    alert('正解です');
                }
            }
        </script>
    </head>

    <body>
        <form>
            <p>スペイン語で月曜はLunesである</p>
            <input type="radio" id="yes" name="Lunes" value="yes"><label for="yes">はい</label>
            <input type="radio" id="no" name="Lunes" value="no"><label for="no">いいえ</label>
            <input type="button" id="btn1" value="送信" onclick="myBtn1()">
        </form>
    </body>

    </html>