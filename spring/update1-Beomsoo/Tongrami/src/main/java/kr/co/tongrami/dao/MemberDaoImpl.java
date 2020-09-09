package kr.co.tongrami.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.tongrami.model.MemberVo;
@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	SqlSession sql;
	
	
	@Override
	public List<MemberVo> selectMemberList() {
		return sql.selectList("member.list");
	}

	@Override
	public MemberVo selectMember(String memid) {
		return sql.selectOne("member.listOne",memid);
	}
	// !!!!!!!!!!!member.add 는 member.xml에 sql문 id에 변수가 저장되는것
	
	@Override
	public int insertMember(MemberVo vo) {
		return sql.insert("member.add",vo);
	}

	@Override
	public int updateMember(MemberVo vo) {
		return sql.update("member.edit",vo);
	}

	@Override
	public int deleteMember(String memid) {
		return sql.delete("member.del",memid);
	}

	@Override
	public MemberVo selectLoginMember(MemberVo vo) {
		return sql.selectOne("member.login",vo);
	}


}
