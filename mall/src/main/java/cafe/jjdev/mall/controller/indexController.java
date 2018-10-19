package cafe.jjdev.mall.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/index")		
public class indexController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("indexController doGet");
		//	1. router : @WebServlet("/index")
		
		//	2. model 호출 : DAO모델생성
		String model="jjdev";
		//	view rend...(template)
		
		//	3.	request.setAttribute("model", 2의 모델값);
		request.setAttribute("model", model);
		
		//	WEB-INF/jsp/index.jsp forward	WEB-INF는 클라이언트는 읽을 수 없지만 포워드하면 가능하다
		request.getRequestDispatcher("WEB-INF/jsp/index.jsp").forward(request, response);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
}
