import java.util.Scanner;


class Node{
    String id;
    int age;

    Node(String id, int age){
        this.id = id;
        this.age =age;
    }

    void printNode(){
        System.out.println("user " + this.id + " lv " + this.age);
    }
}




public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        Node node1 = new Node("codetree",10);
        Node node2 = new Node(id,level);
        node1.printNode();
        node2.printNode();
    }
}