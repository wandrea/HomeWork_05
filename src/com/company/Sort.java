package com.company;

/**
 * Created by Andrea on 2017.12.14..
 */
public class Sort implements ISort {
    @Override
    public void bubbleSort(int[] array) {
        //mivel az UML-ben csak egy tömb a bemeneti paraméter, így  nem volt
        //egyértelmûsítve, hogy csökkenõ vagy növekvõ sorrendbe rendezze,
        //ezért úgy döntöttem, hogy alapértelmezetten növekvõ rendezés lesz.

        for (int i = array.length - 1; i >= 1; i--) {
//a swaps változó érték, ha az if feltétel érvényesül változik, ha nem akkor marad 0, így ha nem kellett cserélni
// a tömbben az elemeket akkor leáll a for ciklus, nem kell végigmennie az összes elemen.
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
