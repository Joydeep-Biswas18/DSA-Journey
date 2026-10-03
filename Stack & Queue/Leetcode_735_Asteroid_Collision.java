
import java.util.*;

public class Leetcode_735_Asteroid_Collision {
    public static void main(String[] args) {
        int [] nums ={4,7,1,1,2,-3,-7,17,15,-18};
        System.out.println(Arrays.toString(asteroidCollision(nums)));
        

    }

    public static int[] asteroidCollision(int[] asteroids) {
         ArrayList<Integer> st = new ArrayList<>();

        for (int asteroid : asteroids) {

            if (asteroid > 0) {
                st.add(asteroid);
            } 
            else {

                while (!st.isEmpty() 
                        && st.get(st.size() - 1) > 0
                        && st.get(st.size() - 1) < Math.abs(asteroid)) {

                    st.remove(st.size() - 1);
                }

                if (!st.isEmpty() 
                        && st.get(st.size() - 1) == Math.abs(asteroid)) {

                    st.remove(st.size() - 1);
                } 
                else if (st.isEmpty() 
                        || st.get(st.size() - 1) < 0) {

                    st.add(asteroid);
                }
            }
        }

        int[] answer = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            answer[i] = st.get(i);
        }

        return answer;
    }

}
