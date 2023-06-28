package org.javapro11;

import java.util.Scanner;

public class Samplefibbo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i,n1=0,n2=1;
		for(i=0;i<=num;i++) {
			System.out.println(n1+"");
			int fibo=n1+n2;
			n1=n2;
			n2=fibo;
			
		}
		
		
		
	}

}
