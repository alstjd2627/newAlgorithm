import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] penalizedPerson = new int[m];
        int num;
        for (int i = 0; i < m; i++) {
            num = sc.nextInt();
            penalizedPerson[num]++;
            if(penalizedPerson[num] >= k){
                System.out.println(num);
                return;
            }
        }
        System.out.println(-1);
        
    }
}