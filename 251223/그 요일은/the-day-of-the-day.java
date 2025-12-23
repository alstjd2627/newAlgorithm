import java.util.Scanner;

public class Main {
    static int[] days = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        
        int total = 0;
        for(int i = m1; i <= m2; i++){
            total += days[i];
        }
        total += d1;
        total += d2;
        System.out.println(total%7);
        
    }
}