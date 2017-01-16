package ru.kbadashvlili.part3;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * Ппрограмма вычисления площади треугольника.
 * @author Konstantin Badashvili (bakongi@protonmail.com)
 * @version $Id$
 * @since 2017
 */
 public class MaxTest {

 	/**
 	*/
 	@Test
 	public void testMaxOfTwoNumbers() {
 		final int end = 10;
 		Max max = new Max();
 		int result;
 		for (int i = 1; i < end; i++) {
 			int second = i + 1;
 			result = max.max(i, second);
 			assertThat(result, is(second));
 		}

 		for (int i = 1; i < end; i++) {
 			int first = i + 1;
 			result = max.max(first, i);
 			assertThat(result, is(first));
 		}
 	}
 }