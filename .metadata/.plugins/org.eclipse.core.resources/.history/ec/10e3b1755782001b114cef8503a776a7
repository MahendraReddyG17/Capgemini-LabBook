package com.cg.lab10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Lab111 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file name");
		char ch;
		int j=1;
		String str=sc.next();
		try(FileInputStream f=new FileInputStream(str)) {
			int n=f.available();
			System.out.println(j+":");
			for(int i=0;i<n;i++) {
				ch=(char)f.read();
				System.out.print(ch);
				if(ch=='\n') {
					System.out.print(++j+":");
				}
			
			}
		
		}catch(FileNotFoundException fe) {
			System.out.println("error");
		}
	}

}

