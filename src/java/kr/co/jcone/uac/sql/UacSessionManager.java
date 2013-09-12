/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac.sql;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSessionManager;

/**
 * <pre>
 * </pre>
 *
 * @title UacSessionManager
 * @desc
 * @programID SqlSessionManager.java
 * @cdate 2013. 9. 10.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public class UacSessionManager {

	static SqlSessionManager sqlSessionManager = null;

//	static SqlSessionFactory sqlSessionFactory = null;

	public UacSessionManager(){
		String resource = "./conf/mybatis-config.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionManager = SqlSessionManager.newInstance(reader);
			//sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List listPaging(String queryId, Object parameterObject, int pageIndex, int pageSize) {
		sqlSessionManager.openSession();

		try {
			int skipResults = pageIndex * pageSize;
			int maxResults = (pageIndex * pageSize) + pageSize;

			return sqlSessionManager.selectList(queryId, parameterObject, new RowBounds(skipResults, maxResults));

		} finally {
			sqlSessionManager.close();

		}
	}

	public List list(String queryId, Object parameterObject) {
		sqlSessionManager.openSession();

		try {
			return sqlSessionManager.selectList(queryId, parameterObject);

		} finally {
			sqlSessionManager.close();

		}
	}

	public int insert(String queryId, Object parameterObject) {
		sqlSessionManager.openSession();
		int ret = 0;

		try {

			ret = sqlSessionManager.insert(queryId, parameterObject);
			sqlSessionManager.commit();


		} catch(Exception e){
			sqlSessionManager.rollback();

		} finally {
			sqlSessionManager.close();

		}

		return ret;
	}

	public int update(String queryId, Object parameterObject) {
		sqlSessionManager.openSession();
		int ret = 0;

		try {

			ret = sqlSessionManager.update(queryId, parameterObject);
			sqlSessionManager.commit();

		} catch(Exception e){
			sqlSessionManager.rollback();

		} finally {
			sqlSessionManager.close();

		}
		return ret;
	}

	public int delete(String queryId, Object parameterObject) {
		sqlSessionManager.openSession();
		int ret = 0;

		try {

			ret = sqlSessionManager.delete(queryId, parameterObject);
			sqlSessionManager.commit();

		} catch(Exception e){
			sqlSessionManager.rollback();

		} finally {
			sqlSessionManager.close();

		}
		return ret;
	}

}
