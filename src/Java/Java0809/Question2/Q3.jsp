<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>HomePage3</title>
        <script type="text/javascript">
            function btnFunction() {
                if (document.getElementById('yes').checked) {
                    alert('正解です');
                }
            }
        </script>
    </head>

    <body>
        <form action="Q3-1.jsp" method="post">
            <p>スペイン語で月曜はLunesである.</p>
            <input type="radio" id="yes" name="Lunes" value="yes"><label for="yes">はい</label>
            <input type="radio" id="no" name="Lunes" value="no"><label for="no">いいえ</label>
            <input type="submit" id="btn1" value="送信">
        </form>
    </body>

    </html>