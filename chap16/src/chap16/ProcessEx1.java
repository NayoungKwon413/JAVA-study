package chap16;
/*
 * ��Ƽ ���μ��� ����
 */
public class ProcessEx1 {
	public static void main(String[] args) {
		try {
			//Runtime.getRuntime() : ���μ����� ���� ���� OS���� ����.
			Process p1 = Runtime.getRuntime().exec("mspaint.exe");
			Process p2 = Runtime.getRuntime().exec("notepad.exe");
			p1.waitFor();  //p1 ���μ����� �����Ҷ����� main�� ���
			p2.destroy();  //�޸��� ���� ����
		}catch(Exception e) {
			e.printStackTrace();
		}
		//ProcessEx1, mspaint.exe, notepad.exe �� ���μ����� ���ÿ� ����
		//��Ÿ���� �޸� ���� -> �� ���μ����� �ʿ��� �޸𸮸� �Ҵ�(���μ��� ���� ��Ƽ ����, �޸� ����-> OS �ٿ�ɼ�����)
		//�޸� ���� �Ұ���

	}
}
