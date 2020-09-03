package chap16;
/*
 * 멀티 프로세스 예제
 */
public class ProcessEx1 {
	public static void main(String[] args) {
		try {
			//Runtime.getRuntime() : 프로세스의 실행 권한 OS에서 얻음.
			Process p1 = Runtime.getRuntime().exec("mspaint.exe");
			Process p2 = Runtime.getRuntime().exec("notepad.exe");
			p1.waitFor();  //p1 프로세스가 종로할때까지 main이 대기
			p2.destroy();  //메모장 강제 종료
		}catch(Exception e) {
			e.printStackTrace();
		}
		//ProcessEx1, mspaint.exe, notepad.exe 세 프로세스가 동시에 실행
		//배타적인 메모리 공간 -> 각 프로세스에 필요한 메모리를 할당(프로세스 과다 멀티 사용시, 메모리 부족-> OS 다운가능성있음)
		//메모리 공유 불가능

	}
}
