package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
	

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("ThirdServlet init 메소드 호출");
	}


	public void destroy() {
		System.out.println("ThirdServlet destroy 메소드 호출");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ThirdServlet doGet 메소드 호출");
	}

	
	/*
	 * // protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // // TODO Auto-generated
	 * method stub // doGet(request, response); // }
	 */
}
