package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;

public class JDBConnect {
	// db 연결 객체
	public Connection con;
	// 정적 쿼리
	public Statement stmt;
	// 동적 쿼리문 - select , insert, update, delete 실행
	public PreparedStatement psmt;
	// select 결과를 저장하기 위한 객체
	public ResultSet rs;

	// mysql 서버에 연결 - 기본생성자 이용
	public JDBConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 접속을 위해 class 파일 메모리에 로드 ( 객체 생성 )
			con = DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "0000");
			System.out.println("db 연결 성공 1");
		} catch (Exception e) {

		}
	}

	// application 내장 객체 영역 이용
	// 모든 웹페이지에서 접근가능하도록 application 내장 객체 영역에
	// db 연결 정보를 저장 -> web.xml에 등록
	public JDBConnect(ServletContext application) {
		String driver = application.getInitParameter("MySqlDriver");
		String url = application.getInitParameter("MySqlUrl");
		String id = application.getInitParameter("MySqlId");
		String pwd = application.getInitParameter("MySqlPwd");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("db 연결 성공 2 ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (psmt != null)
				psmt.close();
			if (con != null)
				con.close();
			System.out.println("자원 해제");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public PreparedStatement getPsmt() {
		return psmt;
	}

	public void setPsmt(PreparedStatement psmt) {
		this.psmt = psmt;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

}