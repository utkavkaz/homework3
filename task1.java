
// Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.ArrayList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> arr = new ArrayList<>();
        Random rd = new Random(0);
        for (int i = 0; i < n; i++)
            arr.add(rd.nextInt(10, 20));
        System.out.println(arr);

        for (int i = arr.size() - 1; i >= 0; i--) {
            int el = arr.get(i) % 2;
            if (el == 0)
                arr.remove(i);
        }
        System.out.println(arr);
    }
}
