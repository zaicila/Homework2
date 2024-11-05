import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // tests LucasNum class
        System.out.println("Enter n for Lucas Number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.print(LucasNum.lucasNum(i) + " ");
        }
    }
}