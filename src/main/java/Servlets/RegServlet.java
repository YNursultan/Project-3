package Servlets;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("reg-username");
        String password = req.getParameter("reg-password");
        String phone = req.getParameter("reg-phone");
//        String path = getServletContext().getInitParameter("DBpath");
//        path.replace("/","\\");
        File file = new File("C:\\Users\\Abylay\\Downloads\\Home3\\src\\main\\webapp\\db.text");
        String user = "\nName: "+username+"\nPass: "+password+"\nPhone: "+phone;
        BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
        writer.append(user).append("\n*User Info*").close();
        req.getRequestDispatcher("/Login-form.jsp").forward(req,resp);
    }
}
