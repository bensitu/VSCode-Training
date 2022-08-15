package Java.Java0809.Question1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    public static void commonUpdate(String sql, Object... args) {
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
}
