package kr.co.tongrami.service;

import java.util.List;

import kr.co.tongrami.model.MemberVo;

public interface MemberService {

	List<MemberVo> selectMemberList();

	int insertMember(MemberVo vo);

	MemberVo selectMember(String memId);

	int updateMember(MemberVo vo);

	int deleteMember(String memId);

	MemberVo selectLoginMember(MemberVo vo);

}
