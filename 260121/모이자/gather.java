import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int answer = Integer.MAX_VALUE;
        int total;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < n; i++){
            total = 0;
            for(int j = 0; j < i; j++){
                total += a[j] * (i - j);
            }
            for(int k = i+1; k < n; k++){
                total += a[k] * (k - i);
            }
            answer = Math.min(answer,total);
        }
        System.out.println(answer);
    }
}