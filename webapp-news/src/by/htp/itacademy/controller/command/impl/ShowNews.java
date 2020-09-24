package by.htp.itacademy.controller.command.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.itacademy.controller.command.Command;
import by.htp.itacademy.entity.News;

public class ShowNews implements Command{
	private static final String PARAMETR_TITLE = "title";
	private static final String PARAMETR_BRIEF = "brief";
	private static final String PARAMETR_CONTENT = "content";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<News> newsList = new ArrayList<>();
				
		request.setAttribute("newsList", newsList);
		
//		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
//		rd.forward(request, response);
		
	}

}
