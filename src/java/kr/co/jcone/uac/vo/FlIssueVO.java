/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac.vo;

/**
 * <pre>
 * </pre>
 *
 * @title FlIssueVO
 * @desc
 * @programID FlIssueVO.java
 * @cdate 2013. 8. 30.
 * @version 1.0
 * @author 윤태경(tkyoon@jcone.co.kr)
 * @see
 *
 */
public class FlIssueVO {

	/** 기관구분 */
	private String isuOrgDivCd;

	/** 생산부서 */
	private String prdctDept;

	/** 납본여부 */
	private String submitYn;

	/** 발간등록번호 */
	private String regNo;

	public String getIsuOrgDivCd() {
		return isuOrgDivCd;
	}

	public void setIsuOrgDivCd(String isuOrgDivCd) {
		this.isuOrgDivCd = isuOrgDivCd;
	}

	public String getPrdctDept() {
		return prdctDept;
	}

	public void setPrdctDept(String prdctDept) {
		this.prdctDept = prdctDept;
	}

	public String getSubmitYn() {
		return submitYn;
	}

	public void setSubmitYn(String submitYn) {
		this.submitYn = submitYn;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

}
