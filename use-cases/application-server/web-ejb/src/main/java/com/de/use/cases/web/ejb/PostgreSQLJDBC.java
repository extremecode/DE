package com.de.use.cases.web.ejb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLJDBC {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        try {
            c = DBConnectionBuilder.getInstance()
                    .init("jdbc:postgresql://16.78.54.6:5432/de","postgres","postgres")
                    .load("org.postgresql.Driver")
                    .getConnection();

            stmt = c.createStatement();
            String sql = "select * from employee";
            ResultSet rs =stmt.executeQuery(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
    }
}
