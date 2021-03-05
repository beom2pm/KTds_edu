package com.example.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.UserVo;
@Repository("dao")
public class DBOracleDAO implements DBDao {

	@Override
	public List<UserVo> selectUserList(SqlSessionTemplate session) {
		// TODO Auto-generated method stub
		return session.selectList("UsersMapper.selectUserList");
	}

	@Override
	public UserVo selectUser(SqlSessionTemplate session, int userNo) {
		// TODO Auto-generated method stub
		return session.selectOne("UsersMapper.selectUser");
	}

	@Override
	public int userEnroll(SqlSessionTemplate session, UserVo user) {
		// TODO Auto-generated method stub
		return session.insert("UsersMapper.userEnroll",user);
	}

}
