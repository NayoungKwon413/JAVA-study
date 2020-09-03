package chap7;

class Rectangle {
	int width;
	int height;
	
}

public class Exam1 {

	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		r1.width = 10;
		r1.height = 5;
		System.out.println("면적:" + (r1.width * r1.height));  //면적:50
		
		//배열을 이용하여 사각형 객체를 3개 생성하기
		//모든 사각형의 넓이 합을 출력하기
		Rectangle [] rec =new Rectangle[3];
		int sum =0;
		for(int i=0; i<rec.length; i++) {
			rec[i] = new Rectangle();
			rec[i].width = 10+i;
			rec[i].height = 5+i;
			sum += (rec[i].width * rec[i].height);
		}
		System.out.println("모든 사각형의 넓이 합:" + sum);

	}

}
