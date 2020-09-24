package by.htp.itacademy.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import by.htp.itacademy.dao.DAOException;
import by.htp.itacademy.dao.impl.SQLNewsDAO;
import by.htp.itacademy.dao.pool.ConnectionPool;
import by.htp.itacademy.entity.News;

public class Main {

	public static void main(String[] args) throws SQLException, DAOException {
       
		ConnectionPool pool = new ConnectionPool();
		
		Connection con = pool.takeConnection();
		
		String sql = "UPDATE news SET title = ? WHERE id = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		News news = new News("title2", "brief", "content", LocalDate.now());
		
		
		ps.setString(1, news.getTitle());
		ps.setInt(2, 2);

		
		ps.executeUpdate();
		
		ps.close();		
		con.close();
		
		pool.dispose();
		System.out.println("end");
			
	}
}
