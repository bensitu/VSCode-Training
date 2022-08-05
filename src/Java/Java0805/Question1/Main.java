package Java.Java0805.Question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/db1";
        String user = "root";
        String password = "root123!";
        String sql1 = null, sql2 = null, sql3 = null, sql4 = null, sql5 = null;
        PreparedStatement ps1 = null, ps2 = null, ps3 = null, ps4 = null, ps5 = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);

            // JDBCで連接して、全表を表示する
            sql1 = "SELECT * FROM lunchmenu";
            ps1 = conn.prepareStatement(sql1);
            ResultSet resultSet = ps1.executeQuery();

            for (int i = 0; i < 4; i++) {
                if (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    int price = resultSet.getInt(3);
                    int limited = resultSet.getInt(4);

                    // Object[] data = new Object[] { id, name, price, limited };
                    System.out.print(id + " ");
                    System.out.print(name + " ");
                    System.out.print(price + " ");
                    System.out.print(limited + " ");
                    System.out.println();
                }
            }

            // セットEを追加する
            sql2 = "INSERT INTO lunchmenu VALUES(?,?,?,?)";
            ps2 = conn.prepareStatement(sql2);
            ps2.setInt(1, 5);
            ps2.setString(2, "E");
            ps2.setInt(3, 1200);
            ps2.setInt(4, 10);
            ps2.execute();

            // Aセットの材料が季節の原因で数量は10に変更する
            sql3 = "Update lunchmenu set limited = ? where name =?";
            ps3 = conn.prepareStatement(sql3);
            ps3.setObject(1, 10);
            ps3.setObject(2, "A");
            ps3.execute();

            // Bセットの材料が季節の原因で値段が100円あげます
            sql4 = "Update lunchmenu set price = ? where name =?";
            ps4 = conn.prepareStatement(sql4);
            ps4.setObject(1, 900);
            ps4.setObject(2, "B");
            ps4.execute();

            // Dセットが人気ではないので、メ二ューから消します
            sql5 = "Delete from lunchmenu where name =?";
            ps5 = conn.prepareStatement(sql5);
            ps5.setObject(1, "D");
            ps5.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps1 != null) {
                    ps1.close();
                }
                if (ps2 != null) {
                    ps2.close();
                }
                if (ps3 != null) {
                    ps3.close();
                }
                if (ps4 != null) {
                    ps4.close();
                }
                if (ps5 != null) {
                    ps5.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
