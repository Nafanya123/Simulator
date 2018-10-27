package com.netcracker.Task2;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Map;

/**
 * Created by tt506619 on 12.10.18.
 */
public class ArrayVector {



    double[] elements = null;


    public double[] getElement() {
        return elements;
    }

    public void setElement(double[] x) {
        this.elements = x;
    }
    public ArrayVector(double[] x)
    {
        setElement(x);
    }

    public double getSize()
    {
        System.out.println(elements.length);
        return elements.length;
    }
    public double min()
    {
        double min = elements[0];
        for(int i = 0; i < elements.length; i++)
        {
            if(elements[i] < min)
            {
                min = elements[i];
            }

        }
        System.out.println(min);
        return min;
    }

    public double max()
    {
        double max = elements[0];
        for(int i = 0; i < elements.length; i++)
        {
            if(elements[i] > max)
            {
                max = elements[i];
            }
        }
        System.out.println(max);
        return max;
    }

    public void sort()
    {
        for(int i = 0; i < elements.length; i++)
        {
            for(int j = elements.length - 1; j > i; j--)
            {
                if(elements[j] < elements[j - 1])
                {
                    double tmp = elements[j];
                    elements[j] = elements[j - 1];
                    elements[j - 1] = tmp;
                }
            }
            System.out.println(elements[i]);
        }

    }
    public double getNorm()
    {
        double norm;
        double sum = 0;
        for(int i = 0; i < elements.length; i++)
        {
            sum += elements[i] * elements[i];
        }
        norm = Math.sqrt(sum);
        System.out.println(norm);
        return norm;
    }
    public void mult(double number)
    {
        for(int i = 0; i < elements.length; i++)
        {
            elements[i] = elements[i] * number;
        }
    }
    public double sum(double[] numbers)
    {
        double sum = 0;
        for(int i = 0; i < elements.length; i++)
        {
                sum += elements[i] + numbers[i];
        }
        System.out.println(sum);
        return sum;
    }
}
