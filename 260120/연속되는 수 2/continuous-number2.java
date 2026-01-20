import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 1;
        int max = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n; i++){
            if(i == 0 || arr[i-1] != arr[i]){
                count = 1;
            } else{
                count++;
                max = Math.max(count,max);
            }
        }
        System.out.println(max);
    }
}
