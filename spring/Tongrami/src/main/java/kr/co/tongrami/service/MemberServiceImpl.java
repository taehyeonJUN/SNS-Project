package kr.co.tongrami.service;

import org.springframework.beans.factory.annotation.Autowired;

import kr.co.tongrami.dao.MemberDao;
import kr.co.tongrami.model.Member;

public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;
	
	@Override
	public void login(Member member) {
		
		memberDao.login(member);
		
	}

}