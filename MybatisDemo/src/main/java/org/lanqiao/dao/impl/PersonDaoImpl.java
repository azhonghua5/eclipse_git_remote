package org.lanqiao.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.lanqiao.dao.PersonDao;
import org.lanqiao.entity.Person;
import org.lanqiao.util.MybatisUtil;

public class PersonDaoImpl implements PersonDao {
	
	SqlSession sqlSession;

	public Person getPersonById(int id) {

		String statement = "org/lanqiao/mapper/personMapper.selectUserById";

			try {
				sqlSession = MybatisUtil.getSqlSession();
			} catch (Exception e) {
				e.printStackTrace();
			}
			Person person = sqlSession.selectOne(statement, id);
			return person;

	}
	
	public int addPerson(Person person) {
		String statement = "org/lanqiao/mapper/personMapper.addUser";

		try {
			sqlSession = MybatisUtil.getSqlSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int rows = sqlSession.insert(statement, person);
		sqlSession.commit();
		return rows;
	}
	
	public int deletePersonById(int id) {
		String statement = "org/lanqiao/mapper/personMapper.deleteUserById";

		try {
			sqlSession = MybatisUtil.getSqlSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int rows = sqlSession.insert(statement, id);
		sqlSession.commit();
		return rows;
	}

	public int updatePersonById(Person person) {
		String statement = "org/lanqiao/mapper/personMapper.updateUserById";
		
		try {
			sqlSession = MybatisUtil.getSqlSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int rows = sqlSession.update(statement, person);
		sqlSession.commit();
		return rows;
	}
	
	public List<Person> selectAll() {
		String statement = "org/lanqiao/mapper/personMapper.selectAll";
		try {
			sqlSession = MybatisUtil.getSqlSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Person> list = sqlSession.selectList(statement);
		return list;
	}
}
