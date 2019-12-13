package com.de.use.cases.web.ejb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DBConnectionBuilder implements DBBuilder{
    private static final Logger LOGGER = Logger.getLogger(DBConnectionBuilder.class.getName());
    private String jdbcURL;
    private String username;
    private String password;


    private static class DBConnectionBuilderHolder {
        private static final DBConnectionBuilder INSTANCE = new DBConnectionBuilder();
    }

    public static DBBuilder getInstance(){
        return DBConnectionBuilderHolder.INSTANCE;
    }

    @Override
    public DBBuilder init(String url, String username, String password) {
        this.jdbcURL = url;
        this.username = username;
        this.password = password;
        return this;
    }

    @Override
    public DBBuilder load(String driver){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            LOGGER.warning(" Failed to load the driver "+driver);
        }
        return this;
    }

    @Override
    public Connection getConnection() throws SQLException{
        return DriverManager
                .getConnection(this.jdbcURL,
                        this.username, this.password);
    }
}
