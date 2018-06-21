
public class Main{
	public static void main(String args[]){
	 sortByString("good", "odg");
	 }
	 
	 public static void sortByStrings(String s, String t){
		 String a="";
		 for(int j=0; j<t.length(); j++){
			 for(int i=0; i<s.length(); i++){
				 if(s.charAt(i)==t.charAt(j))
					 a+=s.charAt(i);
			 }
		 }
	 System.out.println(a);
	 }
}
