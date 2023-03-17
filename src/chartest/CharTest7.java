package chartest;
import java.util.Scanner;
public class CharTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//26개의 정수를 저장할 수 있는 count배열을 선언하고 생성
		int []count = new int[26];


		System.out.println("문자열을 입력하세요");
		String buffer = sc.nextLine();
		for(int i=0; i<buffer.length(); i++) {
			char ch = buffer.charAt(i);
			if( ch != ' ') {
				count[ch-'a']++;
			}
			
		}
		for(int i=0; i<count.length; i++) {
			System.out.println((char)('a'+i) + "->" + count[i]);
		}
		}
	}


