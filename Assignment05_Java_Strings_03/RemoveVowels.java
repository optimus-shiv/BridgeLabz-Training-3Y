import java.util.Scanner;
public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = str.replaceAll("[AEIOUaeiou]", "");
        System.out.println("String without vowels: " + result);
    }
}