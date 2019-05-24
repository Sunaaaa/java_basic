package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test01_map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("java01", "1234");
		map.put("java02", "0909");
		map.put("java03", "0070");
		map.put("user01", "1234");
		map.put("user02", "1234");
		map.put("java01", "0000");
		
		map.forEach(new BiConsumer<String, String>() {
			public void accept(String t, String u) {
				System.out.println(t + "/" + u);
			};
		});

		map.forEach((t,u)->System.out.println(t + "/" + u));
		/*
		 * System.out.println(map); System.out.println(map.get("java05"));
		 * 
		 * Set<String> key = map.keySet(); Iterator<String> it = key.iterator(); while
		 * (it.hasNext()) { String keyname = (String)it.next();
		 * System.out.println(keyname + "/" + map.get(keyname)); //
		 * System.out.println(it.next()); }
		 

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ID와  PWD를 입력하세요.");
			System.out.println("ID : _");
			String id = sc.nextLine().trim();
			System.out.println("PWD : _");
			String pwd = sc.nextLine().trim();
//			sc.nextLine();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 ID는 존재하지 않습니다.");
				continue;
			} else {
				if (!pwd.equals(map.get(id))) {
					System.out.println("로그인 실패_ 비밀번호 불일치");					
				}
				else {
					System.out.println("로그인 성공 쨘쨘쨘");
					break;
					
				}
			}
		}
		*/

	}

}
