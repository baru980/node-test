package org.opentutorials.javatutorials.Method;

public class MethodDemo5 {
	
	public static String numbering(int itnt, int limit) {
		int i = itnt;
		
		String output = "";
		while (i < limit) {
			output += i;
			i++;
		}
	return output;
	}
	
	

	public static void main(String[] args) {
		
		String result = numbering(1, 3);
		
		System.out.println(result);

	}

}
