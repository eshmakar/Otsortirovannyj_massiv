import java.util.Arrays;
public class SortedArray {
    static void sortirovka(int[] a) {
        Arrays.sort(a);
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = {25, 35, 45, 15, 13, -4};
        sortirovka(input);

    }
}