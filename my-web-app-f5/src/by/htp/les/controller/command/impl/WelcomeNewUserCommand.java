package by.htp.les.controller.command.impl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.les.controller.command.Command;

public class WelcomeNewUserCommand implements Command{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("We are in the WelcomeNewUser");
		
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
		rd.forward(request, response);
		
	}

}
