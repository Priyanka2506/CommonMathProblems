import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		isArmstrongNumber(num);
	}
	
	private static void isArmstrongNumber(int num){
		int cubeNumber = 0;
		int givenNum = num;
		
		while(num!=0){
			cubeNumber = cubeNumber+(int)Math.pow((num%10), 3);
			num = num/10;
		}
		
		if(cubeNumber == givenNum ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
