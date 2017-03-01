package ru.kbadashvili.part4;

 /**
 * Подсчет суммы в диапозоне.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class Counter {
 	/**
 	* @param start - от.
 	* @param finish - до.
 	* @return num - сумма четных чисел в диапазоне.
 	*/
 	public int add(int start, int finish) {
 		int num = 0;
 		for (int i = start; i <= finish; i++) {
 			if (i % 2 == 0) {
 				num += i;
 			}
 		}
 		return num;
 	}
 }