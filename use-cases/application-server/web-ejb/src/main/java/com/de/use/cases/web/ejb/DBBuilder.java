package com.de.use.cases.web.ejb;

import java.sql.Connection;
import java.sql.SQLException;

public interface DBBuilder {
    DBBuilder init(final String url,final String username,final String password);
    DBBuilder load(final String driver) ;
    Connection getConnection() throws SQLException;
}
