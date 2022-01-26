import java.util.Arrays;
import java.util.Scanner;

public class JA {
	public static void main (String[] args) {
		Q1();
		Q2();
		Q3();
		Q4();
		Q5();
		Q6();
		Q7();
		Q8();
		Q9();
		Q10();
		Q11();
		Q12();
		Q13(); 
		Q14();
	}
	
	// Q1.WAP to find weather the no entered by user is even or odd.
	public static void Q1() {
		System.out.println("Q1. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = Integer.parseInt(scan.nextLine());
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
	// Q.WAP to swap the values of 2 nos.(Take input from user)
	public static void Q2() {
		System.out.println("Q2. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.println("Enter Second Number: ");
		int b = Integer.parseInt(scan.nextLine());
		
		System.out.println("Old a = " + String.valueOf(a));
		System.out.println("Old b = " + String.valueOf(b));
		
		int t = a;
		a = b;
		b = t;
		
		System.out.println("New a = " + String.valueOf(a));
		System.out.println("New b = " + String.valueOf(b));
	}
	// Q.WAP to find the greatest between the 3 nos and display the output. (Take input from user)
	public static void Q3() {
		System.out.println("Q3. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.println("Enter Second Number: ");
		int b = Integer.parseInt(scan.nextLine());
		System.out.println("Enter Third Number: ");
		int c = Integer.parseInt(scan.nextLine());
		
		int largest = a;
		if (b > largest) {
			largest = b;
		}
		if (c > largest) {
			largest = c;
		}
		System.out.println("Largest Number: " + String.valueOf(largest));
	}
	// WAP to find weather the character entered by user is a vowel or not.(solve by using if..else and switch case)
	public static void Q4() {
		System.out.println("Q4. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Character: ");
		char ch = scan.nextLine().charAt(0);
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
			System.out.println("Vowel");
		} else {
			System.out.println("Not a Vowel");
		}
	}
	// Q.WAP to print even nos from 1-50 using while loop.
	public static void Q5() {
		System.out.println("Q5. ");
		int i = 2;
		while (i <= 50) {
			System.out.println(i);
			i = i + 2;
		}
	}
	// Q.WAP to print odd nos from 50-100 using do while loop.
	public static void Q6() {
		System.out.println("Q6. ");
		int i = 51;
		while (i <= 100) {
			System.out.println(i);
			i = i + 2;
		}
	}
	// Q.Given a number N, print sum of all even numbers from 1 to N.
	public static void Q7() {
		System.out.println("Q7. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int N = Integer.parseInt(scan.nextLine());
		int sum = 0;
		int i = 2;
		while (i <= N) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
	}
	//Q. WAP to print the following patterns  
	//a.for n=4
	//1
	//22
	//333
	//4444
	//
	//b.for n=4
	//4444
	//4444
	//4444
	//4444
	//
	//c.for n=5
	//    *
	//   **
	//  ***
	// ****
	//*****
	public static void Q8() {
		System.out.println("Q8. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(scan.nextLine());
		int i, j;
		
		// First Pattern
		for (i=1; i<=n; i++) {
			for (j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		// Second Pattern
		for (i=1; i<=n; i++) {
			for (j=1; j<=n; j++) {
				System.out.print(n);
			}
			System.out.println();
		}
		
		System.out.println();
		// Third Pattern
		for (i=1; i<=n; i++) {
			for (j=n-i; j>0; j--) {
				System.out.print(" ");
			}
			for (j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	// Q.Revers an Array.
	public static void Q9() {
		System.out.println("Q9. ");
		int a[]=new int[] {1,2,3,4,5};
		int i, t;
		int n = a.length;
		for (i = 0; i < n/2; i++) {
			t = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = t;
		}
		System.out.println(Arrays.toString(a));
	}
	// Q.Swap the nos in Array.
	public static void Q10() {
		System.out.println("Q10. ");
		int a[]=new int[] {1,2,3,4,5};
		int i, t;
		int n = a.length;
		for (i = 0; i < n/2; i++) {
			t = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = t;
		}
		System.out.println(Arrays.toString(a));
	}
	//	Q.WAP to calculate and display the factorial of a no entered by user.
	public static void Q11() {
		System.out.println("Q11. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(scan.nextLine());
		int i;
		int fact = 1;
		for (i=1; i<=n; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}
	//	Q.WAP to check weather the no entered by user is prime or not.
	public static void Q12() {
		System.out.println("Q12. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(scan.nextLine());
		if (checkPrime(n)) {
			System.out.println("Is Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
	//	Q.Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
	public static void Q13() {
		System.out.println("Q13. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(scan.nextLine());
		int i;
		for (i=2; i<=n; i++) {
			if (checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	//	Q.WAP to generate the reverse of a given number N. Print the corresponding reverse number.
	public static void Q14() {
		System.out.println("Q14. ");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = Integer.parseInt(scan.nextLine());
		
		int newNum = 0;
		while (n != 0) {
			newNum = 10*newNum + (n%10);
			n = n / 10;
		}
		System.out.println(newNum);
	}
	
	
	public static boolean checkPrime(int n) {
		int i;
		for (i=2; i< n/2; i++) {
			if (n%i == 0) {
				return (false);
			}
		}
		return (true);
	}
}



























