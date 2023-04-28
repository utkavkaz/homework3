
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int n = 10;
        ArrayList<Integer> arr = new ArrayList<>();
        Random rd = new Random(0);
        for (int i = 0; i < n; i++)
            arr.add(rd.nextInt(1, 10));
        System.out.println(arr);
        mini(arr);
    }

    public static void mini(ArrayList<Integer> arr) {
        int min = arr.get(0);
        int max = arr.get(0);
        int med = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (min > arr.get(i)) {
                min = arr.get(i);
            }
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
            med += arr.get(i);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(med / arr.size());
    }
}