import java.util.Random;

public class text3 {
    // 判断数组中是否已存在某个数
    public static boolean contains(int[] arr, int count, int num) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // 获取10个0-100之间的随机数并存入数组，要求数据唯一
        int[] arr = new int[10];
        Random r = new Random();
        int count = 0; // 已存入的不重复数据的个数

        while (count < 10) {
            int num = r.nextInt(101); // 0-100的随机数
            // 判断数组中是否已存在该数
            if (!contains(arr, count, num)) {
                arr[count] = num;
                count++;
            }
        }

        // 打印结果
        System.out.println("生成的10个不重复随机数：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
