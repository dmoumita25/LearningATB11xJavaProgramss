package ex_11_Arrays;

public class Lab064_IQ_Array_Max_Min {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max_output = giveme_max(array);

        System.out.println(max_output);
    }

    private static int giveme_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) ;
            {
                max = array[i];
            }
        }
        return max;
    }
}

