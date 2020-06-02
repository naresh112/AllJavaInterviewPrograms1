package days21bund;

import java.util.Scanner;

public class Swapping2Nums5Ways {
	int a=10,b=20;
	public void logic1() {
		//logic1 create temp value
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swapping numbers a and b values is inter changed "+a+" "+b);
		
	}
	public static void main(String[] args) {
		new Swapping2Nums5Ways().logic1();
		 
	}

}
