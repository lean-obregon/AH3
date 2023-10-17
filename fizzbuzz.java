import java.util.Scanner;

public class fizzbuzz {
    public static void fizzbuzz(int number) {
        for (int i = 1; i <= number; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i%3 == 0) {
                System.out.println("Fizz");
            } else if (i%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void fizzbuzzRecursion(int currentNum, int number) {
        if (currentNum > number) {
            return;
        }

        if (currentNum%3 == 0 && currentNum%5 == 0) {
                System.out.println("FizzBuzz");
            } else if(currentNum%3 == 0) {
                System.out.println("Fizz");
            } else if (currentNum%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(currentNum);
            }
        fizzbuzzRecursion(currentNum + 1, number);
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = console.nextInt();
        fizzbuzz(n);
        
        System.out.println("Start of recursion");
        System.out.println("Enter a number: ");
        n = console.nextInt();
        
        fizzbuzzRecursion(1, n);

        console.close();
    }
}