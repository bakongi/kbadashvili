package ru.kbadashvlili.part3;

 /**
 * Максимум из двух чисел.
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

 	/**
 	* @param first - first.
 	* @param second - second.
 	* @param third - third.
 	* @return result - возвращает максимально из двух чисел.
 	*/
 	public int max(int first, int second, int third) {
 		return this.max(this.max(first, second), this.max(second, third));
 	}
 }