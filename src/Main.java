import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            int[]a = new int[5];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 5 values:");
            a[0] = scanner.nextInt();
            a[1] = scanner.nextInt();
            a[2] = scanner.nextInt();
            a[3] = scanner.nextInt();
            a[4] = scanner.nextInt();
            int sum;
            sum =  (a[0] + a[1] + a[2] + a[3] + a[4]);
            System.out.println("sum : " + sum);

        }
    }

