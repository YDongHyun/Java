package hello;

public class s9 {

	public static void main(String[] args) {
		int num1= 10;
		int i =2;
		
		boolean value=((num1=num+10)<10)&&((i=i+2)<10); //앞에것이 거짓이기 때문에 뒷문장은 실행되지 않음
		
		vlaue = ((num1=num1+10)>10)||((i=i+2)<10); //앞에것이 참이기때문에 뒷문장은 실행되지 않음

	}

}
