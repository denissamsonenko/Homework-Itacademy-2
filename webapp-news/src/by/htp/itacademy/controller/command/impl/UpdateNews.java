package by.htp.itacademy.controller.command.impl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.htp.itacademy.controller.command.Command;
import by.htp.itacademy.entity.News;
import by.htp.itacademy.service.NewsService;
import by.htp.itacademy.service.ServiceException;
import by.htp.itacademy.service.ServiceProvider;

public class UpdateNews implements Command{
	
	private static final String PARAMETR_TITLE = "title";
	private static final String PARAMETR_BRIEF = "brief";
	private static final String PARAMETR_CONTENT = "content";
	private static final String PARAMETR_ID = "id";
	
	private ServiceProvider serviceProvider = ServiceProvider.getInstance();
	private NewsService ns = serviceProvider.getNewsservice();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		News news = new News();
		news.setTitle(request.getParameter(PARAMETR_TITLE));
		news.setBrief(request.getParameter(PARAMETR_BRIEF));
		news.setContent(request.getParameter(PARAMETR_CONTENT));
		news.setId(Integer.parseInt(request.getParameter(PARAMETR_ID)));
		try {
			ns.update(news);
		} catch (ServiceException e) {
			throw new ServletException(e);
		}
		
		response.sendRedirect("controller?command=show_news");
	}
}
