package chap3;
/*
 * Ư������ : \
 */
public class VarEx4 {

	public static void main(String[] args) {
	     char single = '\'';
	     System.out.println(single);
	     String str = "Hello \"ȫ�浿\"";
	     System.out.println(str);  //Hello "ȫ�浿"
	     String root = "c:\\";
	     System.out.println(root);  //c:\
	     
	     System.out.println("����\t�뱸\t�λ�");  // \t : tab
	     System.out.println("�ȳ��ϼ���\n�̺κ��� �����ٿ� ��µ˴ϴ�.");  // \n : new line
	     System.out.println("\uD64D\uAE38\uB3D9");  // \u : unicode. ���� �ڵ� �Է�. 

	}

}
