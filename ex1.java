import java.io.IOException;
import java.util.Scanner;

// https://judge.beecrowd.com/pt/problems/view/2006?origem=1
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        
        //variaveis
        int t,a,b,c,d,e, quantidade = 0;

        Scanner scanner = new Scanner(System.in);

        t = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
      
      if (a == t) {
        quantidade ++;
      }
      if (b == t) {
        quantidade ++;
      }
      if (c == t) {
        quantidade ++;
      }
      if (d == t) {
        quantidade ++;
      }
      if (e == t) {
        quantidade ++;
      }

      System.out.println(quantidade);

    }
}