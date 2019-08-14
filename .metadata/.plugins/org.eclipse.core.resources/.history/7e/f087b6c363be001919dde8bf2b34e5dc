<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!-- 부트스트랩 css-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <!-- 사용자 css-->
    <link rel="stylesheet" href="css/style.css">
    <style>
    	.container {
    		width: 600px;
    	}
    	

    </style>
</head>


<body>
    <!-- Navigation -->
	<%@ include file="/view/common/header.jsp" %>
    <!-- main-->

    <div class="container text-center padding">
        <div class="">
            <div class="panel panel-successs">
                <div class="panel-heading">
                    <h3 class="mb-3">Login</h3>
                </div>
                <div class="panel-body">
                    <form action="movie?action=loginAction" method="POST">
                        <input type="text" class="form-control mb-4" name="id" placeholder="id" autofocus>
                        <input type="password" class="form-control mb-4" name="pass" placeholder="Password">
                        <button type="submit" class="form-control btn btn-primary">로그인</button>
                    </form>
                    <a href="movie?action=idcheck">아이디/비밀번호 찾기</a><br>
                    <a href="movie?action=join">회원가입</a>
                </div>
            </div>
        </div>
    </div>



    <!-- Footer -->
	<%@ include file="/view/common/footer.jsp" %>

    <!-- 부트스트랩 -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous">
    </script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
    </script>
</body>


</html>