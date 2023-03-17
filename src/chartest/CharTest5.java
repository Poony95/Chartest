package chartest;

public class CharTest5 {

	public static void main(String[] args) {
		char ch='b';
		System.out.println(ch-'a');

		int []data =new int[5]; 
		//[0][1][0][0][0]
		// 0  1  2  3  4
		data[ch-'a']++;
		System.out.print(data[0] + " ");
		System.out.println(data[1]);

	}

}
