package datastrcture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListMain {

	public static void main(String[] args) {
		//문자열을 저장할 수 있는 ArrayList 생성
		LinkedList<String> arraylist = new LinkedList<>();
		//데이터를 삽입
		arraylist.add("아이린");
		arraylist.add("나라");
		arraylist.add("설현");
		arraylist.add("수지");
		arraylist.add("유리");

		//데이터 개수
		System.out.println("데이터 개수 : " + arraylist.size());
		//전체 데이터 출력
		System.out.println("--=====rrayList 전체 데이터 출력=====--");
		for(String temp : arraylist) {
			System.out.println(temp);
		}
		//2번째 데이터출력하기
		System.out.println("============================");
		System.out.println(arraylist.get(1));
	}

}
