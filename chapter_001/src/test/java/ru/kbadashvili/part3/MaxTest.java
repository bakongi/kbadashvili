package ru.kbadashvili.part3;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

 /**
 * Тест.
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

 	/**
 	*/
 	@Test
 	public void testMaxOfThreeNumbers() {
 		final int end = 10;
 		int second;
 		int third;
 		int first;
 		Max max = new Max();
 		int result;
 		for (int i = 1; i < end; i++) {
 			second = ++i;
 			third = ++second;
 			result = max.max(i, second, third);
 			assertThat(result, is(third));
 		}

 		for (int i = 1; i < end; i++) {
 			first = ++i;
 			third = ++first;
 			result = max.max(first, third, i);
 			assertThat(result, is(third));
 		}

 		for (int i = 1; i < end; i++) {
 			second = ++i;
 			third = ++second;
 			result = max.max(third, second, i);
 			assertThat(result, is(third));
 		}
 	}
 }