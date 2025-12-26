import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] num = new int[100];
        int count = 0;
        while(true){
            if(n < b){
                num[count++] = n;
                break;
            }
            num[count++] = n % b;
            n = n / b;
        }
        for(int i = count-1; i >= 0; i--){
            System.out.print(num[i]);
        }
    }
}