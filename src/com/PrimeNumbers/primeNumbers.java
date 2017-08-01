package com.PrimeNumbers;

import java.util.Scanner;

public class primeNumbers {

	private static Scanner in;

	public static void main(String[] args) {
		
		System.out.print("please enter a number: ");
		in = new Scanner(System.in);
		int number = in.nextInt();
			
		for(int i=1; i<=number; i++){
			if(primeNumbers(i) == true)
				System.out.println(i + " is prime");
		}
	}
	
	public static boolean primeNumbers(int num){
		
		if (num<2)
			return false;
		for(int i=3; i<num; i++){
			if(num%i==0)
				return false;	
			}
		return true;
		}
		
	}

