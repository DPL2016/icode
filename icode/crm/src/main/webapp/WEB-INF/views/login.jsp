<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CRM-系统登录</title>

    <!-- Bootstrap Core CSS -->
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/static/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/static/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="/static/js/metisMenu/metisMenu.min.css">

</head>

<body>

<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-4">
            <div class="login-panel panel panel-default">
                <c:if test="${not empty message}">
                    <c:choose>
                        <c:when test="${message.state=='success'}">
                            <div class="alert alert-success">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                                    ${message.message}
                            </div>
                        </c:when>
                        <c:otherwise>
                            <div class="alert alert-danger">
                                <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                                    ${message.message}
                            </div>
                        </c:otherwise>
                    </c:choose>
                </c:if>
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="fa fa-coffee"></i> CRM系统登录</h3>
                </div>
                <div class="panel-body">
                    <form role="form" id="loginForm" method="post">
                        <fieldset>
                            <div class="form-group">
                                <input class="form-control" id="tel" placeholder="账号" name="tel" type="text" autofocus>
                            </div>
                            <div class="form-group">
                                <input class="form-control" id="password" placeholder="密码" name="password" type="password">
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input name="remember" type="checkbox" value="Remember Me">记住用户名
                                </label>
                            </div>
                            <!-- Change this to a button or input when using this as a form -->
                            <button id="subForm" class="btn btn-lg btn-success btn-block">进入系统</button>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- jQuery -->
<script src="/static/js/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="/static/js/bootstrap.min.js"></script>
<script src="/static/js/metisMenu/metisMenu.min.js"></script>
<!-- Custom Theme JavaScript -->
<script src="/static/js/sb-admin-2.js"></script>
<script>
    $(function () {

        $("#subForm").click(function () {
            if (!$("#tel").val()){
                $("#tel").focus();
            }
            if (!$("#password").val()){
                $("#password").focus();
            }
            $("#loginForm").submit();
        });
    });
</script>
</body>

</html>

