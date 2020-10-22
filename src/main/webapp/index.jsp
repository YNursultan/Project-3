<%@include file="header.jsp"%>
<form action="<%=request.getContextPath()%>/Show" method="post">
    <input type="submit" value="Sport" name="Sport">
</form>
<form action="<%=request.getContextPath()%>/Show" method="post">
    <input type="submit" value="Furniture" name="Furniture">
</form>
<form action="<%=request.getContextPath()%>/Show" method="post">
    <input type="submit" value="Gadgets" name="Gadgets">
</form>
<form action="<%=request.getContextPath()%>/Show" method="post">
    <input type="submit" value="Clothes" name="Clothes">
</form>
<form method="get" action="<%=request.getContextPath()%>/Login">
    <input type="submit" value="Logout">
</form>
<%@include file="footer.jsp"%>