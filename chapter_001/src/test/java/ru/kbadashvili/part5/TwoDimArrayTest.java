package ru.kbadashvili.part5;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * 5.1. Создать программу для сортировки массива методов перестановки.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class TwoDimArrayTest {
 	/**
 	*
 	*/
 	@Test
 	public void ninetyDegreeTurnTest() {

 		final int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] arrayresult = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3},
        };
        TwoDimArray turner = new TwoDimArray();
        assertThat(turner.turn(array), is(arrayresult));
 	}
 }