package chap6;
/*
 * 5�� �л��� ����, ����, ���� ������ �л����� ����, ����� ���ϰ�, ���� ������ ��� ���ϱ�
 * [���]
 *         ����   ����  ����   ����   ���
 * 1���л� : 100  80  90  270  90.0
 * 
 */
public class Exam5 {

	public static void main(String[] args) {
		/*int [][] score = new int [5][3];
		for(int i =0; i<score.length; i++) {
		score[i] = new int[] {100, 80, 90};
		}*/
		//2���� �迭�� ����, ����, �ʱ�ȭ
		int[][] score = {{100,80,90}, {90,85,75},{70,80,90},{95, 85, 75}, {60,65,95}};
		
		int [] tot = new int [3];  //�� ������� ������ ���̴� ��
		System.out.println("\t����\t����\t����\t����\t���");
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"���л� : ");
				int sum = 0;
				for(int j=0; j<score[i].length; j++) {
					System.out.print(score[i][j] + "\t");
					sum += score[i][j];
					tot[j] += score[i][j];
				}
				//System.out.println(sum + "\t" + (double)sum/score[i].length);
				System.out.printf("%d\t%.2f\n", sum, (double)sum/score[i].length);
			
			
		}
		System.out.print("�������� :\t");
		for(int i =0; i<tot.length; i++) {
			System.out.print(tot[i] + "\t");
		}
		System.out.println();
		System.out.print("������� :\t");
		for(int i=0; i<tot.length; i++) {
			System.out.print((double)tot[i]/score.length+"\t");
			
		}
		System.out.println();

	}

}
