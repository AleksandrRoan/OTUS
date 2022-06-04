package algorithm;

import java.util.Arrays;
import java.util.Random;

public class Algorithm {
    public static void main(String[] args) {

        int[] array = Algorithm.initializationArray();
        int[] array1 = array.clone();
        long start = System.currentTimeMillis();
        Arrays.sort(array1);
        long finish = System.currentTimeMillis();
        long start1 = System.currentTimeMillis();
        String sortedAlgorithm = Algorithm.sort(array);
        long finish1 = System.currentTimeMillis();

        System.out.println(Arrays.toString(array1));
        System.out.println("Время выполнения сортировки методом Arrays.sort(): " + (finish - start) + " ms");
        System.out.println(Arrays.toString(array));
        System.out.println("Время выполнения сортировки моим методом: " + (finish1 - start1) + " ms");
    }

    public static int[] initializationArray() {
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = new Random().nextInt(10000);
        }
        return array;
    }

    public static String sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return Arrays.toString(array);
    }
}
