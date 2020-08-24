package org.pg4200.ex01;

public class ArrayUtilsImp implements ArrayUtils {

    @Override
    public int min(int[] array) throws IllegalArgumentException {
        CheckArray(array);

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int max(int[] array) throws IllegalArgumentException {
        CheckArray(array);

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    @Override
    public double mean(int[] array) throws IllegalArgumentException {
        CheckArray(array);

        int sum = 0 ;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        sum = sum/array.length;
        return sum;
    }

    private void CheckArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Invalid empty array as input");
        }
    }

}
