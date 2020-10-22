<%@include file="header.jsp"%>
<div class="login-page">
    <div class="form">
        <form class="login-form" action="Login" method="post">
            <input type="text" placeholder="username" name="username"/>
            <input type="password" placeholder="password" name="password"/>
            <input type="submit" value="Login"/>
            <p class="message">Not registered? <a href="Reg-form.jsp">Create an account</a></p>
        </form>
    </div>
</div>
<%@include file="footer.jsp"%>