/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac.service;

import java.util.Map;

/**
 * <pre>
 * </pre>
 *
 * @title RegisterService
 * @desc
 * @programID RegisterService.java
 * @cdate 2013. 9. 10.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public interface RegisterService {

	public Map getItemId() throws Exception;

	/**
	 * <pre>
	 * http통신을 이용하여 UAR에 파일 전송
	 * </pre>
	 *
	 * @return
	 * @throws Exception
	 */
	public boolean uploadFileToUAR() throws Exception;

	/**
	 * <pre>
	 * UAC에 Item등록(RG_ITEM)
	 * </pre>
	 *
	 * @return
	 * @throws Exception
	 */
	public Map insertItem() throws Exception;

	/**
	 * <pre>
	 * UAC에 File등록(RG_FILE)
	 * </pre>
	 *
	 * @return
	 * @throws Exception
	 */
	public Map insertFile() throws Exception;





}
