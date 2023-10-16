import java.util.Scanner;

public class fizzbuzz {
    public static void num(int number) {
        if (number%3 == 0 && number%5 == 0) {
                System.out.println("FizzBuzz");
            } else if(number%3 == 0) {
                System.out.println("Fizz");
            } else if (number%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = console.nextInt();
        

        for (int i = 1; i <= n; i++) {
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

        System.out.println("Start of recursion");
        System.out.println("Enter a number: ");
        n = console.nextInt();

        console.close();
        if (n >= 1) {
            if (n%3 == 0 && n%5 == 0) {
                System.out.println("FizzBuzz" + (n--));
                // n--;
                // return;
            } else if(n%3 == 0) {
                System.out.println("Fizz" + (n--));
                // n--;
                // return;
            } else if (n%5 == 0) {
                System.out.println("Buzz" + (n--));
                // n--;
                // return;
            } else {
                System.out.println(n + (n--));
                // n--;
                // return;
            }
        }
    }
}

