package by.htp.itacademy.controller.command.impl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.htp.itacademy.controller.command.Command;
import by.htp.itacademy.service.NewsService;
import by.htp.itacademy.service.ServiceException;
import by.htp.itacademy.service.ServiceProvider;

public class DeleteNews implements Command{
	
	private ServiceProvider sp = ServiceProvider.getInstance();
	private NewsService ns = sp.getNewsservice();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		try {
			ns.delete(id);
		} catch (ServiceException e) {
			throw new ServletException(e);
		}
		response.sendRedirect("controller?command=show_news");
	}
}
