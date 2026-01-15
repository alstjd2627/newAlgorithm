import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int MAX_SIZE = 100000;
        int[] arr = new int[MAX_SIZE*2+1];
        int current = MAX_SIZE;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            
            for(int j = 0; j < x; j++){
                if(d=='L'){
                    arr[current--] = 1;
                } else{
                    arr[current++] = 2;
                }
            }
            if(d=='L') current++;
            else current--;
        }
        int white = 0;
        int black = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 1) white++;
            else if(arr[i] ==2) black++;
        }
        System.out.println(white + " " + black);
    
    }
}