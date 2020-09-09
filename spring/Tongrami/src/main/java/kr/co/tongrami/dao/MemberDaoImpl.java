package kr.co.tongrami.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.tongrami.model.Member;

public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public void login(Member member) {
		sql.selectOne("loginUser", member);
	}

}
