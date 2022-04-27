import java.lang.reflect.Array;

public class ThirdTask {
    public static void main(String[] args) {
        ThirdTask task = new ThirdTask();
        String[] array = {"test"};
        System.out.println("До добавления");
        System.out.println(task.arrayToString(array));
        array = task.addValue(array, "НОВОЕ ЗНАЧЕНИЕ");

        System.out.println("После добавления");
        System.out.println(task.arrayToString(array));
    }

    public String arrayToString(String[] arrays) {
        StringBuilder arraysToString = new StringBuilder();
        arraysToString.append('{');
        for (int i = 0; i < arrays.length; i++) {
            if (i == arrays.length - 1) {
                arraysToString.append(arrays[i]).append('}');
            } else {
                arraysToString.append(arrays[i]).append(", ");
            }
        }
        return arraysToString.toString();
    }

    public String[] addValue(String[] arrays, String newValue) {
        String[] array = new String[arrays.length + 1];
        System.arraycopy(arrays, 0, array, 0, arrays.length);
        Array.set(array, arrays.length, newValue);
        return array;
    }
}
