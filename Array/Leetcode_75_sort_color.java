
import java.util.Arrays;

public class Leetcode_75_sort_color {

    public static void main(String[] args) {

        long s1 = System.nanoTime();
        int[] nums = {2, 0, 2, 1, 1, 0};
        System.out.println(paartition(nums, 0, nums.length - 1));
        quicksort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        long e1 = System.nanoTime();
        System.out.println(e1 - s1);

        long s2 = System.nanoTime();
        System.out.println(Arrays.toString(count_color(nums)));
        long e2 = System.nanoTime();
        System.out.println(e2 - s2);

        long s3 = System.nanoTime();
        Colar_Sort_optimal(nums);
        System.out.println(Arrays.toString(nums));
        long e3 = System.nanoTime();
        System.out.println(e3 - s3);

    }

    //Brute Force Approach
    public static int paartition(int[] arr, int low, int high) {
        int i = low + 1;
        int j = high;
        int pivot = arr[low];
        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int p = paartition(arr, low, high);
            quicksort(arr, 0, p - 1);
            quicksort(arr, p + 1, high);
        }

    }

    //better Approach
    public static int[] count_color(int[] arr) {
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count_0++;
            } else if (arr[i] == 1) {
                count_0++;
            } else {
                count_0++;
            }
        }
        for (int i = 0; i < count_0; i++) {
            arr[1] = 0;
        }
        for (int i = count_0; i < count_0 + count_1; i++) {
            arr[i] = 1;
        }
        for (int i = count_0 + count_1; i < count_2; i++) {
            arr[i] = 2;
        }

        return arr;
    }

    //Most Optimal Approach
    public static void Colar_Sort_optimal(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }

    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
