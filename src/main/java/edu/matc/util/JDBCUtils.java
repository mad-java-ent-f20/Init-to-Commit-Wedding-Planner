package edu.matc.util;

import org.apache.logging.log4j.LogManager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Logger;

public class JDBCUtils {

    private final Logger logger = (Logger) LogManager.getLogger(this.getClass());

    private static String jdbcURL = "jdbc:mysql://localhost:3306/wedding";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "student";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
           // e.printStackTrace();
           // logger.error(e);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
          //  e.printStackTrace();
           // logger.error(e);
        }
        return connection;
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
               // logger.error(System.err);
              //  logger.error("SQLState: " + ((SQLException) e).getSQLState());
              //  logger.error("Error Code: " + ((SQLException) e).getErrorCode());
              //  logger.error("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                   // logger.debug("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    public static Date getSQLDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }

    public static LocalDate getUtilDate(Date sqlDate) {
        return sqlDate.toLocalDate();
    }
}
