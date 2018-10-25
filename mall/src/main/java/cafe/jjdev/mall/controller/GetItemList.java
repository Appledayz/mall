package cafe.jjdev.mall.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cafe.jjdev.mall.service.Item;
import cafe.jjdev.mall.service.ItemDao;

@WebServlet("/GetItemList")
public class GetItemList extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetItemList() {
        super();
    }
    private ItemDao itemDao;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int currentPage = 1;
		if(request.getParameter("currentPage") != null)	currentPage = Integer.parseInt(request.getParameter("currentPage"));
		int rowPerPage = 10;
		itemDao = new ItemDao();
		ArrayList<Item> list = itemDao.selectItemList(currentPage, rowPerPage);
		request.setAttribute("list", list);
		request.getRequestDispatcher("WEB-INF/jsp/ItemList.jsp").forward(request, response);
	}
}
