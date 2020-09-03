package chap19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
 * File �� ������ ��Ʈ��ȭ �ϱ�
 */
public class FileToStreamEx1 {
	public static void main(String[] args) throws IOException {
		System.out.println("������ ������ ��Ʈ���� �̿��Ͽ� �а�, ȭ�鿡 ����ϱ�");
		BufferedReader br = new BufferedReader(new FileReader(new File("src/chap19/IntStreamEx1.java")));
		br.lines().forEach(s->System.out.println(s));
		
		System.out.println("���� ��� ��Ʈ������ �����Ͽ� ����ϱ�");
		Path path = Paths.get("src/chap19");
		Stream<Path> st = Files.list(path);
		st.forEach(s->System.out.println(s));
	}

}
