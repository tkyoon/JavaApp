/**
 *  ++ JC1 Product ++
 */
package kr.co.jcone.uac.vo;

/**
 * <pre>
 * kr.co.jcone.uac.vo
 * RgFileVO.java
 * </pre>
 *
 * @Author : hoon
 * @Date : 2013. 9. 11. 오후 4:04:20
 */
public class RgFileVO {

	/** File아이디 */
	private String fileId;

	/** 조사아이디 */
	private String rsrchId;

	/** 담당자아이디 */
	private String userId;

	/** 유형코드 */
	private String rsTypeCd;

	/** 자료유형코드 */
	private String dataTypeCd;

	/** 서고관리번호 */
	private String storhsMngtNo;

	/** 보존상자아이디 */
	private String boxId;

	/** 서가아이디 */
	private String bookcaseId;

	/** 층 */
	private String rowNm;

	/** 열 */
	private String colNm;

	/** 연계file아이디 */
	private String linkFileId;

	/** File제목 */
	private String fileTitle;

	/** 내용 */
	private String fileContents;

	/** 공개구분 */
	private String pubDivCd;

	/** 비공개페이지 */
	private String priPage;

	/** 부분공개등급 */
	private String partPubGrdCd;

	/** 생산일자 */
	private String prdctYymmdd;

	/** 보존기간 */
	private String prsvnPridCd;

	/** 보존기간만료일 */
	private String prsvnPridEndDd;

	/** 전자여부 */
	private String elctYn;

	/** 수량(쪽수) */
	private String QTY;

	/** 기관장기록물 */
	private String chifFileYn;

	/** 유성구기록물 */
	private String orgFileYn;

	/** 생산기관 */
	private String prdctOrg;

	/** 비고 */
	private String REMARK;

	/** 관련문서번호 */
	private String relDocNo;

	/** File 검수상태 */
	private String chkStatus;

	/** File 상태 */
	private String fileStatus;

	/** 반려사유 */
	private String rtnResn;

	/** 상시여부 */
	private String tmpRegYn;

	/** 사용유무 */
	private String useYn;

	/** 등록자 */
	private String regId;

	/** 등록일자 */
	private String regDd;

	/** 수정자 */
	private String modId;

	/** 수정일자 */
	private String modDd;

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getRsrchId() {
		return rsrchId;
	}

	public void setRsrchId(String rsrchId) {
		this.rsrchId = rsrchId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRsTypeCd() {
		return rsTypeCd;
	}

	public void setRsTypeCd(String rsTypeCd) {
		this.rsTypeCd = rsTypeCd;
	}

	public String getDataTypeCd() {
		return dataTypeCd;
	}

	public void setDataTypeCd(String dataTypeCd) {
		this.dataTypeCd = dataTypeCd;
	}

	public String getStorhsMngtNo() {
		return storhsMngtNo;
	}

	public void setStorhsMngtNo(String storhsMngtNo) {
		this.storhsMngtNo = storhsMngtNo;
	}

	public String getBoxId() {
		return boxId;
	}

	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}

	public String getBookcaseId() {
		return bookcaseId;
	}

	public void setBookcaseId(String bookcaseId) {
		this.bookcaseId = bookcaseId;
	}

	public String getRowNm() {
		return rowNm;
	}

	public void setRowNm(String rowNm) {
		this.rowNm = rowNm;
	}

	public String getColNm() {
		return colNm;
	}

	public void setColNm(String colNm) {
		this.colNm = colNm;
	}

	public String getLinkFileId() {
		return linkFileId;
	}

	public void setLinkFileId(String linkFileId) {
		this.linkFileId = linkFileId;
	}

	public String getFileTitle() {
		return fileTitle;
	}

	public void setFileTitle(String fileTitle) {
		this.fileTitle = fileTitle;
	}

	public String getFileContents() {
		return fileContents;
	}

	public void setFileContents(String fileContents) {
		this.fileContents = fileContents;
	}

	public String getPubDivCd() {
		return pubDivCd;
	}

	public void setPubDivCd(String pubDivCd) {
		this.pubDivCd = pubDivCd;
	}

	public String getPriPage() {
		return priPage;
	}

	public void setPriPage(String priPage) {
		this.priPage = priPage;
	}

	public String getPartPubGrdCd() {
		return partPubGrdCd;
	}

	public void setPartPubGrdCd(String partPubGrdCd) {
		this.partPubGrdCd = partPubGrdCd;
	}

	public String getPrdctYymmdd() {
		return prdctYymmdd;
	}

	public void setPrdctYymmdd(String prdctYymmdd) {
		this.prdctYymmdd = prdctYymmdd;
	}

	public String getPrsvnPridCd() {
		return prsvnPridCd;
	}

	public void setPrsvnPridCd(String prsvnPridCd) {
		this.prsvnPridCd = prsvnPridCd;
	}

	public String getPrsvnPridEndDd() {
		return prsvnPridEndDd;
	}

	public void setPrsvnPridEndDd(String prsvnPridEndDd) {
		this.prsvnPridEndDd = prsvnPridEndDd;
	}

	public String getElctYn() {
		return elctYn;
	}

	public void setElctYn(String elctYn) {
		this.elctYn = elctYn;
	}

	public String getQTY() {
		return QTY;
	}

	public void setQTY(String qTY) {
		QTY = qTY;
	}

	public String getChifFileYn() {
		return chifFileYn;
	}

	public void setChifFileYn(String chifFileYn) {
		this.chifFileYn = chifFileYn;
	}

	public String getOrgFileYn() {
		return orgFileYn;
	}

	public void setOrgFileYn(String orgFileYn) {
		this.orgFileYn = orgFileYn;
	}

	public String getPrdctOrg() {
		return prdctOrg;
	}

	public void setPrdctOrg(String prdctOrg) {
		this.prdctOrg = prdctOrg;
	}

	public String getREMARK() {
		return REMARK;
	}

	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}

	public String getRelDocNo() {
		return relDocNo;
	}

	public void setRelDocNo(String relDocNo) {
		this.relDocNo = relDocNo;
	}

	public String getChkStatus() {
		return chkStatus;
	}

	public void setChkStatus(String chkStatus) {
		this.chkStatus = chkStatus;
	}

	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}

	public String getRtnResn() {
		return rtnResn;
	}

	public void setRtnResn(String rtnResn) {
		this.rtnResn = rtnResn;
	}

	public String getTmpRegYn() {
		return tmpRegYn;
	}

	public void setTmpRegYn(String tmpRegYn) {
		this.tmpRegYn = tmpRegYn;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public String getRegDd() {
		return regDd;
	}

	public void setRegDd(String regDd) {
		this.regDd = regDd;
	}

	public String getModId() {
		return modId;
	}

	public void setModId(String modId) {
		this.modId = modId;
	}

	public String getModDd() {
		return modDd;
	}

	public void setModDd(String modDd) {
		this.modDd = modDd;
	}

}