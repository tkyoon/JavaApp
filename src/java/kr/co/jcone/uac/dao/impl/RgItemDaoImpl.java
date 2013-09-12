/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import kr.co.jcone.uac.common.Utils;
import kr.co.jcone.uac.dao.RgItemDao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * <pre>
 * </pre>
 *
 * @title RgItemDAOImpl
 * @desc
 * @programID RgItemDAOImpl.java
 * @cdate 2013. 9. 10.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
@Component
public class RgItemDaoImpl extends SqlSessionDaoSupport implements RgItemDao {
	protected Log log = LogFactory.getLog(this.getClass());

	@Resource
	private SqlSession sqlSession;

	/**
	 * <pre>
	 * </pre>
	 *
	 * @param id
	 * @return
	 */
	public int test(String id) {
		log.debug("id = " + id);
		return 0;
	}

	public int test1(String id) {
		log.debug("id = " + id);
		String ret = sqlSession.selectOne("rg_item.test", id);
		System.out.println(ret);
		return 0;
	}

	@Transactional
	public void insertTest() throws Exception{
		log.debug("test");
		Map map = new HashMap();
		map.put("itemId", Utils.getUUID("IT"));
		map.put("fileId", "fileId");
		map.put("itemTypeCd", "01");
		map.put("fileNm", "파일명");
		map.put("fileSz", "1004");
		map.put("useYn", "Y");
		map.put("regId", "tkyoon");
		map.put("modId", "tkyoon");
		sqlSession.insert("rg_item.insert", map);
		//throw new Exception("rollback Test");

	}

}
