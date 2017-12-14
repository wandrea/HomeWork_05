package com.company;

/**
 * Created by Andrea on 2017.12.14..
 */
public class Sort implements ISort {
    @Override
    public void bubbleSort(int[] array) {
        //mivel az UML-ben csak egy t�mb a bemeneti param�ter, �gy  nem volt
        //egy�rtelm�s�tve, hogy cs�kken� vagy n�vekv� sorrendbe rendezze,
        //ez�rt �gy d�nt�ttem, hogy alap�rtelmezetten n�vekv� rendez�s lesz.

        for (int i = array.length - 1; i >= 1; i--) {
//a swaps v�ltoz� �rt�k, ha az if felt�tel �rv�nyes�l v�ltozik, ha nem akkor marad 0, �gy ha nem kellett cser�lni
// a t�mbben az elemeket akkor le�ll a for ciklus, nem kell v�gigmennie az �sszes elemen.
            int swaps = 0;

            for (int j = 0; j <= i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                   ++swaps;
                }
            }

            if (swaps == 0) {
               break;}
        }
    }

    @Override
    public void insertionSort(int[] array) {

    }

    @Override
    public void selectionSort(int[] array) {

    }

    @Override
    public void mergeSort(int[] array) {

    }

    @Override
    public void quickSort(int[] array) {

    }


}
