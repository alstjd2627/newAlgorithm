import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(B < 11){
            System.out.println(-1);
            return;
        } else if(B == 11 && C < 11){
            System.out.println(-1);
            return;
        }
        long total1 = 11 + 11*60 + 10 * 24 * 60;
        long total2 = 0;
        
        total2 = C + B * 60 + (A-1) * 24 * 60;
       

        System.out.println(total2-total1);
    }
}