
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String t = sc.next();
    String[] words = new String[n];
    List<String> answer = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      words[i] = sc.next();
      boolean isSame = true;
      char[] arr = words[i].toCharArray();
      for (int j = 0; j < t.length(); j++) {
        if (arr[j] != t.charAt(j)) {
          isSame = false;
          break;
        }
      }
      if (isSame) {
        answer.add(words[i]);
      }
    }
    Collections.sort(answer);
    System.out.println(answer.get(k - 1));
  }
}