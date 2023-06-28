package org.javapro10;

import java.util.Scanner;

public class Sampleprime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number:");
		int n;
		 n=sc.nextInt();
		 boolean flag = false;
		 for(int i=2;i<=n/2;i++) {
			 
			 if (n%i==0) {
				 flag = true;
			        break;
			 }
		 }
		 if(!flag)
				 System.out.println(n+"It is a prime number");
			 else
				 System.out.println(n+ "It is not a prime number");
				 
			 
			 
		 }
		// TODO Auto-generated method stub

	}


