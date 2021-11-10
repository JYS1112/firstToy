package com.home.first;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;



public class JDBCTests {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 테스트 코드 작성, con 객체 생성
	@Test
	public void testConnection() {
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","JYS","JYS")){
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
