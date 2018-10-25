package cafe.jjdev.mall.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ModifyMember")
public class ModifyMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ModifyMember() {
        super();
    }
    //	수정 폼
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	1. 로그인 확인
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
