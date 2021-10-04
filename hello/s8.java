package hello;

public class s8 {

	public static void main(String[] args) {
		int gameScore =150;
		
		int lastScore1 =++gameScore;  //1만큼 더함  ++이 뒤로오면 실행후 1더함
		System.out.println(lastScore1);
		 
		int lastScore2=--gameScore; // 1만큼 뺌
		System.out.println(lastScore2);
	}

}
