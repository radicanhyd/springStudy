package com.myweb.simple.legacy.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.myweb.simple.legacy.board.dto.BdDto;

public class BdDao {
	
	DataSource dataSource ;
	
	public BdDao() {
		try {
			Context context = new InitialContext();
			
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/neodb");
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public List<BdDto> getList() {
		
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BdDto> list = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "SELECT sid, bName, bContent, bTitle, bDate FROM test_board";
			pstmt = connection.prepareStatement(query) ;
			rs = pstmt.executeQuery();
			list = new ArrayList<BdDto>();
			
			while (rs.next()) {

				BdDto dto = new BdDto();
				
				dto.setSid(rs.getInt("sid"));
				dto.setbName(rs.getString("bName"));
				dto.setbContent(rs.getString("bContent"));
				dto.setbTitle(rs.getString("bTitle"));
				dto.setbDate(rs.getTimestamp("bDate"));
				
				list.add(dto);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)	rs.close();
				if (pstmt != null) pstmt.close();
				if (connection != null) connection.close();
			} catch (Exception e2) {
			}
		}
		
		
		return list;
		
	}
	
	

}
