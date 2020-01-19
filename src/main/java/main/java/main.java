package main.java;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class main {
    public static void main(String[] args) {
        System.out.println(createConnection());
    }

    public static Connection createConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_19_01_2020?useUnicode=true&" +
                            "useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "admin", "admiN!2345");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
