package cafe.jjdev.mall.service;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDao {
	Connection connection;
	Context init;
	DataSource dataSource;
	public MemberDao() throws NamingException {
		init = new InitialContext();
		dataSource = (DataSource) init.lookup("java:comp/env/jdbc/mall");
	}
	public int insertMember(Member member) {
		dataSource
		return 0;
	}

	public Member selectMember(String id) {
		return null;
	}
	
}
