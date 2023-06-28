package org.javapro12;

import java.util.Scanner;

public class Sampleoddsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			if(i%2==1) {
				sum=sum+i;
			
			
			}
		}
		// TODO Auto-generated method stub
          System.out.println("The sum of odd number upto"+ num +" = " + sum);
	}

}
