package Algoritm;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.io.*;

public class MaagilineSeitse {
    private static ArrayList<Integer> el = new ArrayList<Integer>();      //чисто для сохранения элементов которые уже были проверены
    public static void main (String[] args) {
        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};           //пример массива
        int element = 0;                                                                             //сохраняем элемент для вывода
        int count = 0;                                                                                 //сохоаняем колличество совпадений для вывода
        for (int i = 0; i < naide.length; i++) {                                                  //тут считаем элемены
            if (c_element(naide[i])) {
                for (int j = 0; j < naide.length; j ++) {
                    if (naide[i] == naide[j] && naide[i] == 7) {
                        count++;
                        element = naide[j];
                        el.add(naide[i]);
                    }
                }
            }
            if (count > 1){
                System.out.println("element = " + element + "; match count = " + count);
                ArrayList <Integer> arrays = new ArrayList<Integer>();
                for (int b = 0; b < count; b++)
                {
                    arrays.add(element);
                    arrays.add(element * 2);

                }
                double sum = 0;
                for (int d = 0; d < arrays.size(); d++)
                    sum = sum + arrays.get(d);
                    System.out.println("Average = " + sum / arrays.size());


            }
            count = 0;                                                                                    //тут сбрасываем счетчик

        }
    }
    private static boolean c_element (int arr_i) {               //тут бует проверка элемента, считали ли мы его?
        for (int k = 0; k < el.size(); k++) {
            if (arr_i == el.get(k)) return false;
        }
        return true;
    }
}