import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
 static    Scanner scanner = new Scanner(System.in);

    static void sortirovka(int[] a) {
        Arrays.sort(a);
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int a5 = scanner.nextInt();


        int[] input = {a1, a2, a3, a4, a5};
        sortirovka(input);

    }
}