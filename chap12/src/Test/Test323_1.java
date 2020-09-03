package Test;
/*
 * 숫자 배열 내림차순으로 정리하기
 */
public class Test323_1 {
	public static void main(String[] args) {
		int [] num = {12, 1, 8, 10, 27};
		int tmp;
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length;j++) {
				if(num[i]<num[j]) {
					tmp=num[j];
					num[j]=num[i];
					num[i]=tmp;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
