package com.company;

import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {

        //объявление и заполнение одномерного массива e
        int[] e = new int[7];
        int n = 3;
        for (int i = 0; i < 7; i++) {

            e[i] = n;
            n += 2;

        }


        //объявление и заполнение одномерного массива x
        float x[] = new float[13];
        for (int i = 0; i < 13; i++) {

            x[i] = (float) ((random() * (6.0 + 9.0)) - 9.0);

        }


        //объявление и заполнение двумерного массива c
        float[][] c = new float[7][13];
        for (int i = 0; i < 7; i++)
            for (int j = 0; j < 13; j++)
                if (e[i] == 9) {

                    c[i][j] = (float) tan(pow(sin(x[j]) / (log(abs(x[j])) - 2), cos(x[j])));

                } else if(e[i] == 3 || e[i] == 7 || e[i] == 11) {

                    c[i][j] = (float) pow(E, pow(pow((x[j] * (x[j] + 0.75)), 3), log(abs(x[j])) * (tan(x[j]) - 0.5)));

                } else {

                    c[i][j] = (float) pow(0.25 / (pow(3.0 / (2.0 * pow(E, x[j])), 3) + 1), cos(asin(pow((x[j] - 1.5) / 15.0, 2))));

                }


        // вывод двумерного массива в формате с 3 знаками после запятой
        for(int i = 0; i < 7; i++) {

            for (int j = 0; j < 13; j++) {

                System.out.printf("%18.3f", c[i][j]);

            }

            System.out.println();

        }

    }

}
