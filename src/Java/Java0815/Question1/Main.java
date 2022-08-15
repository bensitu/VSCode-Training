package Java.Java0815.Question1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        PreparedStatement pstmt3 = null;

        try {
            // 1.获取连接
            conn = JDBCUtils.getConnection();
            // 开启事务
            conn.setAutoCommit(false);
            System.out.println("登録SQL発行前の書籍一覧表示:");
            // 2.定义sql
            String sql1 = "SELECT * FROM books";
            String sql2 = "INSERT INTO books (isbn, title, price) values(?, ?, ?)";
            String sql3 = "INSERT INTO books (isbn, title, price) values(?, ?, ?)";
            // 3.获取执行sql对象
            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);
            pstmt3 = conn.prepareStatement(sql3);
            // 4. 设置参数
            pstmt2.setInt(1, 006);
            pstmt2.setString(2, "Object-C入門テキスト");
            pstmt2.setInt(3, 3500);

            pstmt3.setInt(1, 007);
            pstmt3.setString(2, "C++入門テキスト");
            pstmt3.setInt(3, 3000);
            // 5.执行sql
            pstmt1.executeUpdate();
            pstmt2.executeUpdate();
            pstmt3.executeUpdate();

            pstmt1.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            // 事务回滚
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, pstmt1);
            JDBCUtils.closeResource(conn, pstmt2);
            JDBCUtils.closeResource(conn, pstmt3);
        }

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
            // 事务回滚
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtils.closeResource(conn, ps);
        }
    }
}
