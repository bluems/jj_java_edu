package prac4;

public enum ErrCode {
	ERR_00("ERR_00","알 수 없는 에러 발생"),
	ERR_01("ERR_01","분모는 0이 될 수 없습니다."),
	ERR_02("ERR_02","마지막 검출 대상이 다릅니다.");
	
	private String code;
	private String msg;
	private ErrCode(String code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public String getErrCode() {
		return this.code;
	}
	
	public String getErrMsg() {
		return this.msg;
	}
}
