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
	private static final String PAGE_SUCCESSFULLY = "/WEB-INF/jsp/savesuccessfully.jsp";
	private static final String PAGE_DEFAULT = "/WEB-INF/jsp/default.jsp";
	
	private ServiceProvider sp = ServiceProvider.getInstance();
	private NewsService ns = sp.getNewsservice();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String page;
		News news = new News();
		news.setTitle(request.getParameter(PARAMETR_TITLE));
		news.setBrief(request.getParameter(PARAMETR_BRIEF));
		news.setContent(request.getParameter(PARAMETR_CONTENT));
		news.setDate(LocalDate.now());
		try {
			if ("".equals(news.getTitle())||"".equals(news.getBrief())||"".equals(news.getContent())) {
				request.setAttribute("error","the field must not be empty ");
				page = PAGE_DEFAULT;
			}else {
				page = PAGE_SUCCESSFULLY;
				ns.save(news);
			}
		} catch (ServiceException e) {
			throw new ServletException(e);
		}
					
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);				
	}
}
