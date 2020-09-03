package chap9;
/*
 * 
 */
interface RemoteControl {
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean state) {
		if(state) System.out.println("무음처리함");
		else System.out.println("무음처리 해제");
	}
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
}
class Television implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");		
	}
	@Override
	public void setVolume(int volume) {
		System.out.println("TV의 볼륨을 " + volume + "으로 설정.");		
	}	
}
class Audio implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");		
	}
	@Override
	public void setVolume(int volume) {
		System.out.println("Audio의 볼륨을 " + volume + "으로 설정.");		
	}
}
public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();  //TV를 켭니다.
		rc.setVolume(10); //TV의 볼륨을 10으로 설정.
		rc.turnOff();  //TV를 끕니다.
		rc.setMute(true);  //무음 처리함.
		rc = new Audio();
		rc.turnOn();  //Audio를 켭니다.
		rc.setVolume(20); //Audio의 볼륨을 20으로 설정.
		rc.turnOff();  //Audio를 끕니다.
		rc.setMute(false);  //무음처리 해제.
		RemoteControl.changeBattery();  //건전지 교환.

	}

}
