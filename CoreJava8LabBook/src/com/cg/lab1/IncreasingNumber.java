package com.cg.lab1;

import java.util.Scanner;

public class IncreasingNumber {
		  public static void checkNumber(int n){
			  int temp=0;
			  while(n>0) {
				  int m=n%10;
				  n=n/10;
				  int p=n%10;
				  
				  if(p>m) {
					  System.out.println("not in an increasing order");
					  break;  
				  }
                  else{
                	  System.out.println("it is an increasing numb");                  }
			  }
		  }
			public static void main(String[] args) {
				Scanner input= new Scanner(System.in);
				System.out.println("enter the n value");
				int n= input.nextInt();
				checkNumber(n);
	}

}
