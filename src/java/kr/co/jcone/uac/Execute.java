/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import javax.annotation.Resource;

import kr.co.jcone.uac.common.Constants;
import kr.co.jcone.uac.common.Utils;
import kr.co.jcone.uac.service.RegisterService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * </pre>
 *
 * @title Execute
 * @desc
 * @programID Execute.java
 * @cdate 2013. 9. 9.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
@Component
public class Execute {
	protected Log log = LogFactory.getLog(this.getClass());

	@Resource
	private RegisterService regService;

	public Execute() {
		Utils.loadXmlProperties();
	}

	/**
	 * <pre>
	 * 스프링 설정파일 로드
	 * </pre>
	 *
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:uac-app-context.xml");
		Execute exe = context.getBean("execute", Execute.class);
		exe.start();
	}

	private void start() throws Exception {
		log.info("@@ Program Start @@");
		String rootPath = (String) Utils.properties.get("excel.full.path");
		String excelFile = (String) Utils.properties.get("excel.file.name");

		regService.insertItem();
		//rgItemDao.insertTest();

	}

	private void httpTest() throws IOException {
		String paramString = "";

		URL targetURL = new URL("http://localhost:8080/uac" + "/service/getNewItemId.uac");

		HttpURLConnection conn = (HttpURLConnection) targetURL.openConnection();
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setUseCaches(false);

		DataOutputStream out = null;
		BufferedReader bReader = null;

		try {

			out = new DataOutputStream(conn.getOutputStream());
			out.writeBytes(paramString);
			out.flush();
			InputStream ins = conn.getInputStream();

			bReader = new BufferedReader(new InputStreamReader(ins, Constants._UAC_CHARTSET));
			String line = "";
			String retStr = "";
			while ((line = bReader.readLine()) != null) {
				retStr += line;
			}

			log.debug(retStr);

			Map retMap = Utils.jsonStrToListMap(new TypeReference<Map>() {
			}, retStr);
			log.debug(retMap);
			log.debug(retMap.get("data"));
			bReader.close();

		} finally {
			bReader.close();
			out.close();
		}

	}

}
