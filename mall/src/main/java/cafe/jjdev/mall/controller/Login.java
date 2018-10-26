package cafe.jjdev.mall.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cafe.jjdev.mall.service.MemberDao;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
    }
    private MemberDao memberDao;
    //	로그인 폼
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Login doGet");
		if(request.getSession().getAttribute("loginMember")==null) {
			System.out.println("Login form forward");
			request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
		}else {
			System.out.println("...");
			response.sendRedirect("/index");
		}
	}
	//	로그인 액션
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	boolean MemberDao.login(Member)
		boolean isLogin = false;
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("loginMember", null);
			response.sendRedirect("/index");
		}else {
			response.sendRedirect("/login");
		}
	}

}
