package chap6;
/*
 * score 배열보다 가로 세로가 1씩 더 큰 배열 result 생성하기.
 * score 배열의 내용을 result에 저장하고
 * 각 추가된 행과 열에는 각 행과 열의 합 저장하기
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
		//1.score 배열보다 가로 세로가 1씩 더 큰 배열 result 생성하기
		int[][] result = new int [score.length + 1][score[0].length + 1];
		//2.score 배열의 내용을 result에 저장
		for(int i = 0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				result[i][j] = score[i][j];
				//행의 합 마지막 열에 저장
				result[i][score[i].length] += score[i][j];
				//열의 합 마지막 행에 저장
				result[score.length][j] += score[i][j];
				//모든 점수의 합을 마지막 행, 열에 저장하기
				result[score.length][score[i].length] += score[i][j];
			}
		}
		//result 배열 출력하기
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%5d",result[i][j]);  //printf : 지정한형태대로 출력할 것
				// %d : 10진 정수로 출력할 것
				// %5d : 5자리 확보하고, 10진 정수로 출력할 것
				// -> 형식지정문자, 서식문자, 형식문자 등으로 표현
			}
			System.out.println();
			
		}
		
		


}
}