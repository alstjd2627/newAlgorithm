import java.util.*;
import java.io.*;

class Node {
    String secretCode;
    String meetingPoint;
    String time;

    public Node(String secretCode, String meetingPoint, String time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String sCode = st.nextToken();
        String mPoint = st.nextToken();
        String time = st.nextToken(); 
        
        Node node = new Node(sCode, mPoint, time);
        
        System.out.println("secret code : " + node.secretCode);
        System.out.println("meeting point : " + node.meetingPoint);
        System.out.println("time : " + node.time);
    }
}
