package org.example.util;

import org.springframework.beans.factory.annotation.Value;

import java.sql.*;

public class AbstractManagedBean {

    @Value("${spring.datasource.url}")
    private String dburl;
    @Value("${spring.datasource.username}")
    private String dbuser;
    @Value("${spring.datasource.password}")
    private String dbpass;
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    protected String getDbConnection(String query) {

        String data = "";
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(dburl,dbuser,dbpass);
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                data = rs.getString(1);
            }

            ps.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return data;
    }



}
