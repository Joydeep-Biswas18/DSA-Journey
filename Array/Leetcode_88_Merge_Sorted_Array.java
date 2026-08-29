import java.util.*; 
public class Leetcode_88_Merge_Sorted_Array {

    public static void main(String[] args) {
        int [] num1 ={1,3,5,7,9};
        int num2[] = {0,2,4,6,8};
        System.out.println(Arrays.toString(merge_sorted_Array(num1, num2)));

    }

    public static int[] merge_sorted_Array(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] final_arr = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                final_arr[k] = arr1[i];

                i++;
            } else {
                final_arr[k] = arr2[j];
                j++;
            }
            k++;

        }
        // remaining Part if th Length of two sorted array is not Equal
        // if arr2 has more Element
        while (j < m) {
            final_arr[k] = arr2[j];
            j++;
            k++;

        }
        // if arr1 has more element
        while (i < n) {
            final_arr[k] = arr1[i];
            i++;
            k++;


        }
        return final_arr;

    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] merge = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both arrays
        while (i < m && j < n) {

            if (nums1[i] <= nums2[j]) {
                merge[k] = nums1[i];
                i++;
            } else {
                merge[k] = nums2[j];
                j++;
            }

            k++;
        }

        // Remaining elements of nums1
        while (i < m) {
            merge[k] = nums1[i];
            i++;
            k++;
        }

        // Remaining elements of nums2
        while (j < n) {
            merge[k] = nums2[j];
            j++;
            k++;
        }

        // Copy merged array back to nums1 because in Leetcode 
        for (int x = 0; x < m + n; x++) {
            nums1[x] = merge[x];
        }
    }
}
class Most_optimal_solution{
    public static void merge(int []nums1,int []nums2){
        int m = nums1.length;
        int n = nums2.length;

        int i =n-1;
        int j =0;
        while(i>=0 && j<n){
            if(nums1[i]> nums2[j]){
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;

                i--;
                j++;
            }
            else{
                break;

            }
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);

    }

}
