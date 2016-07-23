package core;

import java.util.HashSet;
import java.util.Set;
//https://www.reddit.com/r/dailyprogrammer/comments/4savyr/20160711_challenge_275_easy_splurthian_chemistry/
public class Main {

	public static void main(String arg[]){
		
		
		
	}
	
	

	public static boolean vaildSymbol(String element, String symbol){
		if(symbol.isEmpty()||element.isEmpty() || symbol.length()!=2){
			return false;
		}
		char s0 = Character.toLowerCase(symbol.charAt(0));
		char s1 = symbol.charAt(1);
		
	
		int i0 = -1;
		for(int i=0;i<element.length();i++){
			if(Character.toLowerCase(element.charAt(i))==s0){
				i0=i;
				break;
			}
		}
		
		if(i0==-1){
			return false;
		}
		
		for(int i=i0+1;i<element.length();i++){
			if(element.charAt(i)==Character.toLowerCase(s1)){
				return true;
			}
			
		}	
		return false;
		
		
		
	}


	public static String symbolGentrater(String element){
		char cFirst ='z';
		int index = 0;
		for(int i=0;i<element.length()-1;i++){
			if(Character.compare(Character.toLowerCase(element.charAt(i)),cFirst)<0){
				cFirst=Character.toLowerCase(element.charAt(i));
				index = i;
			}
			
		}
		char c2nd ='z';
		for(int i=index+1;i<element.length();i++){
			if(Character.compare(element.charAt(i),c2nd)<0){
				c2nd=element.charAt(i);
				
			}
			
		}
		return String.valueOf(Character.toUpperCase(cFirst))+ String.valueOf(c2nd);
	}

/*Zuulon 4 up 
 * Zu
 * Zl
 * Zo
 * Zn
 * 
 * uu
 * ul
 * uo
 * un
 * 
 * lo
 * ln
 * 
 * on
 * 
 * n = uqiue characters
 * n
 */

	public static int numSymbols(String elements){
		Set<Character> start = new HashSet<>();
		Set<Character> secound = new HashSet<>();
		
		for(int i=0;i<elements.length();i++){
			Character c =new Character(elements.charAt(i));	
			if(!start.contains(c)){
				start.add(c);
			}else{
				secound.add(c);
			}
		}
		
		int unp = start.size();
		int dou = secound.size();
			
		
		return ((unp*(unp-1))/2)  +dou;
		
	}
	
	
	
	
	
	public static int factorial (int n){
		if(n>1){
			return n*factorial(n-1);
			
		}else{
			return 1;
		}
		
	}

	 
	

}
