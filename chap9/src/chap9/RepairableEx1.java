package chap9;
/*
 * 매개변수 형으로 사용된 인터페이스
 */
class Unit {
	int hp;
	final int MAX;
	Unit(int hp) {
		this.hp=hp;
		MAX=hp;
	}
}
class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}
class GroundUnit extends Unit {
	GroundUnit(int hp){
		super(hp);
	}
}
interface Repairable{}  //멤버가 존재하지 않는 인터페이스 -> 가능 
class Tank extends GroundUnit implements Repairable{
	Tank() {super(150);  }
	public String toString() {return "Tank";  }
}
class DropShip extends AirUnit implements Repairable{
	DropShip() {super(125);  }
	public String toString() {return "DropShip";  }
}
class Marine extends GroundUnit{
	Marine() {super(40);  }
	public String toString() {return "Marine";  }
}
class SCV extends GroundUnit implements Repairable{
	SCV() {super(60);  }
	void repair(Repairable r) {  //Repairable 을 구현한 구현객체만 호출 가능
		if(r instanceof Unit) {
			Unit u = (Unit)r;  //왜 형변환 필요? Repairable r은 멤버가 존재하지 않는 인터페이스이므로 이를 구현한 
			u.hp = u.MAX;
			System.out.println(r.toString() + "수리 완료");
		}
		/*
		 * Repairable 타입의 r 참조변수로 hp, MAX 멤버에 접근 불가.
		 * r 참조변수도 Object 멤버에는 접근 가능
		 */
	}
	public String toString() { return "SCV"; }
}
public class RepairableEx1 {
	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		s.repair(d);
//		s.repair(m);   //error
		s.repair(s);

	}

}
