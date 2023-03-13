package chartest;

public class CharTest02 {

	public static void main(String[] args) {

		String data = "Hello Yein";
		char ch;
		ch = data.charAt(0);	// 자바에서 1번째를 0으로 표시합니다.
								// charAt은 한글자씩 읽어주는 기능입니다.
		System.out.println(ch);
	}

}
