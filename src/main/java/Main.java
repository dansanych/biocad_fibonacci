import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;

        if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите номер члена последовательности:");
            n = scanner.nextInt();

            int[] fibRow = new int[n];

            fibRow[0] = 0;
            fibRow[1] = 1;

            getFibonacci(fibRow);

            System.out.println(Arrays.toString(fibRow));
        } else if (args.length == 1) {
            try {
                int nString = Integer.parseInt(args[0]);

                int[] fibRow = new int[nString];

                fibRow[0] = 0;
                fibRow[1] = 1;

                getFibonacci(fibRow);

                System.out.println(Arrays.toString(fibRow));
            } catch (NumberFormatException e) {
                System.out.println("incorrect number");
            }
        } else {
            System.out.println("incorrect count of parameters");
        }
    }

    public static void getFibonacci(int[] fibRow) {
        for (int i = 2; i < fibRow.length; ++i) {
            fibRow[i] = fibRow[i - 1] + fibRow[i - 2];
        }
    }

}
