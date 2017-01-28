package com.company;

import java.util.ArrayList;

public class IntMatchesArray {
    private static ArrayList<Integer> el = new ArrayList<Integer>();      //чисто для сохранения элементов которые уже были проверены
    public static void main (String[] args) {
        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7};           //пример массива
        int element = 0;                                                                             //сохраняем элемент для вывода
        int count = 0;                                                                                 //сохоаняем колличество совпадений для вывода
        for (int i = 0; i < naide.length; i++) {                                                  //тут считаем элемены
            if (c_element(naide[i])) {
                for (int j = 0; j < naide.length; j ++) {
                    if (naide[i] == naide[j] && naide[i] != naide[3]) {
                        count++;
                        element = naide[j];
                        el.add(naide[i]);
                    }
                }
            }
            if (count > 1) System.out.println("element = " + element + "; match count = " + count);  //если совпадений больше 1 то выводим на экран
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