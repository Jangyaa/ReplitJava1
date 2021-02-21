import java.util.Comparator;
import java.util.Random;

public class InsertionSort {

    public static boolean less(Object a, Object b, Comparator c) {
        return c.compare(a, b) < 0;
    }

    public static void exch(Object[] arr, int m, int n) {
        Object temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }

    public static void sort(Object[] a, Comparator c) {
        for(int i = 0; i < a.length; i++)
            for(int j = i; (j > 0 && less(a[j], a[j-1], c)); j--)
                exch(a, j, j-1);
    }

    public static void knuthShuffle(Object[] arr) {
        Random rd = new Random();
        for(int i = 0 ; i < arr.length; i++) { exch(arr, i, rd.nextInt(i+1)); }//Knuth Shuffle
    }
}