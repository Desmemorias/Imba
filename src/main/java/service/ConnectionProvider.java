package service;
import java.sql.*;
import static service.Provider.*;

public class ConnectionProvider {


    public static Connection getCon() throws SQLException {
        Connection con= DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
        if(con!=null) System.out.println("Established");
        else System.out.println("connection is null");
        return con;
    }

}