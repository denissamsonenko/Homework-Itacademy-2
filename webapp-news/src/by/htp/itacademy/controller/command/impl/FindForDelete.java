package by.htp.itacademy.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.htp.itacademy.controller.command.Command;
import by.htp.itacademy.entity.News;
import by.htp.itacademy.service.NewsService;
import by.htp.itacademy.service.ServiceException;
import by.htp.itacademy.service.ServiceProvider;

public class FindForDelete implements Command{
	private ServiceProvider sp = ServiceProvider.getInstance();
	private NewsService ns = sp.getNewsservice();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		News news;
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			news=ns.find(id);
		} catch (ServiceException e) {
			throw new ServletException(e);
		}
		request.setAttribute("news", news);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/updatenews.jsp");
		rd.forward(request, response);
	}
}
