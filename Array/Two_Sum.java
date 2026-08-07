
public class Two_Sum {

    public static void main(String[] args) {
        int[] arr = {12, 2, 34, 35, 64, 74, 90, 20};
        int[] ans = Better_two_sum(arr, 110);
        System.out.println("the Array is " + "[" + ans[0] + "," + ans[1] + "]");

    }

    public static int[] twoSum(int[] arr, int target) {
        // int [] ansArray = new int [2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    return new int[]{i, j};

                }
            }
        }
        return new int[]{-1, -1};

    }
    // It is working but not suitable for Leetcode because in leetcode the quetion wants the index of actual array but here i sort the original array at first
    public static int[] Better_two_sum(int[] arr, int target) {
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        int l = 0;
        int r = arr.length-1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) {
                return new int[]{arr[l], arr[r]};
            } else if (sum > target) {
                r--;
            } else {
                l = l + 1;
            }
        }

        return new int[]{-1, -1};

    }

    public static void quickSort(int[] arr, int low, int high) {
        
        if (low >= high) {
            return;
        }
        int p = Partition(arr, low, high);
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);

    }

    public static int Partition(int[] arr, int low, int high) {
        int i = low + 1;
        int j = high;
        int pivot = arr[low];
        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;

            }
            while (arr[j] > pivot) {
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

}
