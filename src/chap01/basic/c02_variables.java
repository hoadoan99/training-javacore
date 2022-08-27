package chap01.basic;

import java.util.Scanner;

public class c02_variables {
 public static void main(String[] args) {
	 int firstNumber, secondNumber, result = 0;
	 String caculate;
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("First Number:");
	 firstNumber = sc.nextInt();
	 caculate = sc.nextLine();
	 
	 System.out.println("Second Number:");
	 secondNumber = sc.nextInt();
	 caculate = sc.nextLine();
	 
	 System.out.println("Caculate");
	 
	 caculate = sc.nextLine();
	 
	 sc.close();
	 
    System.out.println("First Number:" + firstNumber);
    System.out.println("Second Number:" + secondNumber);
    System.out.println("Caculate:" + caculate);
    
    switch (caculate) {
	case "+":
		result = firstNumber + secondNumber;
		break;
	case "-":
		result = firstNumber - secondNumber;
		break;
	case ".":
		result = firstNumber * secondNumber;
		break;
	case "/":
		result = firstNumber / secondNumber;
		break;
	default:
		break;
	}

    System.out.println("Result:" + result);
 }
}
