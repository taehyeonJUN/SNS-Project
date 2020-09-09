package kr.co.tongrami.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.tongrami.dao.MemberDao;
import kr.co.tongrami.model.MemberVo;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
//ctrl+1 해서 객체만들어주기
	
	@Resource(name = "memberDao")
	private MemberDao memberDao;
	

	@Override
	public List<MemberVo> selectMemberList() {
		return memberDao.selectMemberList();
	}

	@Override
	public MemberVo selectMember(String memId) {
		return memberDao.selectMember(memId);
	}
	
	@Override
	public int insertMember(MemberVo vo) {
		return memberDao.insertMember(vo);
	}

	@Override
	public int updateMember(MemberVo vo) {
		return memberDao.updateMember(vo);
	}

	@Override
	public int deleteMember(String memId) {
		return memberDao.deleteMember(memId);
	}

	@Override
	public MemberVo selectLoginMember(MemberVo vo) {
		return memberDao.selectLoginMember(vo);
	}

}
