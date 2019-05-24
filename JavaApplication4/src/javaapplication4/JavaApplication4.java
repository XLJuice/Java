/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author 1710532
 */
public class JavaApplication4 {
 
    public static void main(String args[]) {
        int counter, num, item, array[], first, last;
 
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        num = input.nextInt();
        
        array = new int[num];
 
        System.out.println("Введите " + num + " чисел");
 
        for (counter = 0; counter < num; counter++)
            array[counter] = input.nextInt();
 
        Arrays.sort(array);
 
        System.out.println("Введите элемент для бинарного поиска: ");
        item = input.nextInt();
        first = 0;
        last = num - 1;
 
        // метод принимает начальный и последний индекс, а также число для поиска
        binarySearch(array, first, last, item);
    }
 
    // бинарный поиск
    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;
        int comparisonCount = 1;    // для подсчета количества сравнений
 
        // для начала найдем индекс среднего элемента массива
        position = (first + last) / 2;
 
        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            if (array[position] > item) {  // если число заданного для поиска
                last = position - 1; // уменьшаем позицию на 1.
            } else {
                first = position + 1;    // иначе увеличиваем на 1
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }
    }
 
}
    



