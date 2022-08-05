package Java.Java0805.Question1_Optimised;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Java.Java0726.Question1.Ex;

public class Main {
    public static void main(String[] args) {
        String sql = "Update lunchmenu set limited = ? where name =?";
        try {
            commonUpdate(sql, 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void commonUpdate(String sql, Object... args) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // 获取数据库连接
            conn = JDBCUtils.getConnection();

            // 预编译sql语句，返回prepareStatement实例
            ps = conn.prepareStatement(sql);

            // 填充占位符
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            // 执行
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtils.closeResource(conn, ps);
        }
    }

    public static void comminQuery(String sql, Object... args) throws Exception {
        Connection conn = JDBCUtils.getConnection();

        PreparedStatement ps = conn.prepareStatement(sql);

        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }

        ResultSet rs = ps.executeQuery();

    }
}
