package main.connection;

import main.abstractPlain.AbstractPlain;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Ananyeu_NA on 12.07.2016.
 */
public class DBConnect {
    public ArrayList<AbstractPlain> plains = new ArrayList<AbstractPlain>();

    public ArrayList<AbstractPlain> getConnection() {

        final String DB_URL = "jdbc:mysql://localhost:3306/Project2?autoReconnect=true&useSSL=false";
        final String USER = "root";
        final String PASS = "root";
        String driver = "com.mysql.jdbc.Driver";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Plains");
                while (resultSet.next()) {
                    Integer length = resultSet.getInt("length");
                    Integer heigth = resultSet.getInt("heigth");
                    Integer maxFligth = resultSet.getInt("maxFligth");
                    Integer maxSpeed = resultSet.getInt("maxSpeed");
                    Integer people = resultSet.getInt("people");
                    Integer bomb = resultSet.getInt("bomb");
                    Integer weigth = resultSet.getInt("weigth");
                    String type = resultSet.getString("type");
                    plains.add(new AbstractPlain(length, heigth, maxFligth, maxSpeed, people, bomb, weigth, type));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return plains;
    }
}

