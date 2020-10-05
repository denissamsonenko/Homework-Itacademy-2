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
	private static final String PAGE_SUCCESSFULLY = "/WEB-INF/jsp/showallnews.jsp";
	private static final String PAGE_DEFAULT = "/WEB-INF/jsp/default.jsp";
	
	private ServiceProvider serviceProvider = ServiceProvider.getInstance();
	private NewsService ns = serviceProvider.getNewsservice();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page;
		List<News> newsList = null;
			try {
				newsList = ns.findAll();
				if(newsList==null) {
					request.setAttribute("error","newsList null");
					page = PAGE_DEFAULT;
				}   page = PAGE_SUCCESSFULLY;
			} catch (ServiceException e) {
				throw new ServletException(e);
			}
						
		request.setAttribute("newsList", newsList);
		
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);		
	}
}
