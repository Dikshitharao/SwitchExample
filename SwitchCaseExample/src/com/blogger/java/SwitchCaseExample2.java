package com.blogger.java;

import java.util.Scanner;

public class SwitchCaseExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("January");//Observe there is no break.If you enter input as 1 the output will be January February March.
			//It will execute until it finds break.
		case 2:
			System.out.println("February");//If you enter input as 2 the output will be February March.
			//The output will start from its matching case till the break.
		case 3:
			System.out.println("March");//The operation takes place till this break if the input is 1 or 2
			break;
		}

	}

}
