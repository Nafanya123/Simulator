package com.netcracker.Task1;

import com.netcracker.Task1.MySecondClass;
import com.netcracker.Task2.ArrayVector;

import java.util.Arrays;

class MyFirstClass {

    public static void main(String[] s) {
        MySecondClass msc = new MySecondClass();
        ArrayVector av = new ArrayVector(new double[]{50.5, 1.5, 0.2, 22.8, 1.6, 66.6});
        for(int i = 1; i < 8; i++)
        {
            for(int j = 1; j <= 8; j++)
            {
                msc.a = i;
                msc.b = j;
                System.out.print(msc.summa());
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        //sortNumbers();
        av.sum(new double[] {0.5, 1.4, 3.3});

    }

    public static void sortNumbers()
    {
        int[] numbers = new int[]
                {
                    2,
                    22,
                    5,
                    63,
                    3,
                    15
                };

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = numbers.length - 1; j > i; j--)
            {
                if(numbers[j] < numbers[j - 1])
                {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tmp;
                }
            }
            System.out.println(numbers[i]);
        }

    }
}

