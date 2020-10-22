<%@include file="header.jsp"%>
<div class="login-page">
    <div class="form">
        <form class="login-form" action="<%=request.getContextPath()%>/Registration" method="post">
            <input type="text" placeholder="name" name="reg-username"/>
            <input type="password" placeholder="password" name="reg-password"/>
            <input type="tel" placeholder="phone number" name="reg-phone"/>
            <input type="submit" value="Registration"/>
            <p class="message">Already registered? <a href="Login-form.jsp">Sign In</a></p>
        </form>
    </div>
</div>
<%@include file="footer.jsp"%>