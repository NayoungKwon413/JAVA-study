package Test;

interface Actionable {}

class DanceRobot implements Actionable {
	void dance() {  System.out.println("���� ��ϴ�.");   }
}

class SingRobot implements Actionable {
	void sing() {     System.out.println("�뷡�� �մϴ�.");   }
}

class DrawRobot implements Actionable {
	void draw() {   System.out.println("�׸��� �׸��ϴ�.");   }

}


public class Test323 {
    public static void main(String[] args) {
    	 
          Actionable[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot() };

          for(int i=0; i<arr.length; i++) {

                 action(arr[i]);

}

}

	private static void action(Actionable robot) {
		if(robot instanceof DanceRobot) {
			DanceRobot dr = new DanceRobot();
			dr.dance();
		}
		if(robot instanceof SingRobot) {
			SingRobot sr = new SingRobot();
			sr.sing();
		}
		if(robot instanceof DrawRobot) {
			DrawRobot dr = new DrawRobot();
			dr.draw();
		}
	}
   
	
	
	
}
