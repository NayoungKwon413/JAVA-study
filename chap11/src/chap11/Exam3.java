package chap11;
/*
 * UnsupportFunctionException Ŭ���� �����ϱ�
 * 1. �������: private final int ERR_CODE;
 * 2. ����޼��� : 
 *    public int getErrCode() : return ERR_CODE;
 *    public String getMessage() : �������̵� �ؼ� ��ӹ��� getMessage()�� ERR_CODE ���� return �Ұ�.
 * 3. ����ó�� ���ص� �ǰ� ����
 * 4. �����ڴ� ����Ŭ������ �°� ����
 *    
 */
class UnsupportFunctionException extends RuntimeException{
	private final int ERR_CODE;
	public int getErrCode() {
		return ERR_CODE;
	}
	UnsupportFunctionException(String s, int i){
		super(s);
		ERR_CODE = i;
	}
	@Override
	public String getMessage() {
		return super.getMessage() + ", �����ڵ�:" + ERR_CODE;
	}
	
}
public class Exam3 {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException("�������� �ʴ� ����Դϴ�.", 200);
		}catch(UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}

	}

}
