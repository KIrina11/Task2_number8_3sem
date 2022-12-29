package ru.vsu.cs.kislova_i_v.dbconnection;

import com.sun.jdi.connect.spi.Connection;

import java.io.IOException;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getConnection () throws SQLException, IOException, ClassNotFoundException {
        return PostgresSQLConnection.getPostgresSQLConnection();
    }
}
