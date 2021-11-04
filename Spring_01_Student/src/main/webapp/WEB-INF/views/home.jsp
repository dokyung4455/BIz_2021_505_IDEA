<%--
  Created by IntelliJ IDEA.
  User: ggram
  Date: 2021-11-03
  Time: 오전 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>학사관리 시스템</title>
</head>
<style>
    * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
    }
    h1 {
        text-align: center;
        background-color: #78a18f;
        color: white;
        padding: 20px 0 20px 0 ;
    }
    nav {
        background-color: cadetblue;
        color: white;
    }
    nav ul {
        display: flex;
        list-style: none;
    }
    nav li {
        padding: 10px;
        cursor: pointer;
        position: relative;
    }
    nav li#home_login {
        margin-left: auto;
        padding-right: 10px;
    }
</style>
<body>
<h1>고려고등학교 학사관리 2021 v1 </h1>
<nav class="menu_nav">
    <ul>
        <li name="home" id="home">Home</li>
        <li name="stu_list" id="stu_list">학생정보</li>
        <li name="score" id="score">성적일람표</li>
        <li name="login" id="home_login">로그인</li>
    </ul>
</nav>
</body>
<script>
    // document.querySelector("li#stu_list").addEventListener("click", () => {
    //     document.location.href = "/student/list"
    // })
    const menu = document.querySelector("nav.menu_nav")
    if(menu) {
        menu.addEventListener("click", (e)=> {
            let menu = e.target
            if(menu.tagName === "LI") {
                if(menu.innerText === "Home") {
                    document.location.href = "/student"
                }
                if(menu.innerText === "학생정보") {
                    document.location.href = "/student/list"
                }
                if(menu.innerText === "성적일람표") {
                    document.location.href = "/student/score"
                }
                if(menu.innerText === "로그인") {
                    document.location.href = "/login"
                }
            }
        })
    }
</script>
</html>
