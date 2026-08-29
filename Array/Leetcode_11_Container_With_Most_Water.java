public class Leetcode_11_Container_With_Most_Water {
    public static void main(String[] args){
        int [] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(Most_quantity_Water(nums));

    }
    public static int Most_quantity_Water(int [] height){
        
        int n = height.length;
        int left =0;
        int right = n-1;
        int Area =0;
        int water_area=0;

        while(left<n){
            if(height[left]<=height[right]){
                water_area = height[left]*(right-left);
                Area = Math.max(water_area, Area);
                left++;

            }
            else{
                
                water_area = height[right]*(right-left);
                right--;
                Area = Math.max(water_area, Area);
            }
            // else{
            //     water_area = height[left]*(right-left);
            //     Area = Math.max(water_area, Area);
            //     left++;
            //     right--;

            // }

        }
        return Area;
    }
}

