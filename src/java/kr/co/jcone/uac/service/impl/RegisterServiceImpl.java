/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import kr.co.jcone.uac.dao.RgItemDao;
import kr.co.jcone.uac.service.RegisterService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * </pre>
 *
 * @title RegisterServiceImpl
 * @desc
 * @programID RegisterServiceImpl.java
 * @cdate 2013. 9. 10.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
@Service
public class RegisterServiceImpl implements RegisterService {

	protected Log log = LogFactory.getLog(this.getClass());

	@Resource
	private RgItemDao rgItemDao;

	/**
	 * <pre>
	 * Item ID를 서버로부터 받는다.
	 * </pre>
	 *
	 * @return
	 */
	public Map getItemId() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return
	 * @throws Exception
	 */
	public boolean uploadFileToUAR() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return
	 * @throws Exception
	 */
	public Map insertItem() throws Exception {
		log.debug("@@ call inertItem");
		rgItemDao.insertTest();
		return null;
	}

	/**
	 * <pre>
	 * </pre>
	 *
	 * @return
	 * @throws Exception
	 */
	public Map insertFile() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
