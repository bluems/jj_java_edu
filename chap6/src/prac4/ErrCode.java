package prac4;

public enum ErrCode {
	ERR_00("ERR_00","�� �� ���� ���� �߻�"),
	ERR_01("ERR_01","�и�� 0�� �� �� �����ϴ�."),
	ERR_02("ERR_02","������ ���� ����� �ٸ��ϴ�.");
	
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
