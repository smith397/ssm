<%--
  Created by IntelliJ IDEA.
  User: AW
  Date: 2020-01-19
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<%--<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<script src="js/jquery-3.4.1/jquery-3.4.1.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/zj" method="post">
    用户名:<input  name="name" type="text">
    密码:<input name="password" type="text">
    <input type="submit" value="提交">
</form>
<%--<button id="diid">发送异步请求</button>--%>
</body>
</html>
<%--<script type="application/javascript">--%>
<%--    $("#diid").click(function()--%>
<%--    {--%>
<%--    $.ajax(--%>
<%--        {--%>
<%--            url:"user/ajax",--%>
<%--            contentType:"application/json;charset=UTF-8",--%>
<%--            data:'{"user_name":"hehe","password":"1234"}',--%>
<%--            dataType:"json",--%>
<%--            type:"post",--%>
<%--            success:function(data)--%>
<%--            {--%>
<%--                // eval(data);--%>
<%--                alert(data);--%>
<%--            }--%>
<%--        }--%>
<%--    );--%>
<%--    })--%>

<%--</script>--%>