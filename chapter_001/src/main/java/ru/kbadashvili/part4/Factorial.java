package ru.kbadashvlili.part4;

import java.math.BigInteger;

 /**
 * Программа вычисляющая факториал.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class Factorial {
 	 	/**
 	* @param n - чилсо для вычисления факториала.
 	* @return bigresult - факториал.
 	*/
 	public static BigInteger find(int n) {
        //add your code here
        BigInteger bigresult = BigInteger.valueOf((long) 1);
        for (long i = 1; i <= n; i++) {
            bigresult = bigresult.multiply(BigInteger.valueOf(i));
        }
        return bigresult;
    }
 }