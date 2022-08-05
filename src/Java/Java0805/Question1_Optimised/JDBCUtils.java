package Java.Java0805.Question1_Optimised;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
    public static Connection getConnection() throws Exception {
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("passsword");
        String url = pros.getProperty("url");
        String driverCalss = pros.getProperty("driverClass");

        Class.forName(driverCalss);

        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public void closeResource(Connection conn, Statement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
