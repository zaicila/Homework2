import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // tests LucasNum class
//        System.out.println("Enter n for Lucas Number");
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//
//        for (int i = 0; i <= m; i++) {
//            System.out.print(LucasNum.lucasNum(i) + " ");
//        }

        System.out.println("Print 40 Lucas num or 40 Alicia num");
        System.out.println("Type 'lucas' or 'alicia'");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.equals("lucas")) {
            int maxN = 40; // calculate 40 lucas numbers

            System.out.printf("%-5s %-15s %-15s %-20s %-20s%n", "n", "L(n)", "L(n+1)/L(n)", "Time (ms)", "Time Ratio");

            long prevTime = 0;
            int prevLucas = 0;

            for (int n = 0; n <= maxN; n++) {
                // Measure time taken to compute L(n)
                long startTime = System.nanoTime();
                int currentLucas = LucasNum.lucasNum(n);
                long endTime = System.nanoTime();
                long timeTaken = (endTime - startTime) / 1_000_000; // Convert to milliseconds

                // Calculate the ratios
                double lucasRatio = n > 0 ? (double) currentLucas / prevLucas : 0;
                double timeRatio = n > 1 ? (double) timeTaken / prevTime : 0;

                // Display results for each n
                System.out.printf("%-5d %-15d %-15.5f %-20d %-20.5f%n", n, currentLucas, lucasRatio, timeTaken, timeRatio);

                // Update previous values
                prevTime = timeTaken;
                prevLucas = currentLucas;
            }
        }

        if(input.equals("alicia")) {
            // print alicia's numbers
            int aliciaMaxN = 40; // calculate 40 alicia's numbers

            System.out.printf("%-5s %-15s %-15s %-20s %-20s%n", "n", "A(n)", "A(n+1)/A(n)", "Time (ms)", "Time Ratio");

            long aliciaPrevTime = 0;
            int prevAlicia = 0;

            for (int n = 0; n <= aliciaMaxN; n++) {
                // Measure time taken to compute L(n)
                long startTime = System.nanoTime();
                int currentAlicia = LucasNum.aliciaNum(n);
                long endTime = System.nanoTime();
                long timeTaken = (endTime - startTime) / 1_000_000; // Convert to milliseconds

                // Calculate the ratios
                double aliciaRatio = n > 0 ? (double) currentAlicia / prevAlicia : 0;
                double aliciaTimeRatio = n > 1 ? (double) timeTaken / aliciaPrevTime : 0;

                // Display results for each n
                System.out.printf("%-5d %-15d %-15.5f %-20d %-20.5f%n", n, currentAlicia, aliciaRatio, timeTaken, aliciaTimeRatio);

                // Update previous values
                aliciaPrevTime = timeTaken;
                prevAlicia = currentAlicia;
            }
        }

        else {
            System.out.println("Invalid input, rerun code to retry");
        }
    }
}