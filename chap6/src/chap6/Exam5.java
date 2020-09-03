package chap6;
/*
 * 5명 학생의 국어, 영어, 수학 점수를 학생별로 총점, 평균을 구하고, 과목별 총점과 평균 구하기
 * [결과]
 *         국어   영어  수학   총점   평균
 * 1번학생 : 100  80  90  270  90.0
 * 
 */
public class Exam5 {

	public static void main(String[] args) {
		/*int [][] score = new int [5][3];
		for(int i =0; i<score.length; i++) {
		score[i] = new int[] {100, 80, 90};
		}*/
		//2차원 배열의 선언, 생성, 초기화
		int[][] score = {{100,80,90}, {90,85,75},{70,80,90},{95, 85, 75}, {60,65,95}};
		
		int [] tot = new int [3];  //각 과목들의 총점이 모이는 곳
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"번학생 : ");
				int sum = 0;
				for(int j=0; j<score[i].length; j++) {
					System.out.print(score[i][j] + "\t");
					sum += score[i][j];
					tot[j] += score[i][j];
				}
				//System.out.println(sum + "\t" + (double)sum/score[i].length);
				System.out.printf("%d\t%.2f\n", sum, (double)sum/score[i].length);
			
			
		}
		System.out.print("과목총점 :\t");
		for(int i =0; i<tot.length; i++) {
			System.out.print(tot[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균 :\t");
		for(int i=0; i<tot.length; i++) {
			System.out.print((double)tot[i]/score.length+"\t");
			
		}
		System.out.println();

	}

}
