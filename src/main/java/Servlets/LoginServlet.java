package Servlets;

import Classes.User;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.invalidate();
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            cookie.setMaxAge(0);
            cookie.setValue("");
            resp.addCookie(cookie);
        }
        req.getRequestDispatcher("/Login-form.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String path = getServletContext().getInitParameter("DBpath");
//        path.replace("/","\\");
        File file = new File("C:\\Users\\Abylay\\Downloads\\Home3\\src\\main\\webapp\\db.text");
        PrintWriter printWriter = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String u = "Name: "+username;
        String p = "Pass: "+password;
        String userName = "";
        String userPass = "";
        String userPhone = "";
        boolean userCheck = false;
        Scanner scanner = new Scanner(file);
        int lineIndex = 0;
        int linePass = -1;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            lineIndex++;
            if(line.contains(username)){
                userCheck = true;
                linePass = lineIndex+2;
            }
            if(lineIndex == linePass-1){
                userPass = line;
            }
            if(lineIndex == linePass-2){
                userName = line;
            }
            if(lineIndex == linePass){
                userPhone = line;
            }
        }
        if (!userCheck){
            printWriter.println("Not exist the user");
        }
        else {
            if (!userPass.equals(p)){
                printWriter.println("Incorrect login or password");
            }
            else{
                HttpSession session = req.getSession(true);
                session.setMaxInactiveInterval(300);
                int count = 0;
                try{
                    if(session.isNew()){
                        // empty case
                    }
                    else {
                        if(session.getAttribute("count") != null)
                        {
                            count = (Integer)session.getAttribute("count")+1;
                        }
                    }
                    session.setAttribute("count",count);
                    session.setAttribute("username",username);
                    userPhone = userPhone.substring(7,userPhone.length());
                    session.setAttribute("phone",userPhone);
                    session.setAttribute("password",password);
                    User a = new User(username,password,userPhone);
                    session.setAttribute("user",a);
                    req.getRequestDispatcher("/index.jsp").forward(req,resp);
                }
                catch (Exception exception){
                    exception.printStackTrace();
                }
            }
        }
    }
}
