<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Coming Soon | Triangle</title>
    <link href="/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="/resources/css/font-awesome.min.css" rel="stylesheet"> 
    <link href="/resources/css/main.css" rel="stylesheet">
    <link href="/resources/css/responsive.css" rel="stylesheet">

    <!--[if lt IE 9]>
        <script src="/resources/js/html5shiv.js"></script>
        <script src="/resources/js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="/resources/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/resources/images/ico/apple-touch-icon-57-precomposed.png">
    <style>
        body {font-family: Arial, Helvetica, sans-serif;}
        * {box-sizing: border-box}
        
        /* Full-width input fields */
        input[type=text], input[type=password] {
          width: 100%;
          padding: 15px;
          margin: 5px 0 22px 0;
          display: inline-block;
          border: none;
          background: #f1f1f1;
        }
        
        input[type=text]:focus, input[type=password]:focus {
          background-color: #ddd;
          outline: none;
        }
        
        hr {
          border: 1px solid #f1f1f1;
          margin-bottom: 25px;
        }
        
        /* Set a style for all buttons */
        button {
          background-color: #4CAF50;
          color: white;
          padding: 14px 20px;
          margin: 8px 0;
          border: none;
          cursor: pointer;
          width: 100%;
          opacity: 0.9;
        }
        
        button:hover {
          opacity:1;
        }
        
        /* Extra styles for the cancel button */
        .cancelbtn {
          padding: 14px 20px;
          background-color: #f44336;
        }
        
        /* Float cancel and signup buttons and add an equal width */
        .cancelbtn, .signupbtn {
          float: left;
          width: 50%;
        }
        
        /* Add padding to container elements */
        .container {
          padding: 16px;
        }
        
        /* Clear floats */
        .clearfix::after {
          content: "";
          clear: both;
          display: table;
        }
        
        /* Change styles for cancel button and signup button on extra small screens */
        @media screen and (max-width: 300px) {
          .cancelbtn, .signupbtn {
             width: 100%;
          }
        }
    </style>
</head><!--/head-->

<body>
    <div class="logo-image">                                
       <a id="home" href="#"><img class="img-responsive" src="/resources/images/logo.png" alt=""> </a> 
    </div>
     <section id="coming-soon">        
         <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2">                    
                    <div class="text-center coming-content">
                      <h1>학습자 인트로 화면</h1>
                      <p>학습자화면 이동시 페이스북 클릭</p>   
                        <div class="social-link">
                            <span><a id="facebook" href="#"><i class="fa fa-facebook"></i></a></span>
                            <span><a href="#"><i class="fa fa-twitter"></i></a></span>
                            <span><a href="#"><i class="fa fa-google-plus"></i></a></span>
                        </div>
                    </div>                    
                </div>
                <div class="col-sm-12">
                    <h1>학습자 등록화면</h1>
                    <div class="time-count">
                        <form style="border:1px solid #ccc">
                            <div class="container">
                              <h1>Sign Up</h1>
                              <p>Please fill in this form to create an account.</p>
                              <hr>
                              
                              <label for="name"><b>아이디</b></label>
                              <input type="text" placeholder="아이디 등록" id="userid" required>
                              <label for="name"><b>이 름</b></label>
                              <input type="text" placeholder="이름 등록" id="name" required>
                              <label for="password"><b>비밀번호</b></label>
                              <input type="password" value="1" id="password" required>
                              <label for="ssn"><b>주민번호(생년월일-1자리 900101-1)</b></label>
                              <input type="text" placeholder="비번 등록" id="ssn" required>
                              <label for="regDate"><b>등록일</b></label>
                              <input type="text" value="2020-03" id="regDate" required>
                              <label for="subject"><b>수강과목</b></label>
                              <input type="text" value="영어" id="subject" required>
                              
                              <label>
                                <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
                              </label>
                              
                              <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>
                          
                              <div class="clearfix">
                                <button type="button" class="cancelbtn">Cancel</button>
                                <button type="button" id="signupbtn" class="signupbtn">Sign Up</button>
                              </div>
                            </div>
                          </form>
                            
                    </div>
                </div>
            </div>
        </div>       
    </section>
    <section id="subscribe">
        <div class="container">
            <div class="row">
                <div class="col-sm-10 col-sm-offset-1">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2><i class="fa fa-envelope-o"></i> SUBSCRIBE TO OUR NEWSLETTER</h2>
                            <p>Quis filet mignon proident, laboris venison tri-tip commodo brisket aute ut. Tail salami pork belly, flank ullamco bacon bresaola do beef<br /> laboris venison tri-tip.</p>
                        </div>
                        <div class="col-sm-6 newsletter">
                            <form id="newsletter">
                                <input class="form-control" type="email" name="email"  value="" placeholder="Enter Your email">
                                <i class="fa fa-check"></i>
                            </form>
                            <p>Don't worry we will not use your email for spam</p>
                        </div>    
                    </div>
                </div>     
            </div>
        </div> 
    </section>

    <section id="coming-soon-footer" class="container">
        <div class="row">
            <div class="col-sm-12">
                <div class="text-center">
                    <p>&copy; Your Company 2014. All Rights Reserved.</p>
                    <p>Designed by <a target="_blank" href="http://www.themeum.com">Themeum</a></p>
                </div>
            </div>
        </div>       
    </section>
    

    <script src="${cmm}/js/jquery.js"></script>
    <script src="${cmm}/js/bootstrap.min.js"></script>
    <script src="${cmm}/js/wow.min.js"></script>
    <script src="${cmm}/js/coundown-timer.js"></script>
    <script src="${cmm}/js/main.js"></script>
    <script src="${uss}/js/register.js"></script>
    
</body>
</html>