package by.htp.itacademy.controller.command.impl;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.htp.itacademy.controller.command.Command;
import by.htp.itacademy.entity.News;
import by.htp.itacademy.service.NewsService;
import by.htp.itacademy.service.ServiceException;
import by.htp.itacademy.service.ServiceProvider;

public class ShowNews implements Command{
	
	private ServiceProvider serviceProvider = ServiceProvider.getInstance();
	private NewsService ns = serviceProvider.getNewsservice();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<News> newsList = null;
			try {
				newsList = ns.findAll();
			} catch (ServiceException e) {
				throw new ServletException(e);
			}
		
				
		request.setAttribute("newsList", newsList);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/shownews.jsp");
		rd.forward(request, response);		
	}
}
