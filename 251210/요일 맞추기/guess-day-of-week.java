import java.util.*;

public class Main {
    static int[] days = new int[]{0,31,28,31,30,31,30,31,31,30,31,30,31};
    static String[] week = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int total1 = calDay(m1,d1);
        int total2 = calDay(m2,d2);
        int diff = (total2-total1) % 7;
        //System.out.println(diff);
        if(diff<0){
            System.out.println(week[7+diff]);
        }else{
        System.out.println(week[diff]);
        }

    }
    static public int calDay(int m, int d){
        int total=0;
        for(int i = 1 ; i < m; i++){
            total+= days[i];
        }
        total+=d;
        return total;
    }
}