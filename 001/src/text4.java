import java.util.Random;
//随机数
public class text4 {
    public static void main(String[] args) {
      int[]arr = new int[10];
      Random r = new Random();
        for (int i = 0; i < arr.length;) {
            int num = r.nextInt(101);
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                arr[i] = num;
                i++;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
