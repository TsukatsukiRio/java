import java.util.Scanner;

public class text1 {
    public static void main(String[] args) {
        int[] arr={33,5,22,44,55,33};
//        键盘入录一个数据
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number=sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(number==arr[i]){
                System.out.println(i);
                break;
            }
        }

    }
}
