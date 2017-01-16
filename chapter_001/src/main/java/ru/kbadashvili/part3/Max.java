package ru.kbadashvlili.part3;

 /**
 * Тест.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class Max {

 	/**
 	* @param first - first.
 	* @param second - second.
 	* @return result - возвращает максимально из двух чисел.
 	*/
 	public int max(int first, int second) {
 		int result;
 		result = first >= second ? first : second;
 		return result;
 	}
 }