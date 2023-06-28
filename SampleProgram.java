package org.javapro7;

import java.util.Scanner;

public class SampleProgram {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int num=sc.nextInt();
		int givenno=num;
		int i=0;
		int j=0;
		
		while(num>0)
		{
			i=num%10;
		//System.out.println(i);
		j=(j*10)+i;
		//System.out.println(j);
		num=num/10;
		//System.out.println(num);
		
		}
		System.out.println("The no is reversed");
		System.out.println(j);
		if(givenno==j) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		
		
		}
		
}
}
