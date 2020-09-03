package chap12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Date Ŭ���� : ��¥(�ð�����)�� ǥ���ϴ� Ŭ����
 * SimpleDateFormat : ����ȭ Ŭ����. Date Ŭ���� ��ü�� ����ȭ�� ���ڿ��� ����.
 *   String format(Date) : �Էµ� Date ��ü�� ������ format�� �µ��� ���ڿ��� �������ִ� ���
 *   Date  parse(String) : ����ȭ�� ���ڿ��� Date Ÿ������ �����ϴ� ���
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd E a HH:mm:ss");  
/*
 * 		yyyy : �⵵ 4�ڸ� ���
 *      MM   : �� 2�ڸ� ���
 *      dd   : �� 2�ڸ� ���
 *      HH   : �ð� 2�ڸ� ���
 *      mm   : �� 2�ڸ� ���
 *      ss   : �� 2�ڸ� ���
 *      E    : ���� ���
 *      a    : ����, ���� ���� ���
 */
		System.out.println(sf.format(now));
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		String dateStr = "2020-03-24 12:10:10";
		Date day = null;
		try {
			day = sf2.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		//����: 2021�� 3�� 23���� ���� ����ϱ�
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr2 = "2021-03-23";
		Date day2 = null;
		try {
			day2 = sf3.parse(dateStr2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day2);
		SimpleDateFormat sf4 = new SimpleDateFormat("yyyy-MM-dd : E����");
		System.out.println(sf4.format(day2));
		//1970�� ���ĺ��� ��������� �ð��� �и��ʷ� ����.
		System.out.println(now.getTime()); //now �ð��� �и��ʷ� ����
		System.out.println(System.currentTimeMillis()); //����ð��� �и��ʷ� ����

		//now���� 3�� ���� ��¥�� ������ ����ϱ�
		now.setTime(now.getTime()+(1000 * 60 * 60 * 24 * 3));
		System.out.println(sf4.format(now));
	}

}
