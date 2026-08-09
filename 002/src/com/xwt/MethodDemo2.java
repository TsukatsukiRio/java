import java.util.Random;
//随机数
public class MethodDemo2 {
    public static void main(String[] args) {
//        生成随机数组
        int[]arr = new int[10];
//        生成随机数
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            int num = r.nextInt(100) + 1;
//            对num进行判断，存在---不存 不存在 --- 存入
            boolean flag = contains(num,arr);
            if(!flag) {
                arr[i] = num;
                i++;
            }
        }
//        3.遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
//    定义一个方法，判断num在数组中是否存在
    public static boolean contains(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}