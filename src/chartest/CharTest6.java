//대문자를 소문자로 바꾸어 출력하도록 함.
package chartest;
import java.util.Scanner;
public class CharTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//26개의 정수를 저장할 수 있는 count배열을 선언하고 생성
		int []count = new int[26];

		System.out.println("문자열을 입력하시오:");
		String buffer = sc.nextLine();
		for(int i=0; i<buffer.length(); i++){
			char ch = buffer.charAt(i);
			if( ch >= 'A' && ch <= 'Z' ){
				ch = (char)(ch + 32);
			}
			if( ch >= 'a' && ch <='z'){
				count[ch-'a']++;
			}
		}
		for(int i=0; i<count.length; i++) {
			System.out.println((char)('a'+i) + "->" + count[i]);
		}
	}
}


