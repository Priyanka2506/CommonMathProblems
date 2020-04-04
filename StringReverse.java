import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {

		String originalString = "This is a Java Program";
		String reversedString = new String();
		
		
		//1.using reverse() of String Builder
		reversedString = new StringBuilder(originalString).reverse().toString();
		System.out.println("using reverse(): "+ reversedString);
		
		//2.using get bytes
		byte[] bytes = originalString.getBytes();
		byte[] reverseBytes = new byte[originalString.length()];
		
		for(int i=0; i<originalString.length() ;i++){
			reverseBytes[i] = bytes[originalString.length()-i-1];
		}
		System.out.println("using getBytes(): "+new String(reverseBytes));
		
		//3.using char array
		char[] cArray = originalString.toCharArray();
		System.out.print("Using toCharArray(): ");
		for(int i=originalString.length()-1;i>=0;i--){
			System.out.print(cArray[i]);
		}
		
		//4.using ArrayList
		List<Character> cList = new ArrayList<>();
		for(char c:originalString.toCharArray()){
			cList.add(c);
		}
		Collections.reverse(cList);
		System.out.print("\nUsing ArrayList: ");
		Iterator i = cList.iterator();
		while(i.hasNext()){
			System.out.print(i.next());
		}
		
		//5.using ArrayDequeue
		ArrayDeque<Character> aQueue = new ArrayDeque<>();
		for(Character c : originalString.toCharArray()){
			aQueue.push(c);
		}
		System.out.print("\nUsing ArrayDequeue: ");
		for(Character c:aQueue ){
			System.out.print(aQueue.pop());
		}
	
	}

}
