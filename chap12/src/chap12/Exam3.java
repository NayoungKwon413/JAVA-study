package chap12;
/*
 * ����� �������� round �Լ� �����ϱ�
 * 
 * double round(�Ǽ���, �Ҽ������� �ڸ���)
 * double truncate(�Ǽ���, �Ҽ������� �ڸ���)
 */
public class Exam3 {
	public static void main(String[] args) {
		System.out.println(round(3.12345,1)); //3.1
		System.out.println(round(3.12345,2)); //3.12
		System.out.println(round(3.12345,3)); //3.123
		System.out.println(round(3.12345,4)); //3.1235
		
		System.out.println(truncate(3.12345,1)); //3.1
		System.out.println(truncate(3.12345,2)); //3.12
		System.out.println(truncate(3.12345,3)); //3.123
		System.out.println(truncate(3.12345,4)); //3.1234
	}
	static double round(double num1, int num2) {
		String s = String.format("%."+num2+"f", num1);
		double d = Double.parseDouble(s);
	    return 	d;
	    
//	    return Double.parseDouble(String.format("%."+num2+"f", num1)); //���ٷε� ����
	}
	/*
	 * (3.12345, 1)�� ���,
	 * 3.12345*10 = 31.2345 => (int)31 
	 * => 31/10.0 => 3.1
	 */
	static double truncate(double num1, int num2) {
		int num10 =1;
		for(int a=0; a<num2; a++) {
			num10 *= 10;
		}
		return (int)(num1*num10)/(double)num10;
	}

}
