/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac.vo;

/**
 * <pre>
 * </pre>
 *
 * @title FlAudiovisual
 * @desc
 * @programID FlAudiovisual.java
 * @cdate 2013. 8. 30.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public class FlAudiovisualVO {

	/** 기록물형태 */
	private String avTypeCd;

	/** 원본매체 */
	private String orgcpyMdaCd;

	/** 생산장소 */
	private String prdctPlace;

	/** 주요인물 */
	private String charc;

	public String getAvTypeCd() {
		return avTypeCd;
	}

	public void setAvTypeCd(String avTypeCd) {
		this.avTypeCd = avTypeCd;
	}

	public String getOrgcpyMdaCd() {
		return orgcpyMdaCd;
	}

	public void setOrgcpyMdaCd(String orgcpyMdaCd) {
		this.orgcpyMdaCd = orgcpyMdaCd;
	}

	public String getPrdctPlace() {
		return prdctPlace;
	}

	public void setPrdctPlace(String prdctPlace) {
		this.prdctPlace = prdctPlace;
	}

	public String getCharc() {
		return charc;
	}

	public void setCharc(String charc) {
		this.charc = charc;
	}

}
