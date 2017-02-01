package ru.kbadashvlili.part5;

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
 		final int one = 1;
 		final int two = 2;
 		final int three = 3;
 		final int four = 4;
 		final int five = 5;
 		final int six = 6;
 		final int seven = 7;
 		final int eight = 8;
 		final int nine = 9;

 		final int[][] array = new int[][]{
                {one, two, three},
                {four, five, six},
                {seven, eight, nine},
        };
        int[][] arrayresult = new int[][]{
                {seven, four, one},
                {eight, five, two},
                {nine, six, three},
        };
        TwoDimArray turner = new TwoDimArray();
        assertThat(turner.turn(array), is(arrayresult));
 	}
 }