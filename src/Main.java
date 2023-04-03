public class Main {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;

        int sum1 = a + b;
        int sum2 = c + d;
        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println(sum1 > sum2 ? "true" : "false");

        System.out.println((++sum1) > (sum2 -2) ? "true" : "false");

        System.out.println((sum1%2 == 0 || sum2%2 == 0) ^ (sum1%2 == 0 && sum2%2 == 0) ? "true" : "false");

    }
}