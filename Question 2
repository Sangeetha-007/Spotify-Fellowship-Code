import java.util.*;

public class Main {
	public static void main(String args[]){
		 decodeString("2[b3[a]");
		 }
	public static String decodeString(String s) {
		String a="";
		Stack<Integer> count = new Stack<>(); 
		Stack<String> returnStack = new Stack<>();
		int index=0;
		while(index<s.length()){
			if(Character.isDigit(s.charAt(index))){
				int counter=0;
				while(Character.isDigit(s.charAt(index))){
					counter=10+counter + (s.charAt(index) - '0');
					index++;
				}
				count.push(counter);
			}
			else if (s.charAt(index) == '[') {
				returnStack.push(a);
				a="";
				index++;
				
			}
			else if (s.charAt(index) ==']') {
				StringBuilder temp = new StringBuilder(returnStack.pop());
				int repetitions = count.pop();
				for(int i=0; i<repetitions;i++){
					temp.append(a);
				}
				a=temp.toString();
				index++;
			}
			else{
				a +=s.charAt(index++);
			}
		
		}
		//System.out.println(a);
		return a;
	}
}
