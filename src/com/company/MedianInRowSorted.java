package com.company;
import java.util.*;

class CalculateMedian {

    // Função para calcular a mediana
    public static double findMedian(int a[], int n)
    {
        // Ordenando o array
        Arrays.sort(a);

        // Verificando caso a caso
        if (n % 2 != 0)
            return (double)a[n / 2];

        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }

    public static void main(String args[])
    {
        int a[] = { 9, 2, 1, 4, 6 };
        int n = a.length;
        System.out.println("Mediana = " + findMedian(a, n));
    }
}