package Test;
/*
*  int getRand(���۰�,����) : �޼��� �����ϱ�
*   ���۰� ~ ���� �Ǵ� ����~ ���۰� ����  ������ ���ڸ� ������ ���� �����ϴ� �Լ�
*   ���۰�, ���� �� ���Ե�. 
*   ������ ���̹Ƿ� ������� �޶����� ����. �� -3 ~ 1 ������ ���� ��µ�.  
*/
public class Test3 {

	public static void main(String[] args) { 
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
			System.out.println();
			for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		 }
	}
	static int getRand(int start, int end) {
		int random=0;
		if(start>end) {
			random = (int)(Math.random()*(start-end+1))+end;	
		}else if(end>start) {
			random = (int)(Math.random()*(end-start+1))+start;		
		}
		return random;		
	}
	
	/*
	 * int min = (start>end)?end:start;
	 * int max = (start>end)?start:end;
	 * int cha = max-min;
	 * return (int)(Math.random() * (cha+1)) + min;
	 */
}
