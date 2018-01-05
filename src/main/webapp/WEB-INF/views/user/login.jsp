<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Log in</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
    <link href="<c:url value='/resources/bootstrap/css/bootstrap.min.css' /> " rel="stylesheet" type="text/css" />
    <!-- Font Awesome Icons -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <!-- Theme style -->
    <link href="<c:url value='/resources/dist/css/AdminLTE.min.css' /> " rel="stylesheet" type="text/css" />
    <!-- iCheck -->
    <link href="<c:url value='/resources/plugins/iCheck/square/blue.css' /> " rel="stylesheet" type="text/css" />

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body class="login-page">
    <div class="login-box">
      <div class="login-logo">
        <a href="<c:url value='/'/>"><b>Spring</b>Project</a>
      </div><!-- /.login-logo -->
      <div class="login-box-body">
        <p class="login-box-msg">Sign in to start your session</p>

<form action="login" method="post">
  <div class="form-group has-feedback">
    <input type="text" name="user_id" class="form-control" placeholder="USER ID"/>
    <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
  </div>
  <div class="form-group has-feedback">
    <input type="password" name="user_password" class="form-control" placeholder="Password"/>
    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
  </div>
  <div class="row">
    <div class="col-xs-8">    
      <div class="checkbox icheck">
      <%-- <c:if test="${sessionScope.user.msg == 'fail'}">
							<div style="font-size: 10px; color: red">아이디 또는 비밀번호가 일치하지 않습니다.</div>
						</c:if>
						<c:if test="${sessionScope.user.msg == 'logout'}">
							<div style="font-size: 10px; color: red">로그아웃하였습니다.</div>
						</c:if> --%>
        <label>
          <input type="checkbox" name="useCookie"> Remember Me
        </label>
      </div>  
                            
    </div><!-- /.col -->
    
    <div class="col-xs-4">
      <button type="submit" class="btn btn-primary btn-block btn-flat" id="user_login">Sign In</button>
    </div><!-- /.col -->
  </div>
</form>


        <a href="#">I forgot my password</a><br>
        <a href="register.do" class="text-center">Register a new membership</a>

      </div><!-- /.login-box-body -->
    </div><!-- /.login-box -->

    <!-- jQuery 2.1.4 -->
    <script src="<c:url value='/resources/plugins/jQuery/jQuery-2.1.4.min.js' /> "></script>
    <!-- Bootstrap 3.3.2 JS -->
    <script src="<c:url value='/resources/bootstrap/js/bootstrap.min.js' /> " type="text/javascript "></script>
    <!-- iCheck -->
    <script src="<c:url value='/resources/plugins/iCheck/icheck.min.js' />" type="text/javascript"></script>
    <script type="text/javascript">

	$(document).ready(function() {
		$("#user_login").click(function() {
			document.login_form.action = "login";
			document.login_form.method = "POST";
			document.login_form.submit();
		});
    
    </script>
    <script>
    
    
      $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        });
      });
    </script>
  </body>
</html>