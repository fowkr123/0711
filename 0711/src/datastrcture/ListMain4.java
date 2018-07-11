package datastrcture;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ListMain4 {

	public static void main(String[] args) {
		ArrayList <Game> list = new ArrayList<>();
		Game game = new Game();
		game.setNickname("타락파워전사");
		game.setJob("전사");
		game.setLevel(123);
		game.setMoney(679543400);
		game.setCreatedate("2018-02-28");
		list.add(game);
		
		game = new Game();
		game.setNickname("타락파워도적");
		game.setJob("도적");
		game.setLevel(149);
		game.setMoney(999543400);
		game.setCreatedate("2018-01-21");
		list.add(game);
		
		game = new Game();
		game.setNickname("타락파워마법사");
		game.setJob("마법사");
		game.setLevel(132);
		game.setMoney(879000);
		game.setCreatedate("2018-02-21");
		list.add(game);
		
		//리스트의 모든 데이터 확인
		//System.out.println(list);
		
		//각각의 데이터 확인
		System.out.println("--====월드의 모든 데이터 출력====--");
		for(Game temp : list) {
			System.out.println(temp);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1 : 레벨 랭킹");
		System.out.print("2 : 머니 랭킹");
		int inuser = sc.nextInt();
		
		Comparator <Game> comparator;
		
		if(inuser == 1) {
			comparator = new Comparator() {
				@Override
				public int compare(Object o1, Object o2) {
					Game first = (Game)o1;
					Game secound = (Game)o2;
					return secound.getLevel() - first.getLevel();
				}			
			};
			list.sort(comparator);
			for(Game temp : list) {
				System.out.println(temp);
			}
		}
	}
}
