package chap6;

public class Exam6_1 {

	public static void main(String[] args) {
		int arr[][] = {{1}, {10,20}, {30,40,50}, {60,70,80,90}};
		int max = 0;
		//�� ���� �� ���� �� ���� ū ���� max ������ ����
		 for(int i=0; i<arr.length; i++) {
		     if(max < arr[i].length) {
		        max = arr[i].length;
		     }
		  }
		  int tot[] = new int[max];
		  
		  //���� �հ� ���� ��
		  for(int i =0; i<arr.length; i++) {
			  int sum = 0;
			  for(int j=0; j<arr[i].length; j++) {
				  sum += arr[i][j];
				  tot[j] += arr[i][j];
			  }
			  System.out.println(i + "������:" + sum);
			  
		  }
		  //���� �� ���
		  for(int i=0; i<tot.length; i++) {
			  System.out.println(i + "������:" +tot[i]);
		  }

	}

}
