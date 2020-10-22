package Servlets;

import Classes.Category;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ShowServlet extends HttpServlet {

    Category category = new Category();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("Sport") != null){
            req.setAttribute("items",category.getSport());
            req.getRequestDispatcher("/Buy-Page.jsp").forward(req, resp);
        }
        if(req.getParameter("Furniture") != null){
            req.setAttribute("items",category.getFurniture());
            req.getRequestDispatcher("/Buy-Page.jsp").forward(req, resp);
        }
        if(req.getParameter("Gadgets") != null){
            req.setAttribute("items",category.getGadgets());
            req.getRequestDispatcher("/Buy-Page.jsp").forward(req, resp);
        }
        if(req.getParameter("Clothes") != null){
            req.setAttribute("items",category.getClothes());
            req.getRequestDispatcher("/Buy-Page.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] arr = req.getParameterValues("items");
        PrintWriter printWriter = resp.getWriter();
        HttpSession session = req.getSession();
        Integer id = 0;
        Map map = new HashMap();
        for (int i=0;i<arr.length;i++){
            Cookie cookie = new Cookie("id"+id,arr[i]);
            map.put(id,arr[i]);
            id++;
        }
        printWriter.println("Username: " + session.getAttribute("username"));
        printWriter.println("Password: " + session.getAttribute("password"));
        printWriter.println("Phone: " + session.getAttribute("phone"));
        Date creation = new Date(session.getCreationTime());
        Date last = new Date(session.getLastAccessedTime());
        printWriter.println("creation time "+ creation +"<br>");
        printWriter.println("last access time "+ last +"<br>");
        Integer counter = (Integer) session.getAttribute("count");
        printWriter.println("you are visiting us: "+(++counter));
        if(counter>1)
            printWriter.println("times");
        else
            printWriter.println("time");
        for (int i=0;i<arr.length;i++){
            printWriter.println(arr[i]);
        }
    }
}
