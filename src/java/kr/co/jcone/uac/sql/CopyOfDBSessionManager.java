/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac.sql;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;

/**
 * <pre>
 * </pre>
 *
 * @title SqlSessionManager
 * @desc
 * @programID SqlSessionManager.java
 * @cdate 2013. 9. 10.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public class CopyOfDBSessionManager {
//
//	static SqlSessionManager sqlSessionManager = null;
//
////	static SqlSessionFactory sqlSessionFactory = null;
//
//	public CopyOfDBSessionManager(){
//		String resource = "./conf/mybatis-config.xml";
//		Reader reader;
//		try {
//			reader = Resources.getResourceAsReader(resource);
//			sqlSessionManager = SqlSessionManager.newInstance(reader);
//			//sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
////	public static SqlSessionFactory getSqlSessionFactory() {
////		return sqlSessionFactory;
////	}
//
//	public List listPaging(String queryId, Object parameterObject, int pageIndex, int pageSize) {
//
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//
//		try {
//			int skipResults = pageIndex * pageSize;
//			int maxResults = (pageIndex * pageSize) + pageSize;
//
//			//sqlSession.selectList(queryId, parameterObject, new RowBounds(skipResults, maxResults));
//			sqlSessionManager.selectList(queryId, parameterObject, new RowBounds(skipResults, maxResults));
//			return sqlSession.selectList(queryId, parameterObject);
//
//		} finally {
//			sqlSession.close();
//
//		}
//	}
//
//	public List list(String queryId, Object parameterObject) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//
//		try {
//			return sqlSession.selectList(queryId, parameterObject);
//
//		} finally {
//			sqlSession.close();
//
//		}
//	}
//
//	public Object insert(String queryId, Object parameterObject) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//
//		try {
//
//			int ret = sqlSession.insert(queryId, parameterObject);
//			sqlSession.commit();
//			return ret;
//
//		} finally {
//			sqlSession.close();
//
//		}
//	}
//
//	public int update(String queryId, Object parameterObject) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//
//		try {
//
//			int ret = sqlSession.update(queryId, parameterObject);
//			sqlSession.commit();
//			return ret;
//
//		} finally {
//			sqlSession.close();
//
//		}
//	}
//
//	public int delete(String queryId, Object parameterObject) {
//		SqlSession sqlSession = sqlSessionFactory.openSession();
//
//		try {
//
//			int ret = sqlSession.delete(queryId, parameterObject);
//			sqlSession.commit();
//			return ret;
//
//		} finally {
//			sqlSession.close();
//
//		}
//	}

}
