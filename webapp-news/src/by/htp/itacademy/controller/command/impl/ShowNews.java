package by.htp.itacademy.controller.command.impl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.itacademy.controller.command.Command;
import by.htp.itacademy.dao.DAOException;
import by.htp.itacademy.dao.impl.SQLNewsDAO;
import by.htp.itacademy.entity.News;

public class ShowNews implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi");
		
		SQLNewsDAO sql = new SQLNewsDAO();
		List<News> newsList = null;
		try {
			newsList = sql.findAll();
		} catch (DAOException e) {
			e.printStackTrace();
		}
				
		request.setAttribute("newsList", newsList);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/shownews.jsp");
		rd.forward(request, response);
		
	}

}
