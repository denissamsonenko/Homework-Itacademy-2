package by.htp.itacademy.controller.command.impl;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.itacademy.controller.command.Command;
import by.htp.itacademy.dao.DAOException;
import by.htp.itacademy.dao.impl.SQLNewsDAO;
import by.htp.itacademy.entity.News;


public class SaveNews implements Command {
	
	private static final String PARAMETR_TITLE = "title";
	private static final String PARAMETR_BRIEF = "brief";
	private static final String PARAMETR_CONTENT = "content";
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Save DB");		
		News news = new News();
		news.setTitle(request.getParameter(PARAMETR_TITLE));
		news.setBrief(request.getParameter(PARAMETR_BRIEF));
		news.setContent(request.getParameter(PARAMETR_CONTENT));
		news.setDate(LocalDate.now());
		
		SQLNewsDAO sql = new SQLNewsDAO();
		try {
			sql.save(news);
		} catch (DAOException e) {
			throw new ServletException(e);
		}
				
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/savesuccessfully.jsp");
		rd.forward(request, response);
				
	}
}
