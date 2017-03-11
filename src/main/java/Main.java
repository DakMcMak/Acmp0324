import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int polindrom = scanner.nextInt();
        int a , b , c ,d;
        a = polindrom/1000;
        b = (polindrom/100) % 10;
        c = (polindrom/10) % 10;
        d = polindrom%10;
        if( a == d && b == c) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
