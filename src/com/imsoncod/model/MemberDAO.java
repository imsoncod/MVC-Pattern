package com.imsoncod.model;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
	private static Connection conn;
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDrvier");
			System.out.println("����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mvc" , "mvc");
			System.out.println(" �����ͺ��̽� ���� ����");
		} catch (SQLException e) {
			System.out.println("SQL ���� : " + e.getLocalizedMessage());
		}
	}
	
	//dto�� ���ڷ� �޾ƿ�
	public boolean insertMember(MemberDTO dto) {
		String query = "insert into Member values(?, ?, ?, ?)";
		boolean check = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dto.getNum());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getTel());
			pstmt.setString(4, dto.getAddr());
			
			int x = pstmt.executeUpdate();
			if(x < 1) {
				System.out.println("���������� ������� �ʾҽ��ϴ�.");
			}else {
				check = true;
			}
			
			check = true;
		} catch (SQLException e) {
			System.out.println("SQL insert ���� : " + e.getLocalizedMessage());
			check = false;
		}
		return true;
	}
	
	public boolean updateMember(MemberDTO dto) {
		
		return true;
	}
	
	//���� ArrayList�� �̿�
	public MemberDTO[] selectMember() {
		
		return null;
	}
	
	//Connection �ݱ�
	public void close() {
		try {
			if(conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			System.out.println("SQL ���� : " + e.getLocalizedMessage());
		}
	}
}
