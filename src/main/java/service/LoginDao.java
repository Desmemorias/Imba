package service;
import model.User;

import java.sql.*;
public class LoginDao {

    public static boolean validate(User user){
        boolean status=false;
        try{
            Connection con=ConnectionProvider.getCon();
            System.out.println("Connection");
            PreparedStatement ps=con.prepareStatement(
                    "select * from users where email=? and password=?");

            ps.setString(1,user.getEmail());
            ps.setString(2, user.getPassword());

            ResultSet rs=ps.executeQuery();
            status=rs.next();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return status;

    }
}