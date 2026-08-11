import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
//Union of Sorted array
public class union_of_two_array {
    public static void main(String[] args) {
        int [] arr1 ={1,2,5,6,55};
        int [] arr2 ={1,2,5,9};
        long start = System.nanoTime();
        union_of_two_array obj = new union_of_two_array();
        List<Integer> result = obj.findUnion(arr1, arr2);
        
        for(int val :result){
            System.out.print(val +" ");
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        long start1 = System.nanoTime();
        
        List<Integer> result_optimal = obj.union_array_two_pointer_approach(arr1, arr2);
        
        for(int value: result_optimal){
            System.out.print(value+" ");
        }
        long end1 = System.nanoTime();
        System.out.println(end1-start1);
        
    }
    public List<Integer> findUnion(int[] arr1, int[] arr2){
        HashSet<Integer> st = new HashSet<>();
        for(int num : arr1){
            st.add(num);
        }
        for(int num : arr2){
            st.add(num);
        }

        return new ArrayList<>(st);
    }
     public int[] unionArray(int[] nums1, int[] nums2) {
        HashSet<Integer> st = new HashSet<>();

        for(int num : nums1){
            st.add(num);
        }

        for(int num : nums2){
            st.add(num);
        }
       // Convert HashSet to int[]
        int[] result = new int[st.size()];
        int index = 0;

        for (int num : st) {
            result[index++] = num;
        }

        return result;
    }

    public static List<Integer> union_array_two_pointer_approach(int[] nums1, int[] nums2) {

    int n1 = nums1.length;
    int n2 = nums2.length;

    int i = 0, j = 0;

    List<Integer> union = new ArrayList<>();

    while (i < n1 && j < n2) {

        if (nums1[i] < nums2[j]) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums1[i])
                union.add(nums1[i]);
            i++;
        }
        else if (nums2[j] < nums1[i]) {
            if (union.isEmpty() || union.get(union.size() - 1) != nums2[j])
                union.add(nums2[j]);
            j++;
        }
        else {
            if (union.isEmpty() || union.get(union.size() - 1) != nums1[i])
                union.add(nums1[i]);
            i++;
            j++;
        }
    }

    while (i < n1) {
        if (union.isEmpty() || union.get(union.size() - 1) != nums1[i])
            union.add(nums1[i]);
        i++;
    }

    while (j < n2) {
        if (union.isEmpty() || union.get(union.size() - 1) != nums2[j])
            union.add(nums2[j]);
        j++;
    }

    return union;
}
}