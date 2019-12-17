package org.lanqiao.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	public static SqlSession getSqlSession() throws Exception {

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(Resources.getResourceAsReader("conf.xml"));
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}
}
