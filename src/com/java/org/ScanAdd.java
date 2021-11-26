package com.java.org;

import java.util.Scanner;

public class ScanAdd {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 
	 // getting a sentence from console
	
	 System.out.println("enter a sentence");
	 String nextLine = s.nextLine();
	 System.out.println("my lines are " + nextLine);
	 
	 // getting a word from console
	 
	 System.out.println("enter a string");
	 String str = s.next();
	 System.out.println("my word is " + str);
	 
	 
	 // addition of two values
	 
	 System.out.println("enter a number");
	 int a = s.nextInt();
	 System.out.println("enter another number");
	 int b = s.nextInt();
	 int c = a+b;
	 System.out.println("the summation of A and b "+ c);
	 
	 
	 

 }
	
}
