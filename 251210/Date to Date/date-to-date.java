import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int[] month = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int total1 = 0;
        for(int i = 0; i < m2; i++){
            total1 += month[i];
        }
        total1 += d2;

        int total2 = 0;
        for(int i = 0 ; i < m1; i++){
            total2 += month[i];
        }
        total2+=d1;
        System.out.println(total1-total2);



    }
}