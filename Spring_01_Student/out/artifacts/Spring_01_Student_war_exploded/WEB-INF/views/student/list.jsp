<%--
  Created by IntelliJ IDEA.
  User: ggram
  Date: 2021-11-03
  Time: 오전 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    table {
        width: 100%;
    }
tr {
    display: flex;
    border: 1px solid red;
    width: 100%;
    justify-content: center;
}
th {
    flex: 1;
    border: 1px solid blue;
}
td {
    flex: 1;
    border: 1px solid blue;
    text-align: center;
}

</style>
<body>
<%@ include file="/WEB-INF/views/home.jsp" %>
<table>
    <tr>
        <th>학번</th>
        <th>이름</th>
        <th>전공</th>
        <th>학년</th>
        <th>주소</th>
        <th>전화번호</th>
    </tr>
    <tr>
        <td>2021001</td>
        <td>홍길동</td>
        <td>컴퓨터공학</td>
        <td>2</td>
        <td>서울시 동대문구</td>
        <td>02-222-1234</td>
    </tr>
</table>

</body>
</html>
