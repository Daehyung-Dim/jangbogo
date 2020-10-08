<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html> 
  <head>
  <%@ include file="/include/header.jsp" %>
  </head>
  <body>
    <div id="all">
    <%@ include file="/include/topbar.jsp" %>
    <%@ include file="/include/loginmadal.jsp" %>
    <%@ include file="/include/navbar.jsp" %> 
      <div id="heading-breadcrumbs">
        <div class="container">
          <div class="row d-flex align-items-center flex-wrap">
            <div class="col-md-7">
              <h1 class="h2">자유게시판</h1>
            </div>
            <div class="col-md-5">
              <ul class="breadcrumb d-flex justify-content-end">
                <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                <li class="breadcrumb-item active">의뢰게시판</li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <section class="bar">
        <div class="container">
          <div class="row">
            <div class="col-lg-3">
              <!-- MENUS AND WIDGETS -->
              <div class="panel panel-default sidebar-menu with-icons">
                <div class="panel-heading">
                  <h3 class="h4 panel-title">게시판</h3>
                </div>
                <div class="panel-body">
                  <ul class="nav nav-pills flex-column text-sm">
                     <li class="nav-item"><a href="template-pagination.html" class="nav-link">의뢰게시판</a></li>
                    <li class="nav-item"><a href="template-tabs.html" class="nav-link">자유게시판</a></li>
                    </ul>
                </div>
              </div>
            </div>
      <!--테이블-->
    	<div class="col-lg-9">
              <div id="pagination" class="wp-example">
                <h3 class="section-title">자유게시판</h3>
                <div class="row">
                  <div class="col-md-12">
              <div class="box mt-0 mb-lg-0">
                <div class="table-responsive">
                  <table class="table table-hover">
                    <thead>
                      <tr>
                        <th>닉네임</th>
                        <th>날짜</th>
                        <th>제목</th>
                     </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <th>세존대완</th>
                        <td>22/06/2013</td>
                        <td>열어분 한글 쏴랑해주세요 땡큐 땡큐! 4딸라!4$!</td>
                       </tr>
                      <tr>
                        <th>유저아뒤</th>
                        <td>22/06/2013</td>
                        <td>까만 탄밥위에 몰캉몰캉한 삼겹살 한덩이</td>
                       </tr>
                      <tr>
                        <th>흥민전음</th> 
                        <td>22/06/2013</td>
                        <td>나랏말싸뮈 듕귁에달아 사맛디 아니할세 </td>
                        </tr>
                      <tr>
                        <th>아베 신세계</th>
                        <td>22/06/2013</td>
                        <td>고쿠민사마타치노 오카게데 이마노 와타시가 이마스</td>
                       </tr>
                      <tr>
                        <th>로날도 도람푸</th>
                        <td>22/06/2013</td>
                        <td>그뤠잇 어뭬리카 어겐~</td>
                       </tr>
                    </tbody>
                  </table>
                </div>
              </div>
              <nav aria-label="Page navigation example">
                      <ul class="pagination pagination-sm">
                        <li class="page-item"><a href="#" class="page-link">«</a></li>
                        <li class="page-item"><a href="#" class="page-link">1</a></li>
                        <li class="page-item"><a href="#" class="page-link">2</a></li>
                        <li class="page-item"><a href="#" class="page-link">3</a></li>
                        <li class="page-item"><a href="#" class="page-link">4</a></li>
                        <li class="page-item"><a href="#" class="page-link">5</a></li>
                        <li class="page-item"><a href="#" class="page-link">»</a></li>
                      </ul>
             </nav>
                   
 <form id="myform"> 
	<select class="searchfree" name="searchColumn" id="searchColumn">
		<option value="ename">닉네임</option>
		<option value="deptno">제목</option>
	</select> 
	<input type="text" placeholder="Search.." name="searchStr" id="searchStr" class="searchfree">
	 
	<!-- 버튼류 --> 
	<button type="button" class="btn btn-sm btn-primary">검색</button>
	<style id="sun" >.btn-lg {float: right;}</style>
                    <button type="button" id="sun" class="btn btn-lg btn-primary" >글쓰기</button><br><br>
                    
	<!-- <input type="button" value="일반검색버튼" onClick="httpAjax()"> -->
</form> 
					
                     </div>
          </div>
        </div>
        </div>
        </div>
        </div>
      </section>
      <!-- FOOTER -->
    <%@ include file="/include/footer.jsp" %> 
    </div>
    <!-- Javascript files-->
    <%@ include file="/include/script.jsp" %>
  </body>
</html>