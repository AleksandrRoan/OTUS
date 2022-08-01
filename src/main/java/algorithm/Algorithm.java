package algorithm;

import java.util.Arrays;
import java.util.Random;

public class Algorithm {
    public static void main(String[] args) {

        int[] array = Algorithm.initializationArray();
        int[] array1 = array.clone();
        int[] array2 = array.clone();
        long start = System.currentTimeMillis();
        Arrays.sort(array1);
        long finish = System.currentTimeMillis();
        long start1 = System.currentTimeMillis();
        Algorithm.sort(array);
        long finish1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        Algorithm.sortBubble(array2);
        long finish2 = System.currentTimeMillis();

        System.out.println(Arrays.toString(array1));
        System.out.println("Время выполнения сортировки методом Arrays.sort(): " + (finish - start) + " ms");
        System.out.println(Arrays.toString(array));
        System.out.println("Время выполнения сортировки моим методом: " + (finish1 - start1) + " ms");
        System.out.println(Arrays.toString(array2));
        System.out.println("Время выполнения сортировки моим методом bubble: " + (finish2 - start2) + " ms");
    }

    public static int[] initializationArray() {
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = new Random().nextInt(10000);
        }
        return array;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void sortBubble(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}
