/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
*
* @author 1710532
*/
public class lab3 {

public static void main(String[] args) {
Random rnd = new Random();
int b[] = new int[5];
int neg = 0;
for (int i = 0; i < b.length; ++i) {
b[i] = rnd.nextInt(101) - 50;
if (b[i] < 0) {
++neg;
}
}
System.out.println(Arrays.toString(b));
System.out.println("Кількість від'ємних значень у массиві: " + neg);
Scanner input = new Scanner(System.in);
int N;
System.out.println("Введіть розмірність массиву");
N = input.nextInt();
int Max = 0, Min = 0;
int a[][] = new int[N][N];
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[i].length; j++) {
a[i][j] = rnd.nextInt(101) - 50;;
}
}

for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[i].length; j++) {
if (Min > a[i][j]) {
Min = a[i][j];
}
if (Max < a[i][j]) {
Max = a[i][j];
}
System.out.print(a[i][j] + "\t");
}
System.out.println();
}
System.out.println("Мінімальне значення: " + Min);
System.out.println("Максимальне значення: " + Max);
}

}