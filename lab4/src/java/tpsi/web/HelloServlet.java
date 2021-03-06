package tpsi.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import PersonPackage.Person;



@WebServlet(name = "HelloServlet", urlPatterns = {"/hello"})
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        
        
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String email = request.getParameter("email");
      
     
        Person p= new Person(imie,nazwisko,email);
        request.setAttribute("osoba", p);
            List<String> dni = new ArrayList<>();
            dni.add("Poniedziałek");
            dni.add("Wtorek");
            dni.add("Środa");
            dni.add("Czwartek");
            dni.add("Piątek");
            request.setAttribute("dniTygodnia", dni);


        request.getRequestDispatcher("hello.jsp").forward(request, response);
        

    }
}