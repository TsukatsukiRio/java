import java.util.Scanner;

public class DEMO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的体重：");
        double weight = sc.nextDouble();


        System.out.printf("请输入您的身高：");
        double height = sc.nextDouble();

        double bmi = weight /(height* height);
        System.out.println(bmi);
    }
}
