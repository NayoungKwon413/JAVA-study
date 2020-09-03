package chap6;
/*
 * score �迭���� ���� ���ΰ� 1�� �� ū �迭 result �����ϱ�.
 * score �迭�� ������ result�� �����ϰ�
 * �� �߰��� ��� ������ �� ��� ���� �� �����ϱ�
 */
public class Exam7 {

	public static void main(String[] args) {
		int [][] score = {
				{90,80,70},
				{95,85,75},
				{70,80,75},
				{75,70,85},
				{70,75,80}

	};
		//1.score �迭���� ���� ���ΰ� 1�� �� ū �迭 result �����ϱ�
		int[][] result = new int [score.length + 1][score[0].length + 1];
		//2.score �迭�� ������ result�� ����
		for(int i = 0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				result[i][j] = score[i][j];
				//���� �� ������ ���� ����
				result[i][score[i].length] += score[i][j];
				//���� �� ������ �࿡ ����
				result[score.length][j] += score[i][j];
				//��� ������ ���� ������ ��, ���� �����ϱ�
				result[score.length][score[i].length] += score[i][j];
			}
		}
		//result �迭 ����ϱ�
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%5d",result[i][j]);  //printf : ���������´�� ����� ��
				// %d : 10�� ������ ����� ��
				// %5d : 5�ڸ� Ȯ���ϰ�, 10�� ������ ����� ��
				// -> ������������, ���Ĺ���, ���Ĺ��� ������ ǥ��
			}
			System.out.println();
			
		}
		
		


}
}