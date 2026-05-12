<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>My Instagram</title>

<style>

body{
    margin:0;
    background:#fafafa;
    font-family:Arial;
}

.header{
    background:white;
    border-bottom:1px solid #ddd;
    padding:15px;
    position:sticky;
    top:0;
}

.logo{
    font-size:30px;
    font-weight:bold;
    color:#e1306c;
}

.search-box{
    margin-top:10px;
}

.search-input{
    width:300px;
    padding:10px;
    border-radius:8px;
    border:1px solid #ccc;
}

.search-btn{
    padding:10px;
    border:none;
    background:#e1306c;
    color:white;
    border-radius:8px;
}

.container{
    width:500px;
    margin:auto;
    margin-top:30px;
}

.post{
    background:white;
    border:1px solid #ddd;
    border-radius:10px;
    overflow:hidden;
    margin-bottom:30px;
}

.post-header{
    padding:15px;
    font-weight:bold;
}

.post-image{
    width:100%;
    height:350px;
    object-fit:cover;
}

.post-content{
    padding:15px;
}

.likes{
    margin-top:10px;
    color:#e1306c;
    font-weight:bold;
}

</style>

</head>

<body>

<div class="header">

    <div class="logo">
        MyInstagram
    </div>

    <div class="search-box">

        <form action="search" method="get">

            <input type="text"
                   name="keyword"
                   class="search-input"
                   placeholder="Tìm kiếm bài viết">

            <button class="search-btn">
                Search
            </button>

        </form>

    </div>

</div>

<div class="container">

    <c:forEach items="${posts}" var="post">

        <div class="post">

            <div class="post-header">
                ${post.author}
            </div>

            <img class="post-image"
                 src="${post.image}">

            <div class="post-content">

                <div>
                    ${post.content}
                </div>

                <div class="likes">
                    ❤️ ${post.likes} lượt thích
                </div>

            </div>

        </div>

    </c:forEach>

</div>

</body>
</html>