<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<jsp:include page="head.jsp"/>
<style>
table{1px solid black; width: 80%;}
table tr {1px solid black}
table tr td{1px solid black}
</style>
<body>
<table>
	<tr>
		<td>
			<header id="layout-header">
				<tiles:insertAttribute name="header"/>
			</header>
		</td>
	</tr>
	<tr>
		<td>
			<article id="layout-gnb">
				<tiles:insertAttribute name="gnb"/>
			</article>
		</td>
	</tr>
	<tr>
		<td>
			<article id="layout-container">
				<tiles:insertAttribute name="container"/>
			</article>
		</td>
	</tr>
	<tr>
		<td>
			<footer id="layout-footer">
				<tiles:insertAttribute name="footer"/>
			</footer>
		</td>
	</tr>
</table>
<script></script>    
</body>
</html>