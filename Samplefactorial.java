package org.javapro14;

import java.util.Scanner;

public class Samplefactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		// TODO Auto-generated method stub
System.out.println("The given factorial is " +fact);
	}

}
