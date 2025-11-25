import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int[] numss = new int[n];

        for(int i = 0 ; i < n; i++){
            numss[i] = nums[i] + nums[2*n-1-i];
        }

        Arrays.sort(numss);
        System.out.println(numss[n-1]);
    }
}
