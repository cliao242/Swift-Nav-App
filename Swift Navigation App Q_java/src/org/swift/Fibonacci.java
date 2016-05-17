package org.swift;

public class Fibonacci{
	// fields

	// Method: Find Fibonacci Number
	void findFibonacci(final int firstN){
		int FNp2 = 1;    // F_N+2
		int FNp1 = 1; 	 // F_N+1
		int FN   = 0;    // F_N
		int prime = -1;
		
		for (int idx = 0;idx<firstN; idx++){
			FN   = FNp1;
			FNp1 = FNp2;
			FNp2 = FN + FNp1;
			
			for (int i=2;i<FN;i++){
				if(FN%i==0){
					prime = 2;
					break;
				}
				else 
					prime = 0;
			} // end loop for
			
			if (FN%3 == 0)
				System.out.println("Buzz");	
			else if (FN%5 == 0)
				System.out.println("Fizz");
			else if (prime==0)
				System.out.println("BuzzFizz");
			else 
				System.out.println(FN);

		} // end loop for
	} // close method
} // close Fibonacci class