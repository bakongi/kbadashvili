package ru.kbadashvili.part5;

import java.util.Arrays;

 /**
 * Удалить дубликаты.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class DuplicateRemover {
 	/**
 	* @param array - String array.
 	* @return array - массив.
 	*/
 	public String[] remove(String[] array) {

 		int endOfArray = array.length - 1;
        for (int i = 0; i <= endOfArray; i++) {
            for (int j = i + 1; j <= endOfArray; j++) {
                if (array[i].equals(array[j])) {
                    for (int k = j; k < endOfArray; k++) {
                        array[k] = array[k + 1];
                    }
                    endOfArray--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, endOfArray + 1);
 	}
 }