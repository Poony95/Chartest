package chartest;

public class CharTest03 {

	public static void main(String[] args) {

		String data = "Hello Yein ok";
		int p = 0;		//소문자의 개수를 나타낼 변수 추가
		char ch;
						
		for(int i=0; i < data.length(); i++)	//조건문으로 data 문자열을 돌려줌
		{
			ch = data.charAt(i);	// for 조건문 i 의 철자를 읽을 수 있게 함.
			if(ch == 'o') {			// 문자가 'o' 라면
				p = p + 1;			// 결과가 참이면 'o'인 글자를 합산하여 p 값으로 넣어라.
			}
		}
		System.out.println("소문자의 개수는 : " + p);
	}

}
