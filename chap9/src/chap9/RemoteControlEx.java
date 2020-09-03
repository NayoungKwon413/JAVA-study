package chap9;
/*
 * 
 */
interface RemoteControl {
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean state) {
		if(state) System.out.println("����ó����");
		else System.out.println("����ó�� ����");
	}
	static void changeBattery() {
		System.out.println("������ ��ȯ");
	}
}
class Television implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");		
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");		
	}
	@Override
	public void setVolume(int volume) {
		System.out.println("TV�� ������ " + volume + "���� ����.");		
	}	
}
class Audio implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");		
	}
	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");		
	}
	@Override
	public void setVolume(int volume) {
		System.out.println("Audio�� ������ " + volume + "���� ����.");		
	}
}
public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();  //TV�� �մϴ�.
		rc.setVolume(10); //TV�� ������ 10���� ����.
		rc.turnOff();  //TV�� ���ϴ�.
		rc.setMute(true);  //���� ó����.
		rc = new Audio();
		rc.turnOn();  //Audio�� �մϴ�.
		rc.setVolume(20); //Audio�� ������ 20���� ����.
		rc.turnOff();  //Audio�� ���ϴ�.
		rc.setMute(false);  //����ó�� ����.
		RemoteControl.changeBattery();  //������ ��ȯ.

	}

}
