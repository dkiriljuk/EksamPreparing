package Algoritm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};
        int[] kraadikokku = new int[kraadid2.length + kraadid1.length];
        System.arraycopy( kraadid1, 0, kraadikokku, 0, kraadid1.length);
        System.arraycopy( kraadid2, 0, kraadikokku, kraadid1.length, kraadid2.length );
        System.out.println(Arrays.toString(kraadikokku));

        int negative = 0;
        long sum = 0;
        int positive = 0;
        for(int i : kraadikokku) {
            if(i < 0) negative++;
            if(i > 0) {
                positive++;
                try {
                    sum = kraadikokku[i];
                    sum += sum;
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Count of negative: " + negative);
        System.out.println("Count of positive: " + positive);
        System.out.println("Сумма положительных элементов: " + sum);

    }
}
