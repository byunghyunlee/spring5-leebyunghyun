package practice;

public class Factorial {

	public static void main(String[] args) {
		// 7!

		int i = 6;
		int sum = 7;
		
		for(i=6;i>=1;i--) {
			System.out.println("sum = "+sum);
			System.out.println("i = "+i);
			sum = sum*i;

			System.out.println("result= "+sum);
			System.out.println("-----------");
		}
	}

}
