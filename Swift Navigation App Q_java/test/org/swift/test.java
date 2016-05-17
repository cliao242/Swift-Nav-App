package org.swift;
import java.util.Scanner;

/* A test code to find Fibonacci Number.
 * Printing
	... "Buzz" when F(n) is divisible by 3.
	... "Fizz" when F(n) is divisible by 5.
	... "BuzzFizz" when F(n) is prime.
	... the value F(n) otherwise.
*/

public class test{
	
	public static void main(String[] args){
		System.out.println("Enter the Fibonacci Number you're looking for:");
		Scanner sc = new Scanner(System.in);
		int firstN = sc.nextInt();
		sc.close();
		
		Fibonacci FibNum = new Fibonacci();
		FibNum.findFibonacci(firstN);
		
	} // end main

	
} // end class