package com.imsoncod.model;

import java.sql.*;
import java.util.ArrayList;

public class MemberDAO {
	private static Connection conn;
	
	public MemberDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDrvier");
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		}
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","mvc" , "mvc");
			System.out.println(" 데이터베이스 접속 성공");
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getLocalizedMessage());
		}
	}
	
	//dto를 인자로 받아옴
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
				System.out.println("정상적으로 저장되지 않았습니다.");
			}else {
				check = true;
			}
			
			check = true;
		} catch (SQLException e) {
			System.out.println("SQL insert 오류 : " + e.getLocalizedMessage());
			check = false;
		}
		return true;
	}
	
	public boolean updateMember(MemberDTO dto) {
		
		return true;
	}
	
	//보통 ArrayList를 이용
	public MemberDTO[] selectMember() {
		
		return null;
	}
	
	//Connection 닫기
	public void close() {
		try {
			if(conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			System.out.println("SQL 오류 : " + e.getLocalizedMessage());
		}
	}
}
