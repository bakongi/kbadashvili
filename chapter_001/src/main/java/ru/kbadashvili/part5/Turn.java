package ru.kbadashvlili.part5;

 /**
 * Перевернуть массив.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class Turn {
 	/**
 	* @param array - array.
 	* @return array - массив.
 	*/
 	public int[] back(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            int r = array.length - 1 - i;
            array[i] = array[r];
            array[r] = temp;
        }
         return array;
 	}
 }