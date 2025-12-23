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
        for(int i = m1+1; i < m2; i++){
            total += days[i];
        }
        total += days[m1]-d1;
        total += d2;
        switch(A){
            case "Tue":
                total-=1;
                break;
            case "Wed":
                total-=2;
                break;
            case "Thu":
                total-=3;
                break;
            case "Fri":
                total-=4;
                break;
            case "Sat":
                total-=5;
                break;
            case "Sun":
                total-=6;
                break;
        }
        System.out.println(total/7+1);
    }
}