/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author 1710532
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Функція з заданими параметрами");
        System.out.println("2.Функція з віпадковими параметрами");
        double a = -3, b = 4, c = 1.2, x = 0.5;
        double y1, y2;
        y1 = function(a, b, c, x);
        switch (scan.nextInt()) {
            case 1:
                System.out.println("y = " + y1);
                break;
            case 2:
                System.out.print("Input a minimum: ");
                int min = scan.nextInt();
                System.out.print("Input a maximum: ");
                int max = scan.nextInt();
                double aa = Math.random() * (max - min) + min;
                double bb = Math.random() * (max - min) + min;
                double cc = Math.random() * (max - min) + min;
                while(cc==0){
                    cc = Math.random() * (max - min) + min;
                }
                double xx = Math.random() * (max - min) + min;
                while (x==-c){
                    xx = Math.random() * (max - min) + min;
                }
                y2 = function(aa, bb, cc, xx);
                System.out.println("y = " + y2);
                break;
        }
    }

    static double function(double a, double b, double x, double c) {
        return Math.exp(Math.cbrt((a * Math.pow(x, 2) - b) / (c + x))) + (Math.cos(a * x) / Math.exp((x + b) / c));
    }

}
