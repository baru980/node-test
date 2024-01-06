package org.opentutorials.javatutorials.io;

import java.util.Scanner;


public class InputDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //System.in 은 사용자가 입력할 값
		int i = sc.nextInt(); // nextInt 는 메소드 i 값 입력 전까지 실행
		
		if (i == 1) {
		System.out.println(i*1000);
		} else {
			System.out.println("false");
		}
		sc.close();		
	}

}
