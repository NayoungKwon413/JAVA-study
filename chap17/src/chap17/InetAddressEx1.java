package chap17;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress Ŭ����
 *   - IP �ּ� ������ �����ϴ� Ŭ����
 *   - ��ü������ ���� �޼���
 *     getByName("�������̸�")
 *     getAllByName("�������̸�")
 *     getByAddress(byte[])
 *     getLocalHost()
 */
public class InetAddressEx1 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getByName("www.goodee.co.kr");
		System.out.println("getByName �޼��� ȣ��");
		System.out.println("hostname:" + ip.getHostName());
		System.out.println("hostaddress:"+ip.getHostAddress());  //���� IP �ּ�
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");  //����ϴ� �����μ����� ���� ���� �޶���
		System.out.println("getAllByName �޼��� ȣ��");
		for(InetAddress add : ips) {
			System.out.println("IP �ּ�:"+add);
		}
		//IPV4 : 32��Ʈ (=4����Ʈ)
		byte[] ipAddr=ip.getAddress();
		for(byte b : ipAddr) {
			System.out.print(((b<0)?256+b:b) +".");  //���� IP �ּҷ� ��°���
		}
		System.out.println();
		InetAddress ip2 = InetAddress.getByAddress(ipAddr);
		System.out.println("ip2�� �ּ�:"+ip2);
		System.out.println("getLocalHost �޼��� ȣ��");
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("�� ��ǻ��:"+local);
	}

}
