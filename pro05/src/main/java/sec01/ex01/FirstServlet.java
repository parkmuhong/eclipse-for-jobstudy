package sec01.ex01;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet: 부모, FirstServlet: 자손, extends: 상속
public class FirstServlet extends HttpServlet {
	@Override
	//Override: 부모가 가진 메서드가 마음에 들지 않을때 메서드를 다시 만들게 해주는것
	//init():initialize,초기화 시키다.
	//throws:
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	
	@Override
	//doGet():
	//Request : 요구
	//Response : 응답
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// println: 콘솔에 보이는 명령문
		System.out.println("doGet 메서드 호출");
	
}
	@Override
	//destroy():
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
	