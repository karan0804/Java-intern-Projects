import java.util.Scanner;
public class HelloWorld {
 public static void main(String[] args) {
    System.out.println("hello world");

    Scanner scanner = new Scanner (System.in);
    System.out.println("a = ");
    int a = scanner.nextInt();
    System.out.println("b = ");
    int b = scanner.nextInt();
    System.out.println("addition of two numbers = " + (a + b));
    System.out.println("difference of two numbers = " + (a - b));
    System.out.println("multiplication of two numbers = " + (a * b));
    System.out.println("division of two numbers = " + (a / b));
    System.out.println("module of two numbers = " + (a % b));
    scanner.close();
 }
}
