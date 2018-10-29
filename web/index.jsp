<%--
  Created by IntelliJ IDEA.
  User: p'c
  Date: 2018/10/27
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript" src="statics/js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
          var json={};
          json.studentname="啦啦啦";
          json.studentadress="lalala";

          $(function () {
              $("button").click(function () {
                  $.ajax({
                      url : "aaa/bbb",
                      data : JSON.stringify(json),
                      contentType : "application/json",
                      type : "post"
                  });
              });
          });

    </script>
  </head>
  <body>
      <button>点击</button>
  </body>
</html>
