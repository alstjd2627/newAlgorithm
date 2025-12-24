import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int answer = 0;
        String[] arr = binary.split("");
        for(int i = 0 ; i < arr.length; i++){
            if(Integer.parseInt(arr[i])== 1){
                answer += Math.pow(2,arr.length-i-1);
            }
        }
        System.out.println(answer);
    }
}