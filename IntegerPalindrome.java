import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		isPalindrome(num);
	}
	
	private static void isPalindrome(int num){
		int revNum = 0;
		int givenNum = num;
		while(num!=0){
			revNum = revNum*10 + (num%10);
			num = num/10;
		}
		if(revNum == givenNum){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
