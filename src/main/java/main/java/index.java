package main.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "SimpleWebApplication_war_exploded/index")
public class index extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            Connection connection = main.createConnection();
            PreparedStatement statement = connection.prepareStatement("insert into Person (first_name, last_name, birth_date) values (?, ?, ?);");
            statement.setString(1, request.getParameter("firstName"));
            statement.setString(2, request.getParameter("lastName"));
            statement.setDate(3, Date.valueOf(request.getParameter("birthDate")));
            statement.execute();
            connection.close();
            out.println("<h1>Dodano do bazy!</h1>");
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<h1>Nie udało się dodać do bazy!</h1>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
