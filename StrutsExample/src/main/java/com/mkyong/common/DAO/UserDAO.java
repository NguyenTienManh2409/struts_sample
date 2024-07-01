package com.mkyong.common.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mkyong.common.form.UserForm;

public class UserDAO {

    public List<UserForm> getAllUsers() throws Exception {
    	List<UserForm> userList = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/samplestruts", "root", "");

        String query = "SELECT * FROM users";
        
        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                UserForm user = new UserForm();
                user.setName(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                userList.add(user);
            }
        } catch (SQLException ex) {
            System.out.println("SQL statement is not executed! " + ex.getMessage());
        } finally {
            if (con != null) {
                con.close();
            }
        }
        return userList;
    }
    
    public void insertData(String name, String email) throws Exception {
		System.out.println("jdbc connection");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/samplestruts", "root", "");

		try {
			try {
				Statement st = con.createStatement();
				int value = st
						.executeUpdate("INSERT INTO users(username,email) "
								+ "VALUES('"+ name+"','"+ email+ "')");
				System.out.println("1 row affected" + value);
			} catch (SQLException ex) {
				System.out.println("SQL statement is not executed!" + ex);
			}	
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
