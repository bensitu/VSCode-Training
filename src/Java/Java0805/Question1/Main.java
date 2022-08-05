package Java.Java0805.Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/db1";
        String user = "root";
        String password = "root123!";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);

        // JDBCで連接して、全表を表示する
        String sql1 = "SELECT * FROM lunchmenu";
        PreparedStatement ps1 = conn.prepareStatement(sql1);
        System.out.println(sql1);
        ps1.execute();

        // セットEを追加する
        String sql2 = "INSERT INTO lunchmenu VALUES(?,?,?,?)";
        PreparedStatement ps2 = conn.prepareStatement(sql2);
        ps2.setInt(1, 5);
        ps2.setString(2, "E");
        ps2.setInt(3, 1200);
        ps2.setInt(4, 10);
        ps2.execute();

        // Aセットの材料が季節の原因で数量は10に変更する
        String sql3 = "Update lunchmenu set limited = ? where name =?";
        PreparedStatement ps3 = conn.prepareStatement(sql3);
        ps3.setObject(1, 10);
        ps3.setObject(2, "A");
        ps3.execute();

        // Bセットの材料が季節の原因で値段が100円あげます
        String sql4 = "Update lunchmenu set price = ? where name =?";
        PreparedStatement ps4 = conn.prepareStatement(sql4);
        ps4.setObject(1, 900);
        ps4.setObject(2, "B");
        ps4.execute();

        // Dセットが人気ではないので、メ二ューから消します
        String sql5 = "Delete from lunchmenu where name =?";
        PreparedStatement ps5 = conn.prepareStatement(sql5);
        ps5.setObject(1, "D");
        ps5.execute();
    }
}
