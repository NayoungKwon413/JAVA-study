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

//article.txt 문서를 분석하여 저장된 단어의 갯수를 출력하기
public class StreamEx1 {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("article.txt");
		FileReader fr = new FileReader(path.toFile());
		BufferedReader br = new BufferedReader(fr);
		//flatMap : 다른 형태의 스트림으로 변경
		Map<String,Long>wordcount = br.lines().flatMap(str->{  //br.lines() 해당 파일을 모두 읽어 stream으로->한줄한줄이 스트림으로
			str=str.replace("가", " ");  //의미없는 글자 제거
			str=str.replace("는", " ");
			str=str.replace("을", " ");
			str=str.replace(".", " ");
			str=str.replace(",", " ");
			str=str.replace("!", " ");
			// ("\\s+") : \s는 공백문자를 의미. \s+ : 공백문자 한개이상.
			String[] strarr = str.split("\\s+"); //공백을 기준으로 배열화
			return Arrays.stream(strarr); //단어 형태로 stream 화
		}).collect(Collectors.groupingBy(String::toString, Collectors.mapping(String::toString, Collectors.counting())));
		//단어별 사용된 횟수 생성. 단어가 key, 횟수가 value -> Stream을 모아서 collection 으로 만듦.
		System.out.println(wordcount);
		//사용횟수의 내림차순으로 정렬
		//s 는 map.entrySet() 타입 => map을 통해 Strema<String>으로 변경 
		wordcount.entrySet().stream().map(s->s.getKey()+","+s.getValue())
		.sorted((a,b)->{ //compare 오버라이딩
			String str1 = a.substring(a.lastIndexOf(",")+1);
			String str2 = b.substring(b.lastIndexOf(",")+1);
			return Integer.parseInt(str2)-Integer.parseInt(str1);
		}).forEach(s->System.out.println(s));
	}

}
