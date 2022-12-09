public class Main {
    public static void main(String[] args) {
        int[] array = {1, 8, 3, 3, 4, 4, 9, 12};

        System.out.println(max(array));


    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }

        }
        return array[0];
    }

    public static int min(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }
            }
        }
        return array[0];
    }
}