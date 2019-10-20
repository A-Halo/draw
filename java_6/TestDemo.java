package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestDemo {
	public static void main(String[] args) {
//����Connection����
		Connection con;
//����������
		String driver = "com.mysql.jdbc.Driver";
//Urlָ��Ҫ���ʵ����ݿ���mydata
		String url = "jdbc:mysql://localhost:3306/company";

		String username = "root";
		String password = "1234";
//������ѯ�����
		try {
//������������
			Class.forName(driver);
//���ȣ�getConnection��������������MySQL���ݿ�
			con = DriverManager.getConnection(url, username, password);
			if (!con.isClosed())
				System.out.println("��ϲ��ɹ��������ݿ⣡");
//Ȼ�󴴽�statement���������ִ��SQL���
			Statement statement = con.createStatement();
//��Ҫִ�е�Sql���
			String sql = "select name,ID from emp";
//�������Resultset�࣬������Ż�ȡ�Ľ����
			ResultSet rs = statement.executeQuery(sql);

			System.out.println("ִ�н�����£�");
			System.out.println("����" + "\t" + "ѧ��");

			String name = null;
			String ID = null;
			while (rs.next()) {

//��ȡemp��name����
				name = rs.getString("name");
//��ȡemp��ID����
				ID = rs.getString("ID");

				System.out.println(name + "\t" + ID);
			}

//���ر�
			rs.close();
			con.close();
		} catch (ClassNotFoundException e) {
//���ݿ��������쳣����
			System.out.println("Sorry,can't find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
//���ݿ�����ʧ���쳣����
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("��ϲ�㣬���ݿ����ݻ�ȡ�ɹ�!!!");
		}
	}
}