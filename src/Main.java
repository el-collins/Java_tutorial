import java.util.Scanner;

public class Main {
    public static long findFactorial(int n) {
        if (n <= 0 || n == 1) {
            return 1;
        }
        else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            return factorial;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

            long result =  findFactorial(n);
        System.out.println(result);


        }
    }
