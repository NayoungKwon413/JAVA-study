package chap12;

import java.util.Calendar;

/*
 * Calendar Ŭ���� ����
 * Calendar  Ŭ������ �߻�Ŭ�����̹Ƿ� new Calendar() �����ڷ� ��ü ������ �Ұ�����.
 * => getInstance() static �޼���� ��ü ����
 */
public class CalendarEx1 {
	public static void main(String[] args) {
//		Calendar now = new Calendar(); //��üȭ �Ұ�
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println("���� �⵵:" + now.get(Calendar.YEAR));
		System.out.println("�̹� ��:" + (now.get(Calendar.MONTH)+1));  //�� : 0~11�� ǥ�õǱ� ������ +1 �ʿ�.
		System.out.println("�⵵���� ��°��:" + now.get(Calendar.WEEK_OF_YEAR));
		System.out.println("������ ��°��:" + now.get(Calendar.WEEK_OF_MONTH));
		System.out.println("��������:" + now.get(Calendar.DATE));
		System.out.println("��������:" + now.get(Calendar.DAY_OF_MONTH));
		System.out.println("�⵵��������:" + now.get(Calendar.DAY_OF_YEAR));
		System.out.println("����:" + now.get(Calendar.DAY_OF_WEEK));  //����: �Ͽ��Ϻ��� 1�� ����. => ȭ����=3
		System.out.println("�����ظ�°����:" + now.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//�ð�
		System.out.println("����(0),����(1):" + now.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11):" + now.get(Calendar.HOUR));
		System.out.println("�ð�(0~23):" + now.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0~59):" + now.get(Calendar.MINUTE));
		System.out.println("��(0~59):" + now.get(Calendar.SECOND));
		System.out.println("�и���(0~999):" + now.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(-12~12):" + now.get(Calendar.ZONE_OFFSET)/(60*60*1000));  //���ؽú��� 9�ð� ����
		System.out.println("�̴��� ����������:"+now.getActualMaximum(Calendar.DATE));
		//Calendar Ŭ������ 2020-02-24 �� �����ϱ�
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 2-1, 24);
		System.out.println("��¥" + cal.get(Calendar.YEAR) + "��" + (cal.get(Calendar.MONTH)+1) +"��" + cal.get(Calendar.DATE)+"��");
		//����
		int week = cal.get(Calendar.DAY_OF_WEEK);
		if(week==1) System.out.println("SUN");
		else if(week==2) System.out.println("MON");
		else if(week==3) System.out.println("TUE");
		else if(week==4) System.out.println("WED");
		else if(week==5) System.out.println("THU");
		else if(week==6) System.out.println("FRI");
		else if(week==7) System.out.println("SAT");
		//������ ���� ���ϱ�
		System.out.println("�̴��� ����������:"+cal.getActualMaximum(Calendar.DATE));
	}
}
