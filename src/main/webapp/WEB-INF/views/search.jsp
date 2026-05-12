<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Instagram Search</title>

<style>

body{
    background:#fafafa;
    font-family:Arial;
}

.container{
    width:500px;
    margin:auto;
}

.title{
    margin-top:20px;
    color:#e1306c;
}

.post{
    background:white;
    border:1px solid #ddd;
    border-radius:10px;
    overflow:hidden;
    margin-top:20px;
}

.post img{
    width:100%;
    height:300px;
    object-fit:cover;
}

.content{
    padding:15px;
}

.likes{
    color:#e1306c;
    font-weight:bold;
}

.top-post{
    background:#fff0f5;
    border:3px solid #e1306c;
}

</style>

</head>

<body>

<div class="container">

    <h2 class="title">
        Kết quả tìm kiếm: ${keyword}
    </h2>

    <c:forEach items="${results}" var="post" varStatus="loop">

        <div class="post ${loop.index == 0 ? 'top-post' : ''}">

            <img src="${post.image}">

            <div class="content">

                <h3>${post.author}</h3>

                <p>${post.content}</p>

                <div class="likes">
                    ❤️ ${post.likes} lượt thích
                </div>

                <c:if test="${loop.index == 0}">
                    <h3>
                        🔥 Bài viết nổi bật nhất
                    </h3>
                </c:if>

            </div>

        </div>

    </c:forEach>

</div>

</body>
</html>