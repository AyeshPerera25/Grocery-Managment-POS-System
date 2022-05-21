package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectrion {


    private static DBConnectrion dBConnection; /// Create a static reference variable to accesss anyware without creating objects
    private Connection connection;


    public DBConnectrion() throws ClassNotFoundException,SQLException {   //// this is the constructor to save the db connection when the object created and send to the errors to main window

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/thogaKade", "root", "root");

    }

    public static DBConnectrion getdBConnection() throws ClassNotFoundException,SQLException{  /// Due to the encapsulation Getters use to acces the dBConnection

        if (dBConnection==null){
            dBConnection = new DBConnectrion();
        }
        return dBConnection;


    }

    public Connection getConnection() {  /// Due to the encapsulation Getters use to acces the connection
        return connection;
    }


}
