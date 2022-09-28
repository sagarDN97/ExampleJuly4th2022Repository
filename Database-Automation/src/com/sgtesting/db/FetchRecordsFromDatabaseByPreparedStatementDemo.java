package com.sgtesting.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class FetchRecordsFromDatabaseByPreparedStatementDemo {
	public static void main(String[] args) {
		fetchRecordsFromDB();
		insertRecordsInToDB();
	}
	
	private static void fetchRecordsFromDB()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			System.out.println("Connection is successful!!!");
			String query="select * from dept2";
			PreparedStatement stmt=conn.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsmeta=rs.getMetaData();
			String column1=rsmeta.getColumnName(1);
			String column2=rsmeta.getColumnName(2);
			String column3=rsmeta.getColumnName(3);
			System.out.printf("%-12s",column1);
			System.out.printf("%-12s",column2);
			System.out.printf("%-12s",column3);
			System.out.printf("\n");
			while(rs.next())
			{
				String deptnumber=rs.getString("DEPTNO");
				String deptname=rs.getString("DNAME");
				String location=rs.getString("LOC");
				System.out.printf("%-12s",deptnumber);
				System.out.printf("%-12s",deptname);
				System.out.printf("%-12s",location);
				System.out.printf("\n");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			try
			{
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void insertRecordsInToDB()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			System.out.println("Connection is successful!!!");
			String query="insert into dept2 values(70,'HEALTH','MANDYA')";
			PreparedStatement stmt=conn.prepareStatement(query);
			stmt.executeUpdate();
			String query1="insert into dept2 values(71,'GOLD','KGF')";
			PreparedStatement stmt1=conn.prepareStatement(query);
			stmt1.executeUpdate(query1);
			String query2="insert into dept2 values(72,'LAND','KOLAR')";
			PreparedStatement stmt2=conn.prepareStatement(query);
			stmt2.executeUpdate(query2);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally
		{
			try
			{
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
