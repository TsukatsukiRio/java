import java.util.Random;

public class text2 {
//   随机打乱数
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
//            拿着索引的i的元素，跟随机索引的数据进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
