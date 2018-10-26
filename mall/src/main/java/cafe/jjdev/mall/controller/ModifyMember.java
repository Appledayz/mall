package cafe.jjdev.mall.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cafe.jjdev.mall.service.MemberDao;

@WebServlet("/ModifyMember")
public class ModifyMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ModifyMember() {
        super();
    }
    private MemberDao memberDao;
    //	수정 폼
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ModifyMember doGet");
		//	1. 로그인 확인
		if(request.getSession().getAttribute("loginMember")==null) {
			System.out.println("로그인 되어있지 않음");
			response.sendRedirect(request.getContextPath()+"/login");
		}else {
			System.out.println("Login stat confirm");
			memberDao.selectMember(string);
		}
		//	2. MemberDao.selectMember()
		//	3. forward
	}
	//	수정 액션
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	1. 로그인 확인
		//	2. MemberDao.updateMember()
		//	3. 로그아웃 redirect
	}

}
