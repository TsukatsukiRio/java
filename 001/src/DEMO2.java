import java.util.Scanner;

public class DEMO2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("请自动输入一个三位数");
        int number = sc.nextInt();
        System.out.println(number);
        int ge = number % 10;
        System.out.println(ge);

        int shi = number / 10 % 10;
        System.out.println(shi);

        int bai = number / 100 % 10;
        System.out.println(bai);
    }
}
