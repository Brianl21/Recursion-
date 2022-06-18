import java.util.Scanner;
//uncomment to run each
class Main {
  public static void main(String[] args) {
    // Question 1
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter first number");
    // int m = sc.nextInt();
    // System.out.println("Enter second number");
    // int n = sc.nextInt();
    // System.out.println("GCD is:" + GCD(m, n));
    // Question 2
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter word");
    // String word = sc.nextLine();
    // reverseDisplay(word);
    // System.out.println();
  }

  // Question 1
  public static int GCD(int m, int n) {
    if (n == 0) {
      return m;
    }
    return GCD(n, m % n);
  }

  // Question 2
  public static void reverseDisplay(String value) {
    reverseDisplay(value, value.length() - 1);
  }

  public static void reverseDisplay(String value, int high) {
    if (high >= 0) {
      System.out.print(value.charAt(high));
      reverseDisplay(value, high - 1);
    }
  }
}