package by.htp.itacademy.controller.command.impl;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.itacademy.controller.command.Command;
import by.htp.itacademy.entity.News;
import by.htp.itacademy.service.NewsService;
import by.htp.itacademy.service.ServiceException;
import by.htp.itacademy.service.ServiceProvider;


public class SaveNews implements Command {
	
	private static final String PARAMETR_TITLE = "title";
	private static final String PARAMETR_BRIEF = "brief";
	private static final String PARAMETR_CONTENT = "content";
	
	private ServiceProvider sp = ServiceProvider.getInstance();
	private NewsService ns = sp.getNewsservice();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		System.out.println("Hello");
		News news = new News();
		news.setTitle(request.getParameter(PARAMETR_TITLE));
		news.setBrief(request.getParameter(PARAMETR_BRIEF));
		news.setContent(request.getParameter(PARAMETR_CONTENT));
		news.setDate(LocalDate.now());
		
		try {
			ns.save(news);
		} catch (ServiceException e) {
			throw new ServletException(e);
		}
					
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/savesuccessfully.jsp");
		rd.forward(request, response);				
	}
}
