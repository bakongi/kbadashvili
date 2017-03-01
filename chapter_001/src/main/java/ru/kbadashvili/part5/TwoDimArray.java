package ru.kbadashvili.part5;

 /**
 * Перевернуть массив.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class TwoDimArray {
 	/**
 	* @param array - 2D array.
 	* @return array - массив.
 	*/
 	public int[][] turn(int[][] array) {
 		int[][] temp = new int[array[0].length][array[1].length];

        int num = 0;
        for (int i = 0; i < array[1].length; i++) {
            for (int j = array[0].length - 1; j >= 0; j--) {
                temp[i][num++] = array[j][i];
            }
            num = 0;
        }
        return temp;
 	}
 }