import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[2001];
        int current = 1000;
        for(int k = 0 ; k < N; k++){
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken());
                String dir = st.nextToken();
                if(dir.equals("R")){
                    for(int i = 0 ; i < num; i++){
                        arr[current]++;
                        current++;
                    }
                } else{
                    for(int i = 0 ; i < num; i++){
                        current--;
                        arr[current]++;
                    }
                }
        }
        int answer= 0;
        for(int i = 0 ; i < 2001;i++){
            if(arr[i] >= 2){
                answer++;
            }
        }
        System.out.println(answer);




    }
}