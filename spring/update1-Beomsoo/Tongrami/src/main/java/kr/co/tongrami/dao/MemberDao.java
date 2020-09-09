package kr.co.tongrami.dao;

import java.util.List;

import kr.co.tongrami.model.MemberVo;

public interface MemberDao {

	List<MemberVo> selectMemberList();

	MemberVo selectMember(String memid);

	int insertMember(MemberVo vo);

	int updateMember(MemberVo vo);
	
	int deleteMember(String memid);
	
	MemberVo selectLoginMember(MemberVo vo);




	
	
	
	
	
	
	
}
