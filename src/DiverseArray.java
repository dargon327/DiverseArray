import java.util.ArrayList;
import java.util.Scanner;

public class DiverseArray {
    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length;i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int[] rowSums(int[][] arr) {
        int[] sum = new int[arr.length];
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length;j++) {
                sum[i] += arr[i][j];
            }
        }
        return sum;
    }
    public static boolean isDiverse(int[][] arr) {
        int[] sum = rowSums(arr);
        for (int i = 0; i < sum.length;i++) {
            for (int j = i+1; j < sum.length;j++) {
                if (sum[i] == sum[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

