import java.util.Scanner;

public class SumNatural {
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum: " + sumOfNaturalNumbers(sc.nextInt()));
    }
}