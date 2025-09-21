package com.task2;
/*Your task is to create a Java program that prints prime numbers and even numbers between 1 and 100 in a multithreaded manner. The rule is that after printing one prime number, the program should print one even number, and this pattern should continue until reaching 100.

Instructions:

NumberPrinter Class:

Create a NumberPrinter class with the following methods:
printPrime(): A synchronized method that prints prime numbers and notifies the waiting thread to print even numbers.
printEven(): A synchronized method that prints even numbers and notifies the waiting thread to print prime numbers.
isPrime(int num): A helper method that checks if a given number is prime.

printPrime Method:
Inside the printPrime method, use a loop to print prime numbers. If a number is prime, print it, increment the current number, and notify the waiting thread. If the number is not prime, wait for the even thread to notify.

printEven Method:
Inside the printEven method, use a loop to print even numbers. If a number is even, print it, increment the current number, and notify the waiting thread. If the number is prime, wait for the prime thread to notify.

isPrime Method:
Implement the isPrime method to check if a given number is prime.


Multithreaded Execution:
In the MultithreadedNumberPrinter class (main), create an instance of NumberPrinter.
Create two threads: one for printing prime numbers and the other for printing even numbers.
Start both threads.

Output:
Run the program and observe the interleaved printing of prime and even numbers between 1 and 100, following the specified rule.

Notes:

Utilize the wait and notify mechanism for synchronization between prime and even threads.
The isPrime method is a simple implementation to check if a number is prime. Adjustments can be made based on specific prime number generation requirements.
Document your code with comments to explain the purpose of each method and the overall flow.
Implement the described program following the provided instructions. The output should demonstrate the interleaved printing of prime and even numbers, satisfying the specified rule.

Sample Output :
---------------------
Prime: 2
Even: 2
Prime: 3
Even: 4
Prime: 5
Even: 6
Prime: 7
Even: 8
Prime: 11
Even: 10
Prime: 13
Even: 12
Prime: 17
Even: 14
Prime: 19
Even: 16
Prime: 23
Even: 18 ..........................................*/
public class MultithreadedNumberPrinter {

	public static void main(String[] args) 
	{
		NumberPrinter numberPrinter = new NumberPrinter();

        // Create a thread for printing prime numbers
        Thread primeThread = new Thread(() -> numberPrinter.printPrime());

        // Create a thread for printing even numbers
        Thread evenThread = new Thread(() -> numberPrinter.printEven());

        // Start both threads
        primeThread.start();
        evenThread.start();

	}

}
