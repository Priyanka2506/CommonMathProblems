import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CheckIfStringHasUniqueCharacters {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		isUniqueUsingHashSet(str);
		isUniqueUsingCharacterComparision(str);
	}
	
	// method 1: using hashset. add() returns true if character is added to the
	// set else returns false. use this to build logic
	private static void isUniqueUsingHashSet(String str){
		HashSet<Character> hs = new HashSet<>();
		System.out.println("Using Hash set: ");
		for(char c : str.toCharArray()){
			if(!hs.add(c)){
				System.out.println("\t\'"+str + "\' is not unique");
				return;
			};
		}
		System.out.println("\t\'"+str + "\' is unique");
	}
	
	//method 2: compare character by character with entire string
	private static void isUniqueUsingCharacterComparision(String str){
		System.out.println("Using character comparision: ");
		boolean flag=false;
		List<Character> li = new ArrayList<>();
		for(Character c: str.toCharArray()){
			li.add(c);
		}
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str.length();j++){
				if(i!=j){
					if(li.get(i) == li.get(j)){
						flag = true;
					}
				}
			}
		}
		if(flag){
			System.out.println("\t\'"+str + "\' is not unique");
		}else{
			System.out.println("\t\'"+str + "\' is unique");
		}
	}
}
