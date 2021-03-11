package com.cg.lab10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Lab112 {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter file name:");
		String str=sc.next();
		File f=new File(str);
		JFileChooser j=new JFileChooser();
		if(f.exists()) {
			System.out.println("File exists");
			System.out.println(f.canRead()?"file is readale":"file is not readable");
			System.out.println(f.canWrite()?"file is writable":"file is not writable");
			System.out.println(f.length());
			System.out.println(j.getTypeDescription(f));
		}else {
			System.out.println("file does not exists:");
		}
	}

}
