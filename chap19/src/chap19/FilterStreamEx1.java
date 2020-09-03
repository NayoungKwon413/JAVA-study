package chap19;

import java.util.Arrays;
import java.util.List;

public class FilterStreamEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "���", "�̸���", "������", "�Ӳ���", "�����","ȫ�浿","���");
		list.stream().forEach(n->System.out.print(n+", "));
		System.out.println();
		list.stream().distinct().forEach(n->System.out.print(n+", "));
		System.out.println();
		//filter�� �����ϴ� ���鸸 ���� streamȭ -> ���� forEach()
		list.stream().filter(n->n.startsWith("ȫ")).forEach(n->System.out.print(n+", "));
		System.out.println();
		list.stream().filter(n->n.startsWith("ȫ")).distinct().forEach(n->System.out.print(n+", "));
		//����: �̸��� "��"�ڸ� ���� �̸��鸸 �ߺ����� ����ϱ�
		System.out.println();
		list.stream().filter(n->n.indexOf("��")!=(-1)).distinct().forEach(n->System.out.print(n+", "));
		list.stream().filter(n->n.contains("��")).distinct().forEach(n->System.out.print(n+", "));
	}

}
