package com.calculator;

import java.util.Scanner;

public class Main {
	
	public int SUM(int N1, int N2) {
		
		int add;
		add = N1 + N2;
		
		System.out.println("Sum = " + add);
		return add;
		}
    public int Subtract(int N1, int N2) {
		
		int subtract;
		subtract = N1 - N2;
		
		System.out.println("Difference = " + subtract);
		return subtract;
		}
    public int Multiply(int N1, int N2) {
		
		int multiply;
		multiply = N1 * N2;
		
		System.out.println("Multiplication = " + multiply);
		return multiply;
		}
    public float Division(float N1, float N2) {
		
		float divide;
		divide = N1 / N2;
		
		System.out.println("Division = " + divide);
		return divide;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first, second ;
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter Two Numbers : ");
	    first = scanner.nextInt();
	    second = scanner.nextInt();
	    
	    Main calculator  = new Main();
	    
	    calculator.SUM(first, second);
        calculator.Subtract(first, second);
        calculator.Multiply(first, second);
        calculator.Division(first, second);

	}

}
