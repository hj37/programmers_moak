
public class Solution {
	
	public static void main(String[] args){
		String[] str = new String[5];
		for(int i = 0; i < str.length; i++)
		{
			str[i] = "½Å¿ë±Ç";
			
		}
		
		System.out.println(str[0].charAt(0));
		System.out.println(str[1] + str[0].charAt(0));
		System.out.println(str[0].charAt(0)+ str[1]);
		System.out.println(str[0].substring(0,2));
	}
}
