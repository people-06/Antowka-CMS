<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <spring:url value="/resources" var="resourceUrl"/>
        <script type="application/javascript" src="${resourceUrl}/js/jquery-2.1.4.min.js"></script>
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
    </head>

    <header>
        <tiles:insertAttribute name="header" />
    </header>

    <body>
        <tiles:insertAttribute name="body" />
    </body>

    <div>
        <tiles:insertAttribute name="footer" />
    </div>

</html>  