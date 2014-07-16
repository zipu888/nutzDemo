<%--
  Created by IntelliJ IDEA.
  User: xiaohao
  Date: 2014/7/10
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script src="js/jquery-1.4.4.min.js"></script>
    <script>
        $(function(){
            $("#clickButton").click(function(){
                alert("test");
                $.get("xiaopang/test/1",
                        function(data){
                            alert("Data Loaded: " + data);
                            var obj =$.parseJSON(data);
                            alert(obj.id);
                            console.log(obj.name);
                        });
            });
        });
    </script>
</head>
<body>
<h1>xiao pang</h1>
<button style="width: 200px;height: 100px;background-color: red" id="clickButton" value="测试请求json数据"></button>
</body>
</html>
