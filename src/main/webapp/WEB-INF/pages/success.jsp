<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../../js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">
        $(
            function () {
              $.getJSON("customer/findAll",jsonpCallback);
                function jsonpCallback(data) {
                    $(data).each(
                        alert(data)
                    var a= "<tr>"+"<td>"+this.name+"</td>"  +
                                "<td>"+this.age+"</td>"  +
                                "<td>"+this.tel+"</td>"  +
                                "</tr>";
                            $("table").append(a)

                    );
                }


            }
        );
    </script>
</head>
<body>
<table cellpadding="0" cellspacing="0" border="1" >
    <tr>
        <th align="center">姓名：</th>
        <th align="center">年龄：</th>
        <th align="center">电话：</th>
    </tr>


</table>

</body>
</html>
