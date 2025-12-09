import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
    int x,y,index;
    public Node(int x, int y, int index){
        this.x = x;
        this.y = y;
        this.index = index;
    }
    @Override
    public int compareTo(Node node){
        int distance1 = Math.abs(this.x) + Math.abs(this.y);
        int distance2 = Math.abs(node.x) + Math.abs(node.y);
        if(distance1 == distance2){
            return this.index - node.index;
        }
        return distance1-distance2;
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        int x,y;
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            nodes[i] = new Node(x,y,i+1);
        }
        Arrays.sort(nodes);
        for (int i = 0; i < n; i++) {
            System.out.println(nodes[i].index);
        }
       
    }
}