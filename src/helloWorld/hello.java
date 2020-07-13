package helloWorld;

import java.util.Scanner;

public class hello {
	public static void main (String[] args) {
		System.out.println("hello world");
		System.out.println("Please input your name (abbreviation):");
		Scanner input=new Scanner(System.in);
		String str = input.next();
		if (str.equals("zhengxm")|str.equals("zxm")) {
			System.out.println("Welcome back master.");
		}else {
			System.out.println("You are not the right one, please leave");
		}
	}
}
