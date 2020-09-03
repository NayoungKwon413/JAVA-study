package chap19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//article.txt ������ �м��Ͽ� ����� �ܾ��� ������ ����ϱ�
public class StreamEx1 {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("article.txt");
		FileReader fr = new FileReader(path.toFile());
		BufferedReader br = new BufferedReader(fr);
		//flatMap : �ٸ� ������ ��Ʈ������ ����
		Map<String,Long>wordcount = br.lines().flatMap(str->{  //br.lines() �ش� ������ ��� �о� stream����->���������� ��Ʈ������
			str=str.replace("��", " ");  //�ǹ̾��� ���� ����
			str=str.replace("��", " ");
			str=str.replace("��", " ");
			str=str.replace(".", " ");
			str=str.replace(",", " ");
			str=str.replace("!", " ");
			// ("\\s+") : \s�� ���鹮�ڸ� �ǹ�. \s+ : ���鹮�� �Ѱ��̻�.
			String[] strarr = str.split("\\s+"); //������ �������� �迭ȭ
			return Arrays.stream(strarr); //�ܾ� ���·� stream ȭ
		}).collect(Collectors.groupingBy(String::toString, Collectors.mapping(String::toString, Collectors.counting())));
		//�ܾ ���� Ƚ�� ����. �ܾ key, Ƚ���� value -> Stream�� ��Ƽ� collection ���� ����.
		System.out.println(wordcount);
		//���Ƚ���� ������������ ����
		//s �� map.entrySet() Ÿ�� => map�� ���� Strema<String>���� ���� 
		wordcount.entrySet().stream().map(s->s.getKey()+","+s.getValue())
		.sorted((a,b)->{ //compare �������̵�
			String str1 = a.substring(a.lastIndexOf(",")+1);
			String str2 = b.substring(b.lastIndexOf(",")+1);
			return Integer.parseInt(str2)-Integer.parseInt(str1);
		}).forEach(s->System.out.println(s));
	}

}
