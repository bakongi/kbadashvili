package ru.kbadashvili.part5;

 /**
 * 5.1. Создать программу для сортировки массива методов перестановки.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class Sort {
 	 	/**
 	* @param array - array.
 	* @return array - массив.
 	*/
 	public int[] bubble(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
        	for (int j = 1; j < array.length - i; j++) {
        		if (array[j - 1] > array[j]) {
        			temp = array[j - 1];
        			array[j - 1] = array[j];
        			array[j] = temp;
        		}
        	}
        }
        return array;
 	}
 }