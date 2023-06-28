package org.javapro13;

import java.util.Scanner;

public class Sampleevensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			if(i%2==0) {
				sum=sum+i;
			
			
			}
		}
		// TODO Auto-generated method stub
          System.out.println("The sum of odd number upto"+ num +" = " + sum);

	}

}
