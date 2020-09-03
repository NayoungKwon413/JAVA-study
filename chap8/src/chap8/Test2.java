package chap8;
/*
 * Coin 클래스와 구동 클래스 구현하기
  Coin 클래스
   멤버변수 : int side (앞면:0, 뒷면:1), serialNo(동전번호), sno(동전번호 생성을위한 클래스변수)
   멤버메서드 : void flip()
           Math.random() 메서드를 사용하여 side를 결정.

  구동클래스
    Coin 클래스의 객체를 10개 생성하기.
    객체생성시, 동전번호를 입력하고, flip() 메서드를 이용하여 각각의 동전이 앞면인지 뒷면인지 여부를 출력하기
  [결과]
1번동전 : 앞면
2번동전 : 뒷면
  ....
전체 앞면 동전의 갯수 :
전체 뒷면 동전의 갯수 : 
 */

class Coin {
	int side=0|1, serialNo;
	static int sno;
	Coin() {
		serialNo  = ++sno;
	}
	void flip() {
		side = (int)(Math.random()*2);
//		if(side == 0) {	
//			System.out.println("앞면");
//		}else System.out.println("뒷면");
	}
}

public class Test2 {

	public static void main(String[] args) {
		int front=0, back=0;
		Coin arr[] = new Coin[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Coin();
			arr[i].flip();
			System.out.println(arr[i].serialNo + "번동전 : " + ((arr[i].side == 0)?"앞면":"뒷면"));
			
			if(arr[i].side ==0) {
				front++;
			} else back++;
		}
		System.out.println("전체 앞면 동전의 갯수 : " + front);
		System.out.println("전체 뒷면 동전의 갯수 : " + back);

	}

}
