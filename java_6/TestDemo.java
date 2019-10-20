package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDemo {
	public static void main(String[] args) {
//声明Connection对象
		Connection con;
//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
//Url指向要访问的数据库名mydata
		String url = "jdbc:mysql://localhost:3306/company";

		String username = "root";
		String password = "1234";
//遍历查询结果集
		try {
//加载驱动程序
			Class.forName(driver);
//首先，getConnection（）方法，连接MySQL数据库
			con = DriverManager.getConnection(url, username, password);
			if (!con.isClosed())
				System.out.println("恭喜你成功连接数据库！");
//然后创建statement类对象，用来执行SQL语句
			Statement statement = con.createStatement();
//你要执行的Sql语句
			String sql = "select name,ID from emp";
//最后设置Resultset类，用来存放获取的结果集
			ResultSet rs = statement.executeQuery(sql);

			System.out.println("执行结果如下：");
			System.out.println("姓名" + "\t" + "学号");

			String name = null;
			String ID = null;
			while (rs.next()) {

//获取emp的name数据
				name = rs.getString("name");
//获取emp的ID数据
				ID = rs.getString("ID");

				System.out.println(name + "\t" + ID);
			}

//最后关闭
			rs.close();
			con.close();
		} catch (ClassNotFoundException e) {
//数据库驱动类异常处理
			System.out.println("Sorry,can't find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
//数据库连接失败异常处理
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("恭喜你，数据库数据获取成功!!!");
		}
	}
}