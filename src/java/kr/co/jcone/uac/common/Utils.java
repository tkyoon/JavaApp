/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Properties;
import java.util.UUID;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * <pre>
 * </pre>
 *
 * @title Utils
 * @desc
 * @programID Utils.java
 * @cdate 2013. 9. 9.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public class Utils {

	public static Properties properties = null;

	public static void loadXmlProperties(){
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream("./conf/uac-properties.xml");
			properties.loadFromXML(fis);
			//properties.list(System.out);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static <T> T jsonStrToListMap(final TypeReference<T> typeReference, final String jsonStr) {
		ObjectMapper mapper = new ObjectMapper();

		T rtsObj = null;

		try {
			rtsObj = mapper.readValue(jsonStr, typeReference);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return rtsObj;
	}

	private static String encodeString(ArrayList parameters) throws UnsupportedEncodingException {
		StringBuffer sb = new StringBuffer(256);

		Object[] obj = new Object[parameters.size()];
		parameters.toArray(obj);

		for (int i = 0; i < obj.length; i += 2) {
			if (obj[i + 1] instanceof File)
				continue;

			sb.append(URLEncoder.encode((String) obj[i], Constants._UAC_CHARTSET));
			sb.append('=');
			sb.append(URLEncoder.encode((String) obj[i + 1], Constants._UAC_CHARTSET));

			if (i + 2 < obj.length){
				sb.append('&');
			}
		}

		return sb.toString();
	}

	/**
	 * <PRE>
	 * - PK로 사용 가능한 유니크 키 생성
	 * - UUID 32byte + prefix 3byte = 총 35byte
	 * </PRE>
	 *
	 * @param prefix	생성된 UUID을 구분해줄수 있는 업무코드
	 * @return			인자값으로 입력된 prefix와 UUID를 합친 문자열 ex) LR-356015096E2542779E11C946DB93B952
	 */
	public static String getUUID(String prefix) {
		return prefix.toUpperCase() + "-" + UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
	}

}
