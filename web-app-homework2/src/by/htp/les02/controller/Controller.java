package by.htp.les02.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.les02.entity.User;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public Controller() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
		
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		User user = new User.UserBuilder().firstName(request.getParameter("firstName"))
								   		 .eMail(request.getParameter("mail"))
								   		 .id(request.getParameter("id"))
								   		 .password(request.getParameter("password"))
								   		 .surname(request.getParameter("surname"))
								   		 .address(request.getParameter("address"))
								   		 .age(request.getParameter("age"))
								   		 .build();
		System.out.print(user);
		
		request.setAttribute("user", user);
		
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		rd.forward(request, response);
	}

}
