import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        StringBuilder sb = new StringBuilder();
        int total = 0;
        for(int i = 0 ; i < binary.length(); i++){
            total = total * 2 + (binary.charAt(i) - '0');
        }
        total *= 17;
        while(true){
            if(total < 2){
                sb.append(total);
                break;
            }
            sb.append(total%2);
            total = total/2;
        }
        System.out.println(sb.reverse());
    }
}